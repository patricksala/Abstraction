package Abstraction;

public class Bear extends Animal {
	
	Bear() {
		System.out.println("Bear inherits Animal");
	}
	
	Bear(String name) {
		super(name);
		System.out.println("Bear inherits Animal");
	}
	
	void display() { 
		System.out.println("Bear Display");
	}
	
	@Override
	void sound() {
		System.out.println("Sound: Growl");
	}
	
	@Override
	void food() {
		System.out.println("Food: Meat and Plant based");
	}
	
	void dipslayAll() {
		display();
		numOfEyes();
		numOfLimbs();
		sound();
		food();
		
	}

}
