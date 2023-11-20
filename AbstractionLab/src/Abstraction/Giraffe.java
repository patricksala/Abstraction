package Abstraction;

public class Giraffe extends Animal {
	
	Giraffe() {
		System.out.println("Giraffe inherits Animal");
	}
	
	Giraffe(String name) {
		super(name);
		System.out.println("Giraffe inherits Animal");
	}
	
	void display() { 
		System.out.println("Giraffe Display");
	}
	
	@Override
	void sound() {
		System.out.println("Sound: Bleat");
	}
	
	@Override
	void food() {
		System.out.println("Food: Plant based");
	}
	
	void dipslayAll() {
		display();
		numOfEyes();
		numOfLimbs();
		sound();
		food();
		
	}

}
