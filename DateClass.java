package assignment1;// assignment exercise 7.13(DateClass Assignment)
//made by Victoria Young 2.25.24
//CSIS 212-week6
//Citations: JavaScript tutorial. (n.d.). https://www.w3schools.com/js/default.asp
//Deitel, P., & Deitel, H. (2019). Java How To Program, Late Objects (11th ed.). Pearson Education (US). https://libertyonline.vitalsource.com/books/9780134763507
//Pearson Education, Inc. (1992). Chapter 8 Classes and Objects A deeper look: Java How to Program, Late Objects Version PowerPoint (Vol. 10).



public class DateClass {

	//initialize each instance variable
	private int day; 
	private int month;
	private int year;
	
	
	public DateClass(int day, int month, int year) {
		 //invoke constructor with three arguments assuming all are correct
		//no catch statements or parameters...
			this.month = month; 
			this.day = day; 
			this.year = year;
	}
	
	//set the information and store it
	public void setMonth(int month) {
		this.month = month; //stores info 
	}
	public void setDay(int day) {
		this.day = day;
	}
	public void setYear(int year) {
		this.year = year; 
	}
	
	//get values to return
	public int getMonth() {
		return month; //return here
	}
	public int getDay() {
		return day;
	}
	public int getYear() {
		return year;
	}
	
	public String displayDate() //Displays like example: mm/dd/yyyy
	{
		return month + "/" + day + "/" + year;
	}
}	


