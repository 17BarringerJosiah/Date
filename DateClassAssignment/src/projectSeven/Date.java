package projectSeven;

public class Date {
  private int month;
  private int day;
  private int year;
  
  public Date(int month, int day, int year) {
	  this.month = month;
	  this.day = day;
	  this.year = year;
  }
  
  public int getMonth() {
	  return month;
  }
  
  public void setMonth(int month) {
	  this.month = month;
  }
  
  public int getDay() {
	  return day;
  }
  
  public void setDay(int day) {
	  this.day = day;
  }
  
  public int getYear() {
	  return year;
  }
  
  public void setYear(int year) {
	  this.year = year;
  }
  
  public void displayDate() {
	  System.out.println(month + "/" + day + "/" + year);
  }
  

  public class DateTest {
  public static void main(String[] args) {
		// TODO Auto-generated method stub
	  
	  System.out.println("Josiah Barringer - PROGRAMMING: DATE CLASS ASSIGNMENT");
	  
	  Date myDate = new Date(12, 27, 1998);
	  
	  myDate.displayDate();
	  
	  myDate.setMonth(8);
	  myDate.setDay(9);
	  myDate.setYear(1999);
	  
	  myDate.displayDate();

	}

}
}
