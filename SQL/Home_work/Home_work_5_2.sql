-- Изменить в существующем представлении порог для стоимости: пусть цена будет до 30 000 долларов 
-- (используя оператор ALTER VIEW) ALTER VIEW CheapCars AS SELECT Name FROM CarsWHERE Cost<30000;

DROP VIEW IF EXISTS CheapCars;

CREATE VIEW CheapCars AS
SELECT Name
FROM Cars
WHERE Cost < 30000;
