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
	ldr r0, =#0
	cmp r0, #0
	beq L1
	ldr r0, =#1
	b L0
	b L2
L1:
	ldr r0, =#2
	b L0
L2:
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
