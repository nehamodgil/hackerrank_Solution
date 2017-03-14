select c.Company_Code, c.founder,
    count(distinct e.Lead_Manager_Code),
    count(distinct e.Senior_Manager_Code),
    count(distinct e.Manager_Code),
    count(distinct e.Employee_Code)
from Company c
JOIN Employee e on c.Company_Code = e.Company_Code group by c.Company_Code, c.founder order by c.Company_Code;
