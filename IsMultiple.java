package assignment1;// assignment exercise 5.35 (isMultiple)
//made by Victoria Young 2.11.24
//CSIS 212-week4
//Citations: JavaScript tutorial. (n.d.). https://www.w3schools.com/js/default.asp
//Deitel, P., & Deitel, H. (2019). Java How To Program, Late Objects (11th ed.). Pearson Education (US). https://libertyonline.vitalsource.com/books/9780134763507
import java.util.*;
import java.util.Scanner;

public class IsMultiple {  
	public void checkMultiples() {
		Scanner input = new Scanner (System.in);
		//initiate variables for inputs
		int first; 
		int second; 
		
		System.out.print("Enter first number to check (0 to exit program):");
		first = input.nextInt();

		while (first != 0) { //using 0 to make escape here
			System.out.print("Enter second number: ");
			second = input.nextInt();
			
			if (multiple(first,second))
				System.out.printf("%d is a multiple of %d\n", second, first);
			else
				System.out.printf("%d is not a multiple of %d\n", second, first);
			System.out.print("Enter first number to check (0 to exit program):");
			first = input.nextInt();
		}// end of while statement
	}//end of checkMultiples
	
		public boolean multiple (int firstNumber, int secondNumber) {
			return secondNumber % firstNumber == 0;
		}

}
