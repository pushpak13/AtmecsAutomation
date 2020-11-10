package com.atmecs.hb.operations;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.atmecs.hb.entity.EmployeeManyToMany;
import com.atmecs.hb.entity.Projects;


public class ManyToManyMapping {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Projects.class)
				.addAnnotatedClass(EmployeeManyToMany.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();
		try
		{
			session.beginTransaction();
			//create projects
			Projects project1 = new Projects("Citrix WSI");
			Projects project2 = new Projects("SDET Automation");
			Projects project3 = new Projects("Dreamworks");
			Set<Projects> proj = new HashSet<Projects>();
			proj.add(project1);
			proj.add(project2);
			proj.add(project3);

			EmployeeManyToMany emp1 = new EmployeeManyToMany("Adam Joseph","adam@gmail.com");
			EmployeeManyToMany emp2 = new EmployeeManyToMany("Shivakumar","shiva@gmail.com");
			Set<EmployeeManyToMany> emp = new HashSet<EmployeeManyToMany>();
			emp.add(emp1);
			emp.add(emp2);

			emp1.setProjects(proj);
			emp2.setProjects(proj);

			session.save(emp1);
			session.save(emp2);
			session.getTransaction().commit();
		}finally {
			session.close();

		}
	}
}









