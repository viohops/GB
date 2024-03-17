-- Вывести таблицу со столбцами в следующем порядке: city, sname, snum, comm.

SELECT city, sname, snum, comm
FROM first_table
UNION ALL
SELECT city, sname, snum, comm
FROM second_table;

-- Вывести оценку (rating), сопровождаемую именем каждого 
-- заказчика в городе San Jose (заказчики).

SELECT c.name AS customer_name, o.rating
FROM customers c
JOIN orders o ON c.cust_id = o.cust_id
WHERE c.city = 'San Jose';


-- Вывести уникальные значения snum всех продавцов из таблицы заказов (Продавцы).

SELECT DISTINCT snum
FROM orders;


-- Выбрать заказчиков, чьи имена начинаются с буквы G (заказчики).

SELECT *
FROM customers
WHERE name LIKE 'G%';


-- Вывести все заказы со значениями суммы выше чем $1,000 (Заказы, amt - сумма).

SELECT *
FROM orders
WHERE amt > 1000;


-- Выбрать наименьшую сумму заказа из поля "amt" (сумма) в таблице "Заказы".

SELECT MIN(amt) AS smallest_amt
FROM orders;


-- Выбрать всех заказчиков, у которых рейтинг больше 100 и они находятся не в Риме (Заказчики).

SELECT *
FROM customers
WHERE rating > 100 AND city <> 'Rome';


-- По таблице staff:

-- Отсортировать поле "зарплата" в порядке убывания и возрастания.

-- По убыванию
SELECT *
FROM staff
ORDER BY salary DESC;

-- По возрастанию
SELECT *
FROM staff
ORDER BY salary ASC;


-- Отсортировать по возрастанию поле "Зарплата" и вывести 5 строк с наибольшей заработной платой.

SELECT *
FROM staff
ORDER BY salary ASC
LIMIT 5;


-- Выполнить группировку всех сотрудников по специальности, суммарная зарплата которых превышает 100,000.

SELECT specialty, SUM(salary) AS total_salary
FROM staff
GROUP BY specialty
HAVING total_salary > 100000;
