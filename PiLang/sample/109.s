.section .data
buf:    .space 8
.byte    0x0a
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
sub sp, sp, #16
ldr r0, =#1
str r0, [r11, #-24]
ldr r0, =#2
str r0, [r11, #-28]
ldr r0, =#4
str r0, [r11, #-32]
ldr r0, =#8
str r0, [r11, #-36]
ldr r0, [r11, #-24]
str r1, [sp, #-4]!
mov r1, r0
ldr r0, [r11, #-28]
add r0, r1, r0
ldr r1, [sp], #4
str r1, [sp, #-4]!
mov r1, r0
ldr r0, [r11, #-32]
add r0, r1, r0
ldr r1, [sp], #4
str r1, [sp, #-4]!
mov r1, r0
ldr r0, [r11, #-36]
add r0, r1, r0
ldr r1, [sp], #4
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
ldr r0, [r11, #-24]
str r1, [sp, #-4]!
mov r1, r0
ldr r0, [r11, #-28]
add r0, r1, r0
ldr r1, [sp], #4
str r1, [sp, #-4]!
mov r1, r0
ldr r0, [r11, #-32]
add r0, r1, r0
ldr r1, [sp], #4
str r1, [sp, #-4]!
mov r1, r0
ldr r0, [r11, #-36]
add r0, r1, r0
ldr r1, [sp], #4
b L0
mov r0, #0
@ epilogue
L0:
add sp, sp, #16
ldr r7, [sp], #4
ldr r3, [sp], #4
ldr r2, [sp], #4
ldr r1, [sp], #4
ldr r14, [sp], #4
ldr r11, [sp], #4
bx r14

