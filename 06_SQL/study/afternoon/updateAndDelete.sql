-- CREATE SCHEMA `mydb` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;

USE mydb;

CREATE TABLE user(
    `id_pk` INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    `name` VARCHAR(50) NOT NULL,  
    `user_id` VARCHAR(50) NOT NULL UNIQUE,  
    `password` VARCHAR(255) NOT NULL,  
    `age` TINYINT UNSIGNED,
    `membership` TINYINT DEFAULT 0,
    `register_date` DATETIME DEFAULT CURRENT_TIMESTAMP,
    `update_date` DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

-- 일단 써

SELECT * FROM mydb.user;
INSERT INTO user (name, user_id, password, age)
	VALUES ('문준일', 'MJONE2', '1234', 40);
    
DELETE FROM user WHERE id_pk = 4;

UPDATE user SET age  = age + 1 WHERE id_pk =  1 ;
