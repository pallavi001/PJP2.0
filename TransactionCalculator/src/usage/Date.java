package usage;

public class Date {

	private int day;
	private int month;
	private int year;

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public Date(String dateAsString) {
		String[] formattedDateString = dateAsString.split("-");
		this.setDay(Integer.parseInt(formattedDateString[0]));
		this.setMonth(Integer.parseInt(formattedDateString[1]));
		this.setYear(Integer.parseInt(formattedDateString[0]));
	}

	@Override
	public String toString() {
		return day + "/" + month + "/" + year ;
	}
}