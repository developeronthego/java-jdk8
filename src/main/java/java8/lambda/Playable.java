package java8.lambda;

@FunctionalInterface
public interface Playable {

	public void play();
	//public void rewind(); can't add more than one signature to functional interface
}
