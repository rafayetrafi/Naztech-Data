package EnumClass;

public enum Month {
	
	January("31 days"),
	February ("28 days in a common year and 29 days in leap years"),
	March("31 days"),
	April("30 days"),
	May("31 days"),
	June("30 days"),
	July("31 days"),
	August("31 days"),
	September("30 days"),
	October("31 days"),
	November("30 days"),
	December ("31 days");
	
	String monthDays;

	
	public String getMonthName() {
		return this.monthDays;
	}



	private Month(String monthName) {

		this.monthDays = monthName;
	
	}

}
