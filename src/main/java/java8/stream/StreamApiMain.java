package java8.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.function.IntBinaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApiMain {

	public static void main(String[] args) throws IOException {
		String [] array = {"Age of Empire", "Baldurs Gate", "Max Payne", "Star Craft"};
		Stream<String> streamArray = Arrays.stream(array);
		Stream<String> streamList = Arrays.asList(array).stream();

		Stream<Object> emptyStream = Stream.empty();
		Stream<String> title = Stream.of("Welcome to Poland!");

		IntStream numbers = IntStream.range(1, 21);
		
		Stream<String> lines = Files.lines(Paths.get("c:///textToRead.txt"));
		
		List<String> games = Arrays.asList("Age of Empire", "Baldurs Gate", "Max Payne", "Star Craft");
		
		IntBinaryOperator op = (x, y) -> x + y;
		OptionalInt optionalInt = numbers.filter(x -> x < 15)
				.map(x -> x * x).reduce(op);
		
		if (optionalInt.isPresent()) {
            System.out.println(optionalInt.getAsInt());
        }
		
		List<Integer> listNumber = Arrays.asList(1,1,2,3,4,5);
		
		listNumber.stream()
			.distinct()
			.filter(x -> x < 5)
			.map(x -> x + 1)
			.sorted((o1, o2) -> Integer.compare(o2, o1))
			.limit(2)
			.forEach(System.out::println);
		
		boolean anyMatch = listNumber.stream()
			.distinct()
			.filter(x -> x < 5)
			//.skip(1)
			.map(x -> x + 1)
			.sorted((o1, o2) -> Integer.compare(o2, o1))
			.anyMatch(x ->  x % 2 == 1);
		
		System.out.println(anyMatch);
	}

}
