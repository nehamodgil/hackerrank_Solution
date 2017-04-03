#!/bin/bash
read N
sum=0
for i in $(seq 1 $N); do
    read number
    sum=$((sum+number ))

done

printf "%.3f\n" `echo "$sum / $N" | bc -l`
