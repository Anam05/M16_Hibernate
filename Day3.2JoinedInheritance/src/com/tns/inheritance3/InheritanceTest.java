package com.tns.inheritance3;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class InheritanceTest {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		//create an Employee1
		Employee emp=new Employee();
		emp.setName("Ayaan");
		emp.setSalary(25000);
		em.persist(emp);
		
		//create an Employee1
				Employee emp1=new Employee();
				emp1.setName("Shibra");
				emp1.setSalary(45000);
				em.persist(emp1);
				
				
		//create an manager
		Manager manager=new Manager();
		manager.setName("Shagufta");
		manager.setSalary(70000);
		manager.setDeptName("Program Specialist");
		em.persist(manager);
		
		em.getTransaction().commit();
		System.out.println("Added  Employee and  Manager Successfully");
		em.close();
		factory.close();
		
		

	}

}

