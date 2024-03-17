-- Выведите только четные числа от 1 до 10. Пример: 2,4,6,8,10 Данная промежуточная аттестация 
-- оценивается по системе "зачет" / "не зачет" "Зачет" ставится, если слушатель успешно выполнил 
-- 1 или 2 задачи "Незачет" ставится, если слушатель успешно выполнил 
-- 0 задач Критерии оценивания: 1 - слушатель верно создал функцию, которая принимает 
-- кол-во сек и формат их в кол-во дней часов. 2 - слушатель выведили только четные числа от 1 до 10.

USE HOME_WORK_6;
DROP PROCEDURE IF EXISTS print_num;
DELIMITER $$
CREATE PROCEDURE print_num
(
 input_num INT
)
BEGIN
    DECLARE n INT;
    DECLARE result varchar(50) default "";
    SET n = input_num;
    
    REPEAT
        IF n % 2 = 0 THEN
            set result = concat(result, n, ' ');
            SELECT result;
        END IF;
        SET n = n + 1;
    UNTIL n > 10
    END REPEAT;
    select result;
END $$
DELIMITER ;
CALL print_num(1);