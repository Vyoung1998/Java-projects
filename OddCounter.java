//made by Victoria Young 1.18.24
//CSIS 212-week1
//Deitel, P., & Deitel, H. (2019). Java How To Program, Late Objects (11th ed.). Pearson Education (US). https://libertyonline.vitalsource.com/books/9780134763507
//JavaScript tutorial. (n.d.). https://www.w3schools.com/js/default.asp
//
package assignment1;

public class OddCounter {
	public static void main(String[] args) {
	System.out.println("Victoria Young - Assignment 3 - Product of Odd Integers\n");
	int total = 1;
	
	for (int counter = 2; counter<=15; counter+= 2) {
		total += counter;
		}
	System.out.printf("Sum is %d%n", total);
}
}