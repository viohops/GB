-- Создайте представление, в которое попадут автомобили стоимостью до 25 000 долларов 
-- CREATE VIEW CheapCars AS SELECT Name FROM Cars WHERE Cost<25000;

CREATE VIEW CheapCars AS
SELECT Name
FROM Cars
WHERE Cost < 25000;
