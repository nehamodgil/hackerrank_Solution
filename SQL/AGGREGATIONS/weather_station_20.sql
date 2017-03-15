select round(x.LAT_N, 4) from station x, station y group by x.LAT_N having sum(sign(1-sign(y.LAT_N - x.LAT_N)))/count(*) > .5 limit 1
