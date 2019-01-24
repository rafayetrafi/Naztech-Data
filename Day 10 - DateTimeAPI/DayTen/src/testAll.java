import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import org.junit.*;

class testAll {
	
	
	String today = LocalDate.now().toString();
	
	
	

	@org.junit.Test
	public void localDatechk()
	{
		ConverterTimeDate tt = new ConverterTimeDate();
		//assertEquals(today, tt.getLocalDate());
		
		
	}
	

}
