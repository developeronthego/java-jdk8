package java8.datetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

public class ZonedDateMain {

	public static void main(String[] args) {
		ZonedDateTime zonedDateTime = ZonedDateTime.of(2021, 07, 31, 21, 31, 0, 0, ZoneId.of("Europe/Warsaw"));
		ZonedDateTime zonedDateTimeNow = ZonedDateTime.now(ZoneId.of("Europe/Warsaw"));
		ZonedDateTime zonedDateTimeFromLocal = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Europe/Warsaw"));
		ZonedDateTime zonedDateTimeParsed =  ZonedDateTime.parse("2021-07-31T21:31+02:00[Europe/Warsaw]");
		
		System.out.println("ZonedDatetime created from of method " + zonedDateTime + 
				"\nzonedDateTimeused now method " + zonedDateTimeNow +
				"\nzonedDateTime created from from localDateTime " + zonedDateTimeFromLocal +
				"\nzonedDateTime parsed from String " + zonedDateTimeParsed);
		
		ZoneId.getAvailableZoneIds().stream()
        .filter(name -> name.contains("Europe"))
        .map(id -> ZoneId.of(id))
        .forEach(x -> System.out.println(LocalDateTime.now().atZone(x)));
		
		Calendar calendar = Calendar.getInstance();
        Date date =  calendar.getTime();
        System.out.println(LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault()));
        System.out.println(LocalDateTime.ofInstant(calendar.toInstant(), ZoneId.systemDefault()));
	}

}
