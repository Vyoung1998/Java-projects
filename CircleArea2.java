package assignment1;// assignment exercise 5.20 (Find Circle Area)
//made by Victoria Young 2.11.24
//CSIS 212-week4
//Citations: JavaScript tutorial. (n.d.). https://www.w3schools.com/js/default.asp
//Deitel, P., & Deitel, H. (2019). Java How To Program, Late Objects (11th ed.). Pearson Education (US). https://libertyonline.vitalsource.com/books/9780134763507
import java.util.Scanner; //import scanner package

public class CircleArea2 {
	public static void main(String[] args) {
		System.out.println("Victoria Young - Assignment 4 - Find Circle Radius\n");
		 }
	public void calculateAreas() {
		Scanner input = new Scanner(System.in); //initialize scanner package
		
		System.out.print("Enter the radius of the circle (Enter a negative number to quit program): ");
		
		double radius = input.nextDouble(); //make input number type double
			
		while (radius >=0 ) {
			circleArea(radius);	
			System.out.print("Enter the radius (Enter a negative number to quit program): ");
			radius = input.nextDouble(); //sets input as radius
			}//end while loop here
		}//end calculate area here  
	
	//calculate area of circle with info
	public void circleArea(double radius) {
			System.out.printf("Area is %f\n", Math.PI * radius * radius);	
	}//end method here
}//end class circleArea here

