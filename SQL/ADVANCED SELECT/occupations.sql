set @d=0, @a=0, @p=0, @s=0;
select MIN(Doctor),MIN(Professor),MIN(Singer),MIN(Actor)
from
(select if(OCCUPATION='Actor',Name,NULL) as Actor,
        if(OCCUPATION='Doctor',Name,NULL) as Doctor,
        if(OCCUPATION='Professor',Name,null) as Professor,
        if(OCCUPATION='Singer',Name,null) as Singer,
 case OCCUPATION
    when 'Actor' then @a:=@a+1
    when 'Doctor' then @d:=@d+1
    when 'Professor' then @p:=@p+1
    when 'Singer' then @s:=@s+1
 end
as idn from OCCUPATIONS order by NAME )
as temp group by temp.idn;
