package EnumClass;

public class DayCounter {
	
	public void monthDayFinder()
	{
		Month[] month = Month.values();
		
		for(Month day: month)
		{
			System.out.println(day.name() + "\t" + "\t" + day.getMonthName() );
		}
		
	}
	
	
	
	

}
