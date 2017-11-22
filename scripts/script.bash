#!/bin/bash
sed -i -e "s/\t/ /g" -e "s/,/./g" $1
n=`tail -n 1 $1 | cut -d " " -f 1`
for i in `seq 1 $n`
do
	grep "^$i " $1 > tmp.txt
	m=( )
	for j in 1 2 3 4 5
	do
		m[$j]=`cut -d " " -f $j tmp.txt | paste -s -d "+" | bc`
		m[$j]=`echo "scale=5;${m[$j]}/10" | bc`
	done
	echo ${m[*]}
done > resultado.txt
rm tmp.txt
gnuplot grafico.gnuplot

