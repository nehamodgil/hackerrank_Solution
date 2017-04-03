#!/bin/bash
read a
read b
read c
if (( a == b )) || (( c == b)) || (( a == c))
then
if(( a == b)) && (( a == c )) && (( b == c )); then echo "EQUILATERAL"
else echo "ISOSCELES"
fi
else echo "SCALENE"
fi
