import java.util.List;

import javax.persistence.Query;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NamedQuery;
import javax.persistence.Persistence;


import dept.Department;
import emp.Employee;



public class JPQ {
	
	public static void main(String args[]) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Q5");
	EntityManager em=emf.createEntityManager();
	
	try
	{ 
	Query query=em.createQuery("select emp,dept from Employee emp,"
			+ "Department dept where emp.deptNo=dept.deptNo and (emp.eName like 'A%'"
			+ "or emp.eName like 'a%')");
	
	List rs=query.getResultList();
	int size=rs.size();
	
	System.out.println("Employee NAME     DeptName");
	for(int i=0;i<size;i++)
	{
		Object[] o=(Object[])rs.get(i);
		System.out.println("");
		Employee emp=(Employee)o[0];
		System.out.print(emp.geteName()+"  ");
		Department dept=(Department)o[1];
		System.out.println(dept.getdName());

}
	}finally
	{
		em.close();
	}
}
}
