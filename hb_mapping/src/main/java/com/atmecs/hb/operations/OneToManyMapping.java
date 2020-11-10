package com.atmecs.hb.operations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.atmecs.hb.entity.EmployeeOneToOne;
import com.atmecs.hb.entity.Skills;


public class OneToManyMapping {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Skills.class)
				.addAnnotatedClass(EmployeeOneToOne.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();
		try {
			session.beginTransaction();
			EmployeeOneToOne employee = new EmployeeOneToOne("Deekshita Raj","dr@gmail.com");
			session.save(employee);
			
			//Add skills
			Skills skill1 = new Skills("Selenium Automation");
			Skills skill2 = new Skills("Java");
			
			//Adding skills to employee
			skill1.setEmployee(employee);
			skill2.setEmployee(employee);
			
			//save skills
			session.save(skill1);
			session.save(skill2);
			
			session.getTransaction().commit();
		}finally {
			session.close();
			
		}
	}

}
