.section .data
buf:    .space 8
.byte    0x0a
@ 大域変数の定義
_Pi_var_x:
.word 0
_Pi_var_answer:
.word 0
.section .text
.global _start
_start:
@ 式をコンパイルした命令列
ldr r0, =#10
ldr r1, =_Pi_var_x
str r0, [r1, #0]
ldr r0, =_Pi_var_x
ldr r0, [r0, #0]
@-----print-----
str r7, [sp, #-4]!
str r3, [sp, #-4]!
str r2, [sp, #-4]!
str r1, [sp, #-4]!
str r0, [sp, #-4]!
ldr r3, =buf
add r1, r3, #8
L0:
str r0, [sp, #-4]!
and r0, r0, #15
cmp r0, #10
addcc r0, r0, #48
addcs r0, r0, #55
strb r0, [r1], #-1
ldr r0, [sp], #4
mov r0, r0, lsr #4
cmp r1, r3
bhi L0
mov r0, #1
mov r2, #9
mov r7, #4
swi #0
ldr r0, [sp], #4
ldr r1, [sp], #4
ldr r2, [sp], #4
ldr r3, [sp], #4
ldr r7, [sp], #4
@-----print-----
ldr r0, =#5
ldr r1, =_Pi_var_x
str r0, [r1, #0]
ldr r0, =_Pi_var_x
ldr r0, [r0, #0]
@-----print-----
str r7, [sp, #-4]!
str r3, [sp, #-4]!
str r2, [sp, #-4]!
str r1, [sp, #-4]!
str r0, [sp, #-4]!
ldr r3, =buf
add r1, r3, #8
L1:
str r0, [sp, #-4]!
and r0, r0, #15
cmp r0, #10
addcc r0, r0, #48
addcs r0, r0, #55
strb r0, [r1], #-1
ldr r0, [sp], #4
mov r0, r0, lsr #4
cmp r1, r3
bhi L1
mov r0, #1
mov r2, #9
mov r7, #4
swi #0
ldr r0, [sp], #4
ldr r1, [sp], #4
ldr r2, [sp], #4
ldr r3, [sp], #4
ldr r7, [sp], #4
@-----print-----
@ EXIT システムコール
ldr r0, =_Pi_var_answer
ldr r0, [r0, #0]
mov r7, #1
swi #0
