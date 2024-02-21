create database MKPITS;
use MKPITS;
create table BatchName(id int primary key,Batch_Name varchar(50), Batch_Strength int);
insert into BatchName(id ,Batch_Name , Batch_Strength) value ("1","March","50");
insert into BatchName(id ,Batch_Name , Batch_Strength) value ("2","August","35");
insert into BatchName(id ,Batch_Name , Batch_Strength) value ("3","Octomber","12");
select * from BatchName;