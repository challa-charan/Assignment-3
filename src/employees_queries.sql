CREATE TABLE employees (
                           id INT PRIMARY KEY AUTO_INCREMENT,
                           name VARCHAR(100),
                           salary DECIMAL(10,2),
                           joining_date DATE
);

SELECT *
FROM employees
WHERE name LIKE 'A%';

SELECT AVG(salary) AS average_salary
FROM employees;

SELECT id, name, salary, DATE_FORMAT(joining_date, '%Y-%m-%d') AS formatted_date1
FROM employees;

SELECT id, name, salary, DATE_FORMAT(joining_date, '%M %d, %Y') AS formatted_date2
FROM employees;

SELECT id, name, salary, DATE_FORMAT(joining_date, '%d/%m/%Y') AS formatted_date3
FROM employees;