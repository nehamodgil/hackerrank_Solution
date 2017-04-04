#!/bin/bash
read number
read input
i=0
for i in $input; do
    array=$((array^i))
done
echo "$array"
