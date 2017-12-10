.section .data
_print_buf:
.space 9
.ascii "\n"
@ 大域変数の定義
.section .text
.global _start
_start:
@ main関数を呼出す．戻り値は r0 に入る
bl main
@ EXITシステムコール
mov r7, #1
swi #0
mov r0, #0
main:
@ prologue
str r11, [sp, #-4]!
mov r11, sp
str r14, [sp, #-4]!
str r1, [sp, #-4]!
str r2, [sp, #-4]!
str r3, [sp, #-4]!
str r7, [sp, #-4]!
sub sp, sp, #0
ldr r0, =#100
@-----print-----
str r7, [sp, #-4]!
str r3, [sp, #-4]!
str r2, [sp, #-4]!
str r1, [sp, #-4]!
str r0, [sp, #-4]!
ldr r1, =_print_buf
mov r3, r1
add r1, #8
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
mov r7, #4
mov r0, #1
mov r2, #10
swi #0
ldr r0, [sp], #4
ldr r1, [sp], #4
ldr r2, [sp], #4
ldr r3, [sp], #4
ldr r7, [sp], #4
@-----print-----
ldr r0, =#1
str r1, [sp, #-4]!
mov r1, r0
ldr r0, =#2
add r0, r1, r0
ldr r1, [sp], #4
@-----print-----
str r7, [sp, #-4]!
str r3, [sp, #-4]!
str r2, [sp, #-4]!
str r1, [sp, #-4]!
str r0, [sp, #-4]!
ldr r1, =_print_buf
mov r3, r1
add r1, #8
L2:
str r0, [sp, #-4]!
and r0, r0, #15
cmp r0, #10
addcc r0, r0, #48
addcs r0, r0, #55
strb r0, [r1], #-1
ldr r0, [sp], #4
mov r0, r0, lsr #4
cmp r1, r3
bhi L2
mov r7, #4
mov r0, #1
mov r2, #10
swi #0
ldr r0, [sp], #4
ldr r1, [sp], #4
ldr r2, [sp], #4
ldr r3, [sp], #4
ldr r7, [sp], #4
@-----print-----
ldr r0, =#0
b L0
mov r0, #0
@ epilogue
L0:
add sp, sp, #0
ldr r7, [sp], #4
ldr r3, [sp], #4
ldr r2, [sp], #4
ldr r1, [sp], #4
ldr r14, [sp], #4
ldr r11, [sp], #4
bx r14
