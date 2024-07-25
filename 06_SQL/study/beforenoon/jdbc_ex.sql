CREATE DATABASE jdbc_ex;

Create user 'jdbc_ex'@'%' identified by 'jdbc_ex';
grant all privileges on jdbc_ex.* to 'jdbc_ex'@'%';
flush privileges;


drop database jdbs_ex;user_info