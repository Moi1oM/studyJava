package Chapter10;

import java.text.MessageFormat;
import java.util.*;

public class MessageFormatEx3 {
	public static void main(String[] args) throws Exception{
		String[] data = {
			"INSERT INTO CUST_INFO VALUES ('JSW','02-111-1111',21,'08-06');",
			"INSERT INTO CUST_INFO VALUES ('GCW','02-111-1111',21,'05-23');"
		};
		String pattern = "INSERT INTO CUST_INFO VALUES ({0},{1},{2},{3});";
		MessageFormat mf = new MessageFormat(pattern);
		for(int i=0; i<data.length;i++) {
			Object[] objs = mf.parse(data[i]);
			for(int j=0; j<objs.length; j++) {
				System.out.print(objs[j]+", ");
			}
			System.out.println();
		}
	}
}
