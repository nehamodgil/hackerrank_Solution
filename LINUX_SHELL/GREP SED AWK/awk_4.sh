#!/bin/bash
awk 'ORS=NR%2?";":"\n"'

#OR

paste - - -d ';'
