@ N という名前の名前付き定数を定義し，N の値を10進数で端末画面（正確には標準出力）に出力するアセンブリ言語プログラム
.section .text
.global  _start
.equ    N, 123456789          @ N
.equ    size, 20
_start:@6
@ /////出力設定、準備///////////////////////////////////
mov    r0, #1        @ writeの出力先を指定
ldr    r1, =buf+size    @ 文字列の最後尾番地を指定    
mov    r2, #1
ldr    r3, =N        @ 出力する値Nの読み込み
mov    r7, #4        @ writeシステムコール番号
mov    r10, #10    @ 値10
write_loop:@8
udiv    r4, r3, r10    @ 10で割って1桁目を取り出す
mul    r5, r4, r10    @ 商と割る数をかけて、「割られる数-余り」の値を取り出す
sub    r6, r3, r5    @ 下一桁を求める
add    r6, #'0'    @ 入力する値を文字化させる
strb    r6, [r1,#-1]!    @ 文字を格納、次に使う座標を左にずらす
add    r2, r2, #1    @ 最後に(Carryフラグが立ってる時)さらに改行分1を足す
movs    r3, r4        @ 次の判定用に値を入れ替える
swieq    #0        @ write&exitコール
moveq    r7, #1        @ exitシステムコール番号
b    write_loop    @ loop
write_end:@1

exit:@2



.section .data
buf:    .space size        @ size文字分の領域
.ascii "\n"        @ 改行
