package java8.interfaces;

public interface Flying {
	public static final String NAME = "Flying interface";
	
	public void fly();
	public static boolean isAllowToFly(String weather) {
		return "good".equals(weather) ? true : false;
	}
	
	default void showName(){  
        System.out.println(NAME);  
    } 
}
