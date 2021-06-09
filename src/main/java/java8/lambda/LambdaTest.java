package java8.lambda;

public class LambdaTest {

	public static void main(String[] args) {
		Playable anonymousClass = new Playable() {
			
			@Override
			public void play() {
				System.out.println("JDK 7");
			}
		};
		
		Playable lambdaExpression = () -> {
			System.out.println("JDK 8");
		};
		
		anonymousClass.play();
		lambdaExpression.play();
		
		Drivable driver = x -> {
			System.out.println(x);
			return x*x;
		};
		
		int force = 5;
		System.out.println(driver.accelerate(force));
	}
}
