package in.ashokit;

public class Car extends Engine{
	public void drive() {
		int status = super.start();
		
		if(status >=1) {
			System.out.println("i am in journey...");
			
		}else {
			System.out.println("engine having some problem");
		}
		
	}

}
