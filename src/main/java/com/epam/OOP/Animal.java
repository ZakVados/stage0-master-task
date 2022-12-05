package com.epam.OOP;

public class Animal {
	private String color;
	private int numberOfPaws;
	private boolean hasFur;

	Animal(String color, int numberOfPaws, boolean hasFur) {
		this.color = color;
		this.numberOfPaws = numberOfPaws;
		this.hasFur = hasFur;
	}

	public static void main(String[] args) {
		Animal animal = new Animal("red", 1, false);
		System.out.println(animal.getDescription());
		System.out.println("Explanation: printed the result of getDescription() method of \"Animal\" class.");

		Dog dog = new Dog();
		System.out.println(dog.getDescription());
		System.out.println("Explanation: printed the result of getDescription() method of child class \"Dog\" that inherited from parent class \"Animal\".");

		Bird bird = new Bird();
		System.out.println(bird.getDescription());
		System.out.println("Explanation: printed the result of getDescription() method of child class \"Bird\" that inherited from parent class \"Animal\" and overrided.");
	}

	public String getDescription() {
		return String.format("This animal is mostly %s. It has %d %s and %s fur.", this.color,
																				   this.numberOfPaws,
																				   this.numberOfPaws > 1 ? "paws" : "paw",
																				   this.hasFur == true ? "a" : "no");
	}
}
