package java8.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FunctionalInterfacesComparition {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Ania");
		names.add("Tomek");
		names.add("Janusz");
		
		useConsumer(names);
		useSupplier();
		usePredicate(names);
		useOperator(names);
		useFunction(names);
	}

	private static void useFunction(List<String> names) {
		names.forEach(nameToCheck -> {
			Function<String, Integer> function = name -> name.length();
	        Integer nameLength = function.apply(nameToCheck);
	        System.out.println("Length of name " + nameLength);
		});
	}

	private static void usePredicate(List<String> names) {
		names.forEach(nameToCheck -> {
			Predicate<String> checkName = (name) -> name.equals("Ania");
			
			if (checkName.test(nameToCheck)) {
				System.out.println("I found " + nameToCheck);
			}
		});
	}

	private static void useOperator(List<String> names) {
		UnaryOperator<String> operator = String::toUpperCase; // alternative to name -> name.toUpperCase()
		names.replaceAll(operator);
		names.forEach(System.out::println);
	}

	private static void useSupplier() {
		int age = 20;
		Supplier<String> ageInfo = () -> "Ania age is " + age;
		List<String> namesWithAges = new ArrayList<>();
		namesWithAges.add(ageInfo.get());
	}

	private static void useConsumer(List<String> names) {
		Consumer<String> action = name -> System.out.println("Name is " + name);
		names.forEach(action);
	}

}
