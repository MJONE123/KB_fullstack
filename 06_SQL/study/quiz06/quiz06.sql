-- 다음을 처리하는 쿼리문을 작성하세요.
SHOW DATABASES;
USE employees;
SHOW TABLES;
DESC employees;

-- employees 테이블에서 다음 쿼리를 작성하세요.
SELECT * FROM employees.titles;
SELECT first_name FROM employees;
SELECT first_name, last_name, gender FROM employees;


-- employees 테이블 출력시 다음과 같이 나오도록 쿼리를 작성하세요.
SELECT first_name AS '이름', gender AS '성별', hire_date AS '회사 입사일' FROM employees; 

-- 배포된 sqldb.sql 파일을 이용하여 sqldb 데이터베이스를 구축하세요.


-- userbl 테이블에서 이름이 '김경호'인 행을 출력하세요.
USE sqld;
SELECT * FROM userbl WHERE name = '김경호';

-- usertbl 테이블에서 생년이 1970 이상이고 키가 182이상인 데이터를 출력하세요.
SELECT * FROM userbl WHERE birthyear >= 1970 and height >=182;

-- usertbl 테이블에서 키가 180~183 범위인 데이터를 출력하세요.
SELECT * FROM userbl WHERE height >=180 and height <= 183;

-- usertbl 테이블에서 주소가 '경남' 또는 '전남' 또는 '경북'인 데이터를 출력하세요.
SELECT * FROM userbl WHERE addr='경남' OR addr = '전남' OR addr = "경북";

-- usertbl 테이블에서 이름이 '김'으로 시작하는 데이터를 출력하세요.
SELECT * FROM userbl WHERE name LIKE '김%';

-- usertbl에서 김경호 보다 큰 사람들의 이름과 키를 출력하세요.
SELECT name,height FROM userbl WHERE height > (SELECT height FROM userbl WHERE name = '김경호');

-- usertbl을 mdata의 오름 차순으로 정렬하여 출력하세요.
SELECT * FROM userbl ORDER BY mdata ASC;

-- usertbl을 mdata의 내림 차순으로 정렬하여 출력하세요.
SELECT * FROM userbl ORDER BY mdata DESC;

-- usertbl을 height의 내림차순으로 정렬하고, 동률인 경우 name의 내림차순으로 정렬하여 출력하세요.
SELECT * FROM userbl ORDER BY height DESC, name DESC; 

-- usertbl의 주소지를 중복없이 오름 차순으로 출력하세요.
SELECT DISTINCT addr FROM userbl ORDER BY addr ASC; 











