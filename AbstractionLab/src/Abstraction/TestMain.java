package Abstraction;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Animal's Properties");
		
		Utility utility = new Utility();
		
		String lionName = utility.checkForName("Lion");
		Lion lion = utility.getLionObject(lionName);
		lion.dipslayAll();
		System.out.println("----------\n");
		
		String giraffeName = utility.checkForName("Giraffe");
		Giraffe giraffe = utility.getGiraffeObject(giraffeName);
		giraffe.dipslayAll();
		System.out.println("-----------\n");
		
		String bearName = utility.checkForName("Bear");
		Bear bear = utility.getBearObject(bearName);
		bear.dipslayAll();
		System.out.println("-----------\n");
		System.out.println("======================");

	}

}
