package java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectMain {

	public static void main(String[] args) {
		List<String> games = Arrays.asList("Age of Empire", "Baldurs Gate", "Max Payne", "Star Craft");
		List<String> bigNames = games.stream()
			.map(String::toUpperCase)
			.collect(Collectors.toList());
		
		bigNames.forEach(System.out::println);
		
        List<String> movies = Arrays.asList("Matrix", "Star Wars", "Godfather");
        Map<String, String> listToMap = movies.stream()
                .collect(Collectors.toMap(Function.identity(), x -> new StringBuilder(x).reverse().toString()));

        listToMap.forEach((x,y) -> System.out.println("Key " + x + ", value " + y));

	}

}
