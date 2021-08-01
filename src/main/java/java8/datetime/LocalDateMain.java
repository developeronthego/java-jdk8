package java8.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.TemporalQueries;
import java.util.stream.IntStream;

public class LocalDateMain {

	public static void main(String[] args) {
		IntStream stream = IntStream.range(1, 10);
		stream.forEach(i -> {
			LocalDate date = LocalDate.of(2010 + i, Month.JANUARY, 1);
			System.out.println(date.getDayOfWeek());
		});

		LocalTime localTime = LocalTime.now();
		System.out.println("Actual time is: " + localTime + ", 10 hours before was: " + localTime.minusHours(10));
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("Actual date is: " + localDateTime.query(TemporalQueries.localDate()));
		System.out.println("Actual time is: " + localDateTime.query(TemporalQueries.localTime()));
	}

}
