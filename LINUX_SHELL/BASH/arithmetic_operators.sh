#!/bin/bash
read expression
printf "%.3f" $(echo "scale = 4; $expression" | bc);
