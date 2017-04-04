#!/bin/bash
i=0
while read input
do
array[$i]=$input
((i++))
done
echo ${array[@]/*[a|A]*/}
