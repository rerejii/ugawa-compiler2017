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
z:
	@ prologue
	str r11, [sp, #-4]!
	mov r11, sp
	str r14, [sp, #-4]!
	str r1, [sp, #-4]!
	str r2, [sp, #-4]!
	str r3, [sp, #-4]!
	str r7, [sp, #-4]!
	sub sp, sp, #0
	ldr r0, [r11, #4]
	str r1, [sp, #-4]!
	mov r1, r0
	ldr r0, [r11, #8]
	add r0, r1, r0
	ldr r1, [sp], #4
	str r1, [sp, #-4]!
	mov r1, r0
	ldr r0, =#1
	add r0, r1, r0
	ldr r1, [sp], #4
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
	ldr r0, =#1
	str r0, [sp, #-4]!
	ldr r0, =#2
	str r0, [sp, #-4]!
	bl z
	add sp, sp, #8
	b L1
	mov r0, #0
	@ epilogue
L1:
	add sp, sp, #0
	ldr r7, [sp], #4
	ldr r3, [sp], #4
	ldr r2, [sp], #4
	ldr r1, [sp], #4
	ldr r14, [sp], #4
	ldr r11, [sp], #4
	bx r14
