

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.TimeZone;

public class TimeStampCheck {

	public static void main(String[] args) throws ParseException {
		String timestampValue = "2020-04-21T21:30:10.345678";
		String pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS";
		
//		DateTimeFormatter df = DateTimeFormatter.ofPattern(pattern).withZone(ZoneOffset.UTC);
		
		//Timestamp ts = Timestamp.valueOf(LocalDateTime.parse(timestampValue, df));
		//System.out.println("DataTimeFormatter UTC? :" + ts);
		

		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		sdf.setTimeZone(TimeZone.getTimeZone(ZoneOffset.UTC));
		Date parse = sdf.parse(timestampValue.substring(0, timestampValue.length()-3));
		Timestamp ts2 = new Timestamp(parse.getTime());
		System.out.println("SimpleDateFormat UTC? :" + ts2);
		
	}
}
