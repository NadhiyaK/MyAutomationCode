package Java.Coding;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class dateclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date d = new Date();
		System.out.println(d.toString());
		SimpleDateFormat sdf = new SimpleDateFormat("M/dd/yyyy/hh/mm/ss");
		System.out.println(sdf.format(d));
		Calendar c = Calendar.getInstance();
		
	}

	
}
