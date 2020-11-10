package com.atmecs.hb.operations;

import org.hibernate.Session;
import org.hibernate.SessionException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.atmecs.hb.entity.EmployeeOneToOne;
import com.atmecs.hb.entity.EmployeeDetails;



public class OneToOneMapping {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(EmployeeOneToOne.class)
				.addAnnotatedClass(EmployeeDetails.class)

				.buildSessionFactory();

		Session session = factory.getCurrentSession();
		try {

			EmployeeOneToOne employee = new EmployeeOneToOne("Rakesh Mishra","rakeshm@gmail.com");
			EmployeeDetails details = new EmployeeDetails("Manager","HR",60000);
			details.setEmployeeOneToOne(employee);
			session.beginTransaction();
			session.save(details);
			session.getTransaction().commit();
		} catch(SessionException e) {

		} finally {
			session.close();
			factory.close();
		}



	}

}
