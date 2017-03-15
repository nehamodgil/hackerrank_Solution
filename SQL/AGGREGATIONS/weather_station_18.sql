select round(abs(max(LAT_N)-min(LAT_N)),4) + round(abs(max(LONG_W) - min(LONG_W)),4) from station;
