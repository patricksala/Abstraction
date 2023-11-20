package Abstraction;

public class Lion extends Animal {
	
	Lion() {
		System.out.println("Lion inherits Animal");
	}
	
	Lion(String name) {
		super(name);
		System.out.println("Lion inherits Animal");
	}
	
	void display() { 
		System.out.println("Lion Display");
	}
	
	@Override
	void sound() {
		System.out.println("Sound: Roar");
	}
	
	@Override
	void food() {
		System.out.println("Food: Meat");
	}
	
	void dipslayAll() {
		display();
		numOfEyes();
		numOfLimbs();
		sound();
		food();
		
	}

}
