package assignment1;// assignment exercise 8.4(Rectangle Class Assignment)
//made by Victoria Young 2.25.24
//CSIS 212-week6
//Citations: Deitel, P., & Deitel, H. (2019). Java How To Program, Late Objects (11th ed.). Pearson Education (US). https://libertyonline.vitalsource.com/books/9780134763507
//JavaScript tutorial. (n.d.). https://www.w3schools.com/js/default.asp
//Pearson Education, Inc. (1992). Chapter 8 Classes and Objects A deeper look: Java How to Program, Late Objects Version PowerPoint (Vol. 10).
//Dr. K Aguar. (2019, June 17). Writing a rectangle class in Java [Video]. YouTube. https://www.youtube.com/watch?v=rbwGThbsnJ8


import java.util.Scanner;

public class RectangleClassTest {

	public static void main(String[] args) { 
		System.out.println("Victoria Young - Exercise 8.4 - Rectangle Class");
		Scanner input = new Scanner(System.in); //Scanner class called
		//new rectangle called
		RectangleClass rect1 = new RectangleClass();

		System.out.println("Set length of rectangle between 1.0 - 20.0: ");
		rect1.setLength(input.nextDouble()); //read from user assign to length 

		System.out.println("Set width of rectangle between 1.0 - 20.0: ");
		rect1.setWidth(input.nextDouble()); //read from user assign to width
		
		System.out.println(rect1.toString()); //print all info after calculation
		
	}

}
