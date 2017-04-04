#!/bin/bash
array=(`cat -`)
array=("${array[@]}" "${array[@]}" "${array[@]}")
echo "${array[@]}"
