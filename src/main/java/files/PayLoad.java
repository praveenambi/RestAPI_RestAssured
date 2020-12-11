package files;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PayLoad {
	
	
	public static String addEmployee() {
		
		return "{\\r\\n\" + \r\n" + 
				"				\"    \\\"name\\\": \\\"Praveen\\\",\\r\\n\" + \r\n" + 
				"				\"    \\\"job\\\": \\\"SDET\\\",\\r\\n\" + \r\n" + 
				"				\"    \\\"id\\\": \\\"107\\\",\\r\\n\" + \r\n" + 
				"				\"    \\\"createdAt\\\": \\\"2020-12-06T07:52:01.192Z\\\"\\r\\n\" + \r\n" + 
				"				\"}";
		
		
		// 2020-12-06T07:52:01.192Z\\\
		
	}

	public String getCurrentTime() {
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date).toString());
		
		return dateFormat.format(date);
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		PayLoad payload = new PayLoad();
		payload.getCurrentTime();
		
		
	}
	
}
