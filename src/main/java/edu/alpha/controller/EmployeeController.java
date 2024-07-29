package edu.alpha.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.alpha.entity.Employee;

public class EmployeeController {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("alpha2");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Employee employee = new Employee();
		employee.setId(102);
		employee.setName("Raki");
		entityTransaction.begin();
		entityManager.persist(employee);
		entityManager.close();
		entityTransaction.commit();
	}
}
