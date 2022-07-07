package Chapter7;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Importtest {
	public static void main(String[] args) {
		Date today = new Date();
		
		SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");
		
		System.out.println("today's date is"+date.format(today));
		System.out.println("time is"+time.format(today));
	}
}
