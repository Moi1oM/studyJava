package Chapter10;

import java.text.MessageFormat;
import java.util.*;

public class MessageFormat1 {
	public static void main(String[] args) {
		String msg = "Name: {0} \nTel: {1} \nAge: {3} \nBirthday : {3}";
		Object[] arguments = {
			"JSW", "02-111-1111", "21", "08-06"	
		};
		String result = MessageFormat.format(msg, arguments);
		System.out.println(result);
	}
}
