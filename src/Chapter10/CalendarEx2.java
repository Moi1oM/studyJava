package Chapter10;
import java.util.*;
public class CalendarEx2 {
	public static void main(String[] args) {
		final String[] DAY_OF_WEEK = {"","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		date1.set(2015, Calendar.AUGUST,15);
		System.out.println("date1 is "+toString(date1)
		+DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)]);
		System.out.println("today is "+toString(date2)
		+DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)]);
		long difference = (date2.getTimeInMillis()-date1.getTimeInMillis())/1000;
		System.out.println("difference is "+difference);
		System.out.println("difference in day is "+difference/(24*60*60));
	}
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"year "+(date.get(Calendar.MONTH)+1)
				+"month "+date.get(Calendar.DATE)+"day"; 
	}
}
