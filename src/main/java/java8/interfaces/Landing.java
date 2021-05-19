package java8.interfaces;

public interface Landing {
	public static final String NAME = "Landing interface";
	
	public void land();
	
	default void showName(){  
        System.out.println(NAME);  
    } 
}
