select * from hr.departments;

select department_name from hr.departments;

select first_name, salary, salary /12 as Monthly, salary/(12*20) as Daily, salary / (12*20*24) as Hourly from hr.employees;

select first_name, concat(email ,'@mail.somecompany.com') as 'Email' from hr.employees; 

select distinct salary from hr.employees;

select department_name from hr.departments
union
select region_name from hr.regions
union
select country_name from hr.countries
union
select city from hr.locations;

select * from hr.employees
where job_id = 'AC_MGR';

select first_name from hr.employees
where first_name like 'Sa%';

select last_name from hr.employees
where last_name like '%ei%';

select first_name from hr.employees
where salary between 3000 and 5000;

select first_name from hr.employees
where (salary between 2000 and 5000) or (salary between 10000 and 15000);

select first_name from hr.employees
where salary in(2500,4000,5000);

select city from hr.locations
where (state_province is null) or (postal_code is null);

select first_name, last_name, salary from hr.employees
where salary > 10000
order by salary desc; 

SELECT first_name FROM hr.employees
order by hire_date asc;

select department_name, city
from hr.departments natural join hr.locations;

select department_name, city
from hr.departments join hr.locations
using (location_id);

select department_name, city
from hr.departments d join hr.locations l
on (d.location_id = l.location_id );

select department_name, city, first_name as 'Manager'
from hr.departments d join hr.locations l 
on (d.location_id = l.location_id ) 
join hr.employees e
on (d.manager_id = e.employee_id);

select department_name , city
from hr.departments d left outer join hr.locations l
on (d.location_id = l.location_id);

select department_name , city
from hr.departments d right outer join hr.locations l
on (d.location_id = l.location_id);

select first_name ,last_name ,department_name ,city
from hr.employees e 
join hr.departments d on(e.employee_id = d.manager_id)
join hr.locations l on(d.location_id = l.location_id);

select first_name, last_name
from hr.employees e  
join hr.departments d on (e.department_id = d.department_id)
where d.department_id = 80 or d.department_id = 100
and e.hire_date between ('1995-01-01' and '2000-12-01');

select first_name , last_name
from hr.employees e
join hr.job_history j on (e.employee_id = j.employee_id)
where j.department_id = 80;

select concat(e.first_name, ' ' , e.last_name , ' is maneged by ' , m.first_name ,  ' ' ,m.last_name) as MSG
from hr.employees e 
join hr.employees m on(e.manager_id = m.employee_id); 

select e.first_name,a.last_name
from hr.employees e cross join hr.employees a;

select e.first_name, j.job_title, d.department_name, l.city, c.country_name, r.region_name
from hr.employees e
join hr.jobs j on(e.job_id = j.job_id)
join hr.departments d on (e.department_id = d.department_id)
join hr.locations l on (d.location_id = l.location_id)
join hr.countries c on (l.country_id = c.country_id)
join hr.regions r on (c.region_id = r.region_id);

select e.first_name,m.first_name as 'manager', j.job_title, d.department_name, l.city, c.country_name, r.region_name
from hr.employees e
join hr.employees m on (e.manager_id = m.employee_id)
join hr.jobs j on(e.job_id = j.job_id)
join hr.departments d on (e.department_id = d.department_id)
join hr.locations l on (d.location_id = l.location_id)
join hr.countries c on (l.country_id = c.country_id)
join hr.regions r on (c.region_id = r.region_id);




