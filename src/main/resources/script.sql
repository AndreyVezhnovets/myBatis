CREATE DATABASE data;
CREATE TABLE data.MASTER(
name VARCHAR (50),
age INT (3),
PRIMARY KEY (name)
);
CREATE TABLE data.WORKER(
ID INT (10),
master_name VARCHAR (50),
CITY VARCHAR (20)
);
insert into data.master (name, age) values ('КОЛЯ', 19);
insert into data.master (name, age) values ('ВАСЯ', 22);

insert into data.worker (id, master_name, city) values (1, 'КОЛЯ', 'МИНСК');
insert into data.worker (id, master_name, city) values (2, 'ВАСЯ', 'МИНСК');
insert into data.worker (id, master_name, city) values (3, 'КОЛЯ', 'ГОМЕЛЬ');
insert into data.worker (id, master_name, city) values (4, 'ВАСЯ', 'ГОМЕЛЬ');