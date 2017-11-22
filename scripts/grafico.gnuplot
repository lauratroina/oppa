set terminal png size 1024, 768
set output "grafico.png"
set grid
plot "resultado.txt" using 1:2 with lines title "melhor", "resultado.txt" using 1:3 with lines title "maior", "resultado.txt" using 1:4 with lines title "pior", "resultado.txt" using 1:5 with lines title "medio"

