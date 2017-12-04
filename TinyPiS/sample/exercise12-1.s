.section .data
@ 大域変数の定義
_Pi_var_x:
.word 0
_Pi_var_y:
.word 0
_Pi_var_answer:
.word 0
.section .text
.global _start
_start:
@ 式をコンパイルした命令列
ldr r0, =#15
ldr r1, =_Pi_var_x
str r0, [r1, #0]
ldr r0, =_Pi_var_x
ldr r0, [r0, #0]
cmp r0, #0
beq L0
ldr r0, =_Pi_var_x
ldr r0, [r0, #0]
str r1, [sp, #-4]!
mov r1, r0
ldr r0, =#5
sub r0, r1, r0
ldr r1, [sp], #4
ldr r1, =_Pi_var_x
str r0, [r1, #0]
b L1
L0:
ldr r0, =#128
ldr r1, =_Pi_var_y
str r0, [r1, #0]
L1:
ldr r0, =#1
mvn r0, r0
add r0, r0, #1
ldr r1, =_Pi_var_y
str r0, [r1, #0]
ldr r0, =_Pi_var_y
ldr r0, [r0, #0]
ldr r1, =_Pi_var_answer
str r0, [r1, #0]
@ EXIT システムコール
ldr r0, =_Pi_var_answer
ldr r0, [r0, #0]
mov r7, #1
swi #0
