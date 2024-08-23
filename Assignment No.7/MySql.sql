create database db_ORG;
use db_ORG;
show databases;
use db_ORG;

create table Employee(
     p_id int primary key auto_increment,
	 name varchar(25), 
     DOB date, mobile varchar(10),
     email varchar(50), 
     aadhar varchar(12), 
     pan varchar(10));
     
     insert into Employee values(null,'Samiksha','2002-12-30',7021175884,'samiksha@gmail.com','586721359824','COBP0021');
	  insert into Employee values(null,'Sonal','2005-10-02',9867042745,'sonal@gmail.com','703688214459','MPTO4521');
      
      select * from Employee;
      
 create table Contacts(
     id int primary key auto_increment,
	 p_id int references Employee(p_id), 
     mobile2 varchar(10), 
     email2 varchar(50));
     
     insert into Contacts values(null,1,'7865439023','abc@gmail.com');
     select * from Contacts;
     
create table Communication(
	 id int primary key auto_increment,
     p_id int references Employee(p_id), 
     address1 varchar(100), 
     address2 varchar(100));
     
     insert into Communication values(null,1,'At post Ratnagiri','At post Mumbai');
      select * from Communication;
      
create table Registration(
    id int primary key auto_increment,
    p_id int references Employee(p_id), 
    DOJ date,
    dpt varchar(20),
    post varchar(25));
    
    insert into Registration values(null,1,'2005-10-05','Web designer','designer');
    select * from Registration;
    
create table Department(
    id int primary key auto_increment,
    p_id int references Employee(p_id), 
    dpt_name varchar(25),
    loaction varchar(50));
    
    insert into Department values(null,1,'software','mumbai');
    select * from Department;
    
create table Emp_payroll(
    id int primary key auto_increment,
    p_id int references Employee(p_id),
    post varchar (30),
    salary int (25),
    emp_name varchar(30));
    
    insert into Emp_payroll values(null,1,'Web developer',600000,'samiksha');
    select * from Emp_payroll;
    
     select * from Employee as p JOIN Contacts as c ON p.p_id=c.id ;
     select * from Employee as p JOIN Communication as m ON p.p_id=m.id;
     select * from Contacts as c JOIN Communication as m ON c.p_id=m.id;
     select * from Registration as r JOIN Department as m ON r.p_id=m.id;
	 select * from Emp_payroll as p JOIN Registration as b ON p.p_id=b.id;
     
     drop table Communication;
     drop table Emp_payroll;

      
      