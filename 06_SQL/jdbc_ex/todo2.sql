use jdbc_ex;

create table todo_user
(
    user_id varchar(50) primary key,
    name varchar(50) not null unique,
    password varchar(255) not null,
    created_at timestamp default current_timestamp
);

SHOW INDEX from todo_user;

INSERT INTO todo_user (user_id, name, password, created_at ) VALUES
    ('na', '나건우', 1234, current_timestamp),
    ('siwan', '김시완', 1234,current_timestamp),
    ('tetz', '이효석', 1234, current_timestamp);

SELECT * from todo_user;

CREATE TABLE todo
(
    id           INT AUTO_INCREMENT PRIMARY KEY,
    user_id      VARCHAR(50)  NOT NULL,
    todo         VARCHAR(255) NOT NULL,
    is_completed BOOLEAN   DEFAULT FALSE,
    created_at   TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES todo_user (user_id) ON DELETE CASCADE
);


insert into todo (user_id, todo)
values  ('tetz', 'PPT 찍기'),
       ('tetz', '금요일에 쉬기 :)'),
       ('siwan', '다트 패자 부활전 우승 하기'),
       ('siwan', '강사님~'),
       ('na', '다트 우승하기'),
       ('na', 'RM 활동하기');

select * from todo;

