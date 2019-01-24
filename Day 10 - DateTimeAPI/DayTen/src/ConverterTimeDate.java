

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class ConverterTimeDate {

	public void getLocalDate() {

		
		String localDate = new SimpleDateFormat("YYYY-MM-DD").format(Calendar.getInstance().getTime());
		LocalTime time = LocalTime.parse(localDate);
		

		//System.out.println(date);
		
		
		
		
	}
	
	public String getDate()
	{
		
		String date = Calendar.getInstance().getTime().toString();
		
		return date;
	}
	
	public String getLocalTime()
	{
		//return new SimpleDateFormat("HH:MM:SS.sss").format(Calendar.getInstance().getTime()).toString();
		
		return new SimpleDateFormat("hh:mm:ss.SSS").format(new Date());
	}
	

}
