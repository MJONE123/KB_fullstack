use world;

select * from city;
select * from country;
select * from countrylanguage;

#crud

#create
insert into `city` (name, countrycode, district, population)
Values('joonil', 'Kor', 'joonil', 1);

select * from city where name = 'joonil';

#update
UPDATE `city` SET POPulation  = 123123 where Name = 'joonil';

#delete
DELETE from city where name = 'joonil';

# 정렬
select name, city.CountryCode, city.Population from city
order by  Population asc;

# 함수
select * from country;
select country.Name, IFNULL(IndepYear, "독립 연도 없음~") FROm world.country;
select lower(country.Code) from country;

select concat(id, "/", name, "/", city.Population) from city
select name, ceiling(country.LifeExpectancy) from country;
select name, floor(country.LifeExpectancy) from country;
select name, round(country.LifeExpectancy) from country;
select name, length(name) from country;

#최대 최소 평균값
select max(population) from city;
select min(population) from city;
select avg(population) from city;

select countrycode, sum(city.Population) from city
group by countrycode;

select * from city
join world.country c on c.Code = city.CountryCode

select * from countrylanguage;
select co.code, co.name, cl.Language from country as co
left join countrylanguage  as cl
on co.Code = cl.CountryCode


# join 함수
select c.CountryCode, co.Name, sum(c.Population)
from city as c
join world.country co
on c.CountryCode = co.Code
group by c.CountryCode;


select * from city
         where Population >= (
    select Population from city
                      where Name = 'amsterdam'
    );


select * from city;
select * from country;
select * from countrylanguage;