select case
    when Grades.Grade < 8 then NULL
    else
    Students.Name
    end as Name, Grades.Grade, Students.Marks
from Students inner join Grades on Students.Marks between Grades.Min_Mark and Max_Mark
order by Grades.Grade desc, Students.Name;
