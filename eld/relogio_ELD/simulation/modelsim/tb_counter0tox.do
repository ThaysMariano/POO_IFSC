vlib rtl_work
vmap work rtl_work
vcom -93 -work work {../../counter0tox.vhd}
vsim work.counter0tox

add wave -position end  sim:/counter0tox/clk
add wave -position end  sim:/counter0tox/reset
add wave -position end -radix unsigned sim:/counter0tox/dezena
add wave -position end  -radix unsigned sim:/counter0tox/unidade

force -freeze sim:/counter0tox/clk 1 0, 0 {50 ps} -r 100
force -freeze sim:/counter0tox/reset 1 0, 0 20

run 7000