package mainapp;

import model.Dog;
import model.Owner;
import service.DogEngine;

public class App {
	public static void main(String[] args) {
//        Dog dog = new Dog(2, "miniDog", 1, "MiniMax");
		Owner owner = new Owner(3, "MiniMax");
		Dog dog = new Dog(2, "miniDog", 1, owner);
		DogEngine dogEngine = new DogEngine();
//        dogEngine.addDog(dog);
		Dog entity = dogEngine.getDogById(3);
		System.out.println(entity);

	}
}
