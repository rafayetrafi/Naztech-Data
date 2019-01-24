package nazTech.us.DayTenMaven;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Converter {
	
	
	public Date date2localDate(LocalDate localDate) throws ParseException
	{
		Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
		
		return date;
	}
	
	
	

}
