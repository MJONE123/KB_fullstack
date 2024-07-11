-- 고객 테이블 생성
CREATE TABLE customers(
customers_id INT PRIMARY KEY, 
customer_name VARCHAR(10)
);

-- 주문 테이블 생성
CREATE TABLE orders(order_id INT PRIMARY KEY, 
customers_id INT, 
order_date DATE, 
FOREIGN KEY(customers_id) REFERENCES customers(customers_id)
);

-- 카테고리 테이블 생성
CREATE TABLE categories (
category_id INT PRIMARY KEY,
category_name VARCHAR(100)
);

-- 상품 테이블 생성
CREATE TABLE products (
product_id INT PRIMARY KEY,
product_name VARCHAR(100),
product_price INT,
 category_id INT,
 FOREIGN KEY(category_id) REFERENCES categories(category_id)
);

-- 주문 상세 테이블 생성
CREATE TABLE orders_details(
order_id INT, 
product_id INT,
quantity INT,
foreign key(order_id) references orders(order_id),
foreign key(product_id) references products(product_id)
);


-- 고객 테이블에 데이터 삽입
INSERT INTO customers (customers_id, customer_name) VALUES
(1, '김시완'),
(2, '이효석'),
(3, '김연비'),
(4, '최호진'),
(5, '김동준'),
(6, '최현수'),
(7, '권오현');

-- 카테고리 테이블에 데이터 삽입
INSERT INTO categories (category_id, category_name) VALUES
(1, '전자기기'),
(2, '주변기기');


-- 상품 테이블에 데이터 삽입
INSERT INTO products (product_id, product_name, product_price, category_id) VALUES
(1, '맥북에어', 650000, 1),
(2, '맥북프로', 700000, 1),
(3, '맥북프로맥스', 750000, 1),
(4, '맥북파우치', 10000, 2),
(5, 'DT-35키보드', 20000, 2),
(6, '독거미키보드', 50000, 2);

-- 주문 테이블에 데이터 삽입
INSERT INTO orders (order_id, customers_id, order_date) VALUES
(1, 1, '2024-06-01'),
(2, 2, '2023-06-02'),
(3, 3, '2023-06-03'),
(4, 4, '2023-06-04'),
(5, 5, '2023-06-05'),
(6, 6, '2023-06-06'),
(7, 7, '2023-06-07');

-- 주문 상세 테이블에 데이터 삽입
INSERT INTO orders_details (order_id, product_id, quantity) VALUES
(1, 1, 1),
(1, 4, 1),
(2, 2, 1),
(3, 3, 1),
(4, 5, 1),
(5, 6, 1),
(6, 6, 1),
(7, 6, 1);

SELECT * FROM mydb2.customers;
SELECT * FROM mydb2.orders;
SELECT * FROM mydb2.products;
SELECT * FROM mydb2.categories;
SELECT * FROM mydb2.orders_details;

-- customer 테이블과 orders 테이블 합치기
select * from customers as c
join orders as o
on c.customers_id = o.customers_id
join orders_details as od
on od.order_id = o.order_id
join products as p
on p.product_id = od.product_id
join categories as cat
on cat.category_id = p.category_id;
