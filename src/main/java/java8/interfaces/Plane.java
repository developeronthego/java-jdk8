package java8.interfaces;

public class Plane implements Flying{

	@Override
	public void fly() {
		System.out.println("fly..");
	}
	
	@Override
	public void showName(){  
		System.out.println("Show plane"); 
    }
}
