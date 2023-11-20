package Abstraction;
import java.util.Scanner;

public class Utility {

	public String checkForName(String string) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Do you have a name for " + string + "? (Y/N): ");
		String answer = scanner.nextLine();
		if(answer.equalsIgnoreCase("y")) {
			System.out.print("Enter the name: ");
			String name = scanner.nextLine();
			//scanner.close();
			return name;
		}
		//scanner.close();
		return null;
	}

	public Lion getLionObject(String lionName) {
		
		if(lionName == null){
			lionName = "Lion";
			return new Lion();
		} 
		return new Lion(lionName);
	}

	public Giraffe getGiraffeObject(String giraffeName) {
		
		if(giraffeName == null){
			giraffeName = "Giraffe";
			return new Giraffe();
		} 
		return new Giraffe(giraffeName);
	}

	public Bear getBearObject(String bearName) {
		
		if(bearName == null){
			bearName = "Bear";
			return new Bear();
		} 
		return new Bear(bearName);
	}

}