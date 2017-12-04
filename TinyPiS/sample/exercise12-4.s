.section .data
@ 大域変数の定義
_Pi_var__111:
.word 0
_Pi_var_answer:
.word 0
.section .text
.global _start
_start:
@ 式をコンパイルした命令列
ldr r0, =#10
ldr r1, =_Pi_var__111
str r0, [r1, #0]
ldr r0, =_Pi_var__111
ldr r0, [r0, #0]
mvn r0, r0
ldr r1, =_Pi_var__111
str r0, [r1, #0]
ldr r0, =_Pi_var__111
ldr r0, [r0, #0]
ldr r1, =_Pi_var_answer
str r0, [r1, #0]
@ EXIT システムコール
ldr r0, =_Pi_var_answer
ldr r0, [r0, #0]
mov r7, #1
swi #0
