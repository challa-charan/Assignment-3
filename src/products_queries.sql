CREATE TABLE products (
                          id INT PRIMARY KEY AUTO_INCREMENT,
                          name VARCHAR(100),
                          price DECIMAL(10,2),
                          quantity INT
);

UPDATE products
SET price = price * 1.10;

DELETE FROM products
WHERE quantity = 0;

SELECT *
FROM products
WHERE price BETWEEN 100 AND 500;