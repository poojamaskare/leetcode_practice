# Write your MySQL query statement below
select c.name as customers 
from customers c
left join orders o
on c.id=o.id 
where c.id not in (select customerId from orders)
#group by c.name