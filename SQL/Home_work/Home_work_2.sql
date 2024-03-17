-- Используя операторы языка SQL, создайте табличку “sales”. Заполните ее данными
-- Сгруппируйте значений количества в 3 сегмента — меньше 100, 100-300 и больше 300.
-- Создайте таблицу “orders”, заполните ее значениями. Покажите “полный” статус заказа, используя оператор CASE
-- Чем NULL отличается от 0?

-- Создайте таблицу "sales" и заполните ее данными:

CREATE TABLE sales (
    product_id INT PRIMARY KEY,
    product_name VARCHAR(255),
    quantity INT
);

INSERT INTO sales (product_id, product_name, quantity)
VALUES
    (1, 'Product A', 50),
    (2, 'Product B', 120),
    (3, 'Product C', 280),
    (4, 'Product D', 90),
    (5, 'Product E', 350),
    (6, 'Product F', 60);


-- Выполните группировку значений количества в 3 сегмента:

SELECT
    CASE
        WHEN quantity < 100 THEN 'Меньше 100'
        WHEN quantity BETWEEN 100 AND 300 THEN '100-300'
        ELSE 'Больше 300'
    END AS quantity_segment,
    COUNT(*) AS segment_count
FROM sales
GROUP BY quantity_segment;


-- Создайте таблицу "orders" и заполните ее данными, используя оператор CASE для определения полного статуса заказа:

CREATE TABLE orders (
    order_id INT PRIMARY KEY,
    order_status VARCHAR(255),
    order_date DATE
);

INSERT INTO orders (order_id, order_status, order_date)
VALUES
    (1, 'В обработке', '2023-09-10'),
    (2, 'Отправлен', '2023-09-15'),
    (3, 'Доставлен', '2023-09-20'),
    (4, 'Отменен', '2023-09-25');
    
SELECT
    order_id,
    order_status,
    CASE
        WHEN order_status = 'В обработке' THEN 'Заказ в обработке'
        WHEN order_status = 'Отправлен' THEN 'Заказ отправлен'
        WHEN order_status = 'Доставлен' THEN 'Заказ доставлен'
        ELSE 'Заказ отменен'
    END AS full_order_status
FROM orders;








