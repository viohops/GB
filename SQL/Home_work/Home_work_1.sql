-- Создайте таблицу с мобильными телефонами, используя графический интерфейс. Заполните БД данными
-- Выведите название, производителя и цену для товаров, количество которых превышает 2
-- Выведите весь ассортимент товаров марки “Samsung”

-- Создайте таблицу "мобильные телефоны" с несколькими столбцами, такими как "id" (идентификатор), "название", "производитель", "цена" и "количество"

CREATE TABLE mobile_phones (
    id INT PRIMARY KEY,
    name VARCHAR(255),
    manufacturer VARCHAR(255),
    price DECIMAL(10, 2),
    quantity INT
);


-- Заполните таблицу данными. Вам нужно вставить строки с информацией о мобильных телефонах в таблицу

INSERT INTO mobile_phones (id, name, manufacturer, price, quantity)
VALUES
    (1, 'Galaxy S21', 'Samsung', 799.99, 5),
    (2, 'iPhone 13', 'Apple', 999.99, 3),
    (3, 'OnePlus 9', 'OnePlus', 699.99, 4),
    (4, 'Pixel 6', 'Google', 699.99, 2),
    (5, 'Mi 11', 'Xiaomi', 599.99, 6);


-- Выведите название, производителя и цену для товаров, количество которых превышает 2:

SELECT name, manufacturer, price
FROM mobile_phones
WHERE quantity > 2;


-- Выведите весь ассортимент товаров марки "Samsung":

SELECT *
FROM mobile_phones
WHERE manufacturer = 'Samsung';















