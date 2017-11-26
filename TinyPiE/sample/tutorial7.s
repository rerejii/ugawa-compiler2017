    .section .data
    @ 大域変数の定義
_Pi_var_x:
    .word 1
_Pi_var_y:
    .word 10
_Pi_var_z:
    .word -1
    .section .text
    .global _start
_start:
    @ 式をコンパイルした命令列
    @ x読み込み
    ldr r0, =_Pi_var_x
    ldr r0, [r0, #0]
    @ r1スタック
    str r1, [sp, #-4]!
    mov r1, r0
    @ y読み込み
    ldr r0, =_Pi_var_y
    ldr r0, [r0, #0]
    @ 掛け算
    mul r0, r1, r0
    @ 答え退避
    mov r1, r0
    @ 5読み込み
    ldr r0, =#5
    @ r1スタック
    str r1, [sp, #-4]!
    mov r1, r0
    @ z読み込み
    ldr r0, =_Pi_var_z
    ldr r0, [r0, #0]
    @ 掛け算
    mul r0, r1, r0
    @ r1復帰
    ldr r1, [sp], #4
    @ 引き算
    sub r0, r1, r0
    @ r1復帰
    ldr r1, [sp], #4
    @ EXITシステムコールを発行
    mov r7, #1
    swi #0
    
