package java8.stream;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamMain {

	public static void main(String[] args) {
		List<String> games = Arrays.asList("Age of Empire", "Baldurs Gate", "Max Payne", "Star Craft", "Sim City");
		
		String findFirstResult = games.stream().filter(s -> s.startsWith("S")).findFirst().get();
		String fidnAnyResult = games.stream().filter(s -> s.startsWith("S")).findAny().get();

		System.out.println("No parallel stream used, findFirst result " + findFirstResult + ", findAny result " + fidnAnyResult);

		String findFirstParallelResult = games.parallelStream().filter(s -> s.startsWith("S")).findFirst().get();
		String fidnAnyParallelResult = games.parallelStream().filter(s -> s.startsWith("S")).findAny().get();

		System.out.println("Parallel stream used, findFirst result " + findFirstParallelResult + ", findAny result " + fidnAnyParallelResult); //FindFirst always print Star Craft
	}

}
