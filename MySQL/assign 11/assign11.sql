select count(ename),avg(sal) from emp where deptno=20 group by deptno;

select ename,sal,(sal*0.1) as 'PF' from emp;

SELECT ename from emp where (year(curdate())-year(hiredate)>25) ;

select * from emp order by sal;

select ename,hiredate from emp order by hiredate desc;

select ename,sal,sal*.10 as 'PF',sal*.50 as 'HRA',sal*.30 as 'DA' from emp order by HRA;

select deptno,count(ename) from emp group by deptno;

select deptno,sum(sal) from emp group by deptno;

select job,count(ename) from emp group by job order by count(ename) desc;

select sum(sal),max(sal),min(sal),avg(sal) from emp group by job;

select sum(sal),max(sal),min(sal),avg(sal) from emp where deptno=20 group by deptno;

select avg(sal) from emp where deptno=20 group by job having avg(sal)>1000;
