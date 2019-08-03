create database assign7;
use assign7;
SET GLOBAL FOREIGN_KEY_CHECKS=0;

CREATE TABLE EMP (EMPNO integer primary key, ENAME varchar(30), JOB char, MGR integer, HIREDATE date,SAL integer, COMM integer,DEPTNO integer); 
CREATE TABLE DEPT(DEPTNO integer primary key,DNAME varchar(30),LOC varchar(30));
Alter table emp add foreign key(deptno) references dept(deptno);
Alter table emp modify job char(20);

insert into dept values(10,'Accounting','New York');
insert into dept values(20,'Research','Dallas');
insert into dept values(30,'Sales','Chicago');
insert into dept values(40,'Operations','Boston');

insert into emp values(7369,'Smith','Clerk',7902,'1980-12-17',800,NULL,20);
insert into emp values(7499,'Allen','Salesman',7698,'1981-2-20',1600,300,30);
insert into emp values(7521,'Ward','Salesman',7698,'1981-2-22',1250,500,30);
insert into emp values(7566,'Jones','Manager',7839,'1980-4-2',2975,NULL,20);
insert into emp values(7934,'Ford','Analyst',7566,'1981-12-4',3000,NULL,20);
insert into emp values(7902, 'Miller' ,'Cerk' ,7782 ,'1982-1-23',1300 ,Null ,10);
insert into emp values(7654, 'Blake','Manager',7839,'1981-6-9',2450 ,Null,10);
insert into emp values(7698,'Martin','Salesman',7698,'1981-9-28',1250,1400,30);
insert into emp values(7782,'Clark','Manager',7839,'1981-6-9',2450,Null,30);
insert into emp values(7788,'Scott','Analyst',7566,'1982-12-9',3000,NULL,20);
insert into emp values(7839,'King','President',NULL,'1981-11-17',5000,NULL,10);
insert into emp values(7844,'Turner','Salesman',7698,'1981-9-8',1500,0,30);
insert into emp values(7876,'Adams','Clerk',7788,'1983-1-3',1100,Null,20);


select * from emp;


