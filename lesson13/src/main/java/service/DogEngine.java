package service;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import model.Dog;

public class DogEngine {

	private EntityManager entityManager = Persistence.createEntityManagerFactory("DogUnit").createEntityManager();

	public void addDog(Dog dog) {
		entityManager.getTransaction().begin();
		entityManager.merge(dog);
		entityManager.getTransaction().commit();
	}

	public Dog getDogById(int id) {
		return entityManager.find(Dog.class, id);
	}
}
