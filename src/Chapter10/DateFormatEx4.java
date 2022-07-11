package Chapter10;

import java.util.*;
import java.text.*;

public class DateFormatEx4 {
	public static void main(String[] args) {
		String pattern = "yyyy/MM/dd";
		DateFormat df = new SimpleDateFormat(pattern);
		Scanner s = new Scanner(System.in);
		Date inDate = null;
		System.out.println("You have to write in "+pattern+" form");
		while(s.hasNextLine()){
			try {
				inDate=df.parse(s.nextLine());
				break;
			} catch(Exception e) {
				System.out.println("You have to write in "+pattern+" form");
			}
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(inDate);
		Calendar today = Calendar.getInstance();
		long day = (cal.getTimeInMillis()-today.getTimeInMillis())/(60*60*1000);
		System.out.println("Time interval is "+day);
	}
}
