select round(sqrt(round(abs(power((max(LAT_N)-min(LAT_N)), 2)), 4) + round(abs(power((max(LONG_W)-min(LONG_W)), 2)), 4)), 4) from station;
