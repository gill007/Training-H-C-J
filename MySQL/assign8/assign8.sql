select ename from emp where job='analyst' or job='salesman';

select * from emp where hiredate<'1981-09-30';

select ename from emp where job != 'Manager';

select ename from emp where empno IN (7369,7521,7839,7934,7788);

select * from emp where deptno not in (30,40,10);

select ename from emp where hiredate between '1981-06-30' and '1981-12-31';

select distinct(job) from emp;

select ename from emp where comm is NULL;

select ename, job from emp where mgr is null;

select * from emp where deptno is null;

select * from emp where comm is not null;

select ename from emp where ename like 'S%' or ename like '%s';

select ename from emp where ename like '_i%';

select count(ename) from emp;

select count(distinct(job)) from emp;

select sum(sal) from emp;

select max(sal) as 'Max',min(sal) as 'Min', avg(sal) as Avg from  emp;

select max(sal) from emp where job='Salesman';

