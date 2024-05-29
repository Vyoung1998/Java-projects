package assignment1;// assignment exercise 7.13(DateClass Assignment)
//made by Victoria Young 2.25.24
//CSIS 212-week6
//Citations: JavaScript tutorial. (n.d.). https://www.w3schools.com/js/default.asp
//Deitel, P., & Deitel, H. (2019). Java How To Program, Late Objects (11th ed.). Pearson Education (US). https://libertyonline.vitalsource.com/books/9780134763507
//Pearson Education, Inc. (1992). Chapter 8 Classes and Objects A deeper look: Java How to Program, Late Objects Version PowerPoint (Vol. 10).

public class DateClassTest {

	public static void main(String[] args) {
		System.out.println("Victoria Young - Exercise 7.13 - Date Class");
		System.out.println("This is my birthday:");//some text to explain the dates...
		DateClass date = new DateClass(22,8,1998); 
		System.out.println(date.displayDate());
//my birthday, would only display correctly if entered as day, month, then year.
//I couldn't figure out why, please let me know your comments. I thought it would accept as month, day, then year, but it came out as 22/8/1998 when I did that.

		System.out.println("This is the day I finished my assignment:");
		DateClass date2 = new DateClass(25,2,2024); //this is today when I made this assignment
		System.out.println(date2.displayDate());
	}}
