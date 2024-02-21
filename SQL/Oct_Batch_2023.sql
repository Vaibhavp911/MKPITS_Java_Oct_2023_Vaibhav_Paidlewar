create database Oct_Batch_2023;
use Oct_Batch_2023;
create table BatchData(id int primary key , Name varchar(50), Branch varchar(50));
insert into BatchData (id,Name,Branch) values("1", "Vaibhav Paidlewar", "Electrical");
insert into BatchData (id,Name,Branch) values("2", "Pranav Armarfkar", "Electrical");
insert into BatchData (id,Name,Branch) values("3", "Chetan Nagapure", "Electrical");
insert into BatchData (id,Name,Branch) values("4", "Kastubh Anjankar", "ETC");
insert into BatchData (id,Name,Branch) values("5", "Harsh Gupta", "ETC");
select * from BatchData;
