package nazTech.us.DayTenMaven;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class ConverterTest {
	
	@Test
	public void D2LdateTest() throws ParseException
	{
		Converter converter = new Converter();
		
		//String input = "Wed Jan 16 00:00:00 BDT 2019";
		//LocalDate ldTest = LocalDate.parse(input);
		//Date actualDate = converter.date2localDate(ldTest);
		
		//Date testDate = Date.parse(input);
		
		//______________________________________________________________________________________
		
		
		String input = "Wed Jan 16 00:00:00 BDT 2019";
		String testInput = "16-01-2019";
		DateFormat formatter = new SimpleDateFormat("E MMM dd HH:mm:ss Z yyyy");
		Date dateformat = (Date)formatter.parse(input);
		//System.out.println(date);        

		Calendar cal = Calendar.getInstance();
		cal.setTime(dateformat);
		String formatedDate = cal.get(Calendar.DATE) + "-" + (cal.get(Calendar.MONTH) + 1) + "-" +cal.get(Calendar.YEAR);
		//System.out.println("formatedDate : " + formatedDate); 
		
		DateFormat formatter1 = new SimpleDateFormat("dd-mm-yyyy");
		
		Date date = formatter1.parse(formatedDate);

		//______________________________________________________________________________________

		LocalDate ldTest = LocalDate.parse(input);
		Date actualDate = converter.date2localDate(ldTest);
		
		
		
		
	}
	

	

}
