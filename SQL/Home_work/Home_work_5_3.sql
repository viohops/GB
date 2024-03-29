-- Создайте представление, в котором будут только автомобили марки “Шкода” и “Ауди” 
-- (аналогично) Вывести название и цену для всех анализов, которые продавались 5 февраля 2020 
-- и всю следующую неделю. Есть таблица анализов Analysis: an_id — ID анализа; an_name — название анализа; 
-- an_cost — себестоимость анализа; an_price — розничная цена анализа; an_group — группа анализов. 
-- Есть таблица групп анализов Groups: gr_id — ID группы; gr_name — название группы; 
-- gr_temp — температурный режим хранения. Есть таблица заказов Orders: ord_id — ID заказа; 
-- ord_datetime — дата и время заказа; ord_an — ID анализа.

CREATE VIEW CarAnalysis AS
SELECT an.an_name, an.an_price
FROM Analysis AS an
JOIN Orders AS ord ON an.an_id = ord.ord_an
WHERE an.an_group IN ('Шкода', 'Ауди')
  AND ord.ord_datetime >= '2020-02-05'
  AND ord.ord_datetime <= '2020-02-12';
