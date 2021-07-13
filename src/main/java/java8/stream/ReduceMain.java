package java8.stream;

import java.util.Arrays;
import java.util.List;

public class ReduceMain {

	public static void main(String[] args) {
		List<Integer> listNumber = Arrays.asList(1,2,3,4,5);
		Integer reduceResult = listNumber.stream()
				.reduce(0, (x, y) -> x + y);
		System.out.println(reduceResult);
		
		
		Integer parallelStreamResult = listNumber.parallelStream()
				.reduce(0, (x, y) -> x + y, Integer::sum);
		System.out.println(parallelStreamResult);
	}

}
