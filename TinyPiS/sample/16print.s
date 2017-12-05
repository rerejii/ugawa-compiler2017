

.section .text
.global _start
_start:
ldr r3, =buf
str r1, [sp, #-4]! @ push
add r1, r3, #8
str r2, [sp, #-4]! @ push
mov r2, #15
ldr r0, =#20
loop:
str r0, [sp, #-4]! @ push
and r0, r2, r0 @16進数1桁
cmp r0, #10
addcc r0, r0, #'0'    @ 入力する値を文字化させる
addcs r0, r0, #'A'-8
strb r0, [r1], #-1 @bufにスタック
ldr r0, [sp], #4
mov r0, r0, lsr #4
cmp r1, r3
bhi loop
mov    r0, #1        @ writeの出力先を指定
mov    r2, #9        @ 出力すう
mov    r7, #4        @ writeシステムコール番号
swi    #0            @ writeコール
ldr r2, [sp], #4
ldr r1, [sp], #4
ldr r3, [sp], #4
mov r7, #1        @ exitシステムコール番号
swi    #0            @ writeコール

.section .data
buf:    .space 8        @ size文字分の領域
.byte    0x0a       @ 改行
