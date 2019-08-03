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

insert into emp values(7369,'Smith','Clerk',7902,17/12/80,800,NULL,20);
insert into emp values(7499,'Allen','Salesman',7698,20/2/81,1600,300,30);
insert into emp values(7521,'Ward','Salesman',7698,22/2/81,1250,500,30);
insert into emp values(7566,'Jones','Manager',7839,2/4/80,2975,NULL,20);
insert into emp values(7934,'Ford','Analyst',7566,4/12/81,3000,NULL,20);
