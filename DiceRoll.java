//Exercise 6.17 JHTP: (Dice Rolling) Write an application to simulate the rolling of two dice.
//The application should use an object of class Random once to roll the first die and again to roll
//the second die. The sum of the two values should then be calculated. Each die can show an
//integer value from 1 to 6, so the sum of the clause will vary from 2 to 12, with 7 being the most
//frequent sum, and 2 and 12 the least frequent. Figure 6.21 shows the 36 possible combinations
//of the two die. Your application should roll the dice 36,000 times. Use a one-dimensional array
//to tally the number of times each possible sum appears. Display the results in a tabular format

//CSIS 212-week5
//Citations: JavaScript tutorial. (n.d.). https://www.w3schools.com/js/default.asp
//Deitel, P., & Deitel, H. (2019). Java How To Program, Late Objects (11th ed.). Pearson Education (US). https://libertyonline.vitalsource.com/books/9780134763507
//Alex Lee. (2018, October 11). Arrays in Java Tutorial #10 [Video]. YouTube. https://www.youtube.com/watch?v=xzjZy-dHHLw

package assignment1;

import java.security.SecureRandom; //for secure random number generation

public class DiceRoll {
	private static final SecureRandom random = new SecureRandom(); //initializing random generation

	public static void main(String[] args) {
		System.out.println("Victoria Young - Assignment 5 - Dice Rolls");
		int [] arrays = new int[13]; //makes 12 arrays (2 die, 6 sides) fails after roll 13
		
		for (int i = 0; i < 36000; i++) {//allows die to roll up to 36000 times, increments by 1
	
			int die1 = 1 + random.nextInt(6); //makes it start at 1 and not 0 for the 6 sides of the die
			int die2 = 1 + random.nextInt(6); //makes it start at 1 and not 0 for the 6 sides of the die
			
			int sum = die1 + die2; //adds both die together
			
			++arrays[sum];//continues to next array
		}// end of calculation
		System.out.printf("%s %s%n","Sum", "Arrays");//to make simple print out chart 
		
		for (int i = 2; 1 < arrays.length; i++) {
			System.out.printf("%2d %5d%n", i, arrays[i]);//to print out the list of arrays for each
		}
	}
}
