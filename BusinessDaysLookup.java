package finalassignment;
import java.util.Scanner;

//made by Victoria Young 3.8.24
//CSIS 212-week8
//Citations: Deitel, P., & Deitel, H. (2019). Java How To Program, Late Objects (11th ed.). Pearson Education (US). https://libertyonline.vitalsource.com/books/9780134763507
//Coding with John. (2021, October 11). Java Enums explained in 6 minutes [Video]. YouTube. https://www.youtube.com/watch?v=wq9SJb8VeyM
//Caleb Curry. (2019, August 2). Java Programming Tutorial 37 - Search an Array with for Loop [Video]. YouTube. https://www.youtube.com/watch?v=zHsXmZCtXtI
//Caleb Curry. (2019a, August 2). Java Programming Tutorial 36 - Array Values from Input with for Loop [Video]. YouTube. https://www.youtube.com/watch?v=WZ0yfhpUYaM
//Professor Saad. (2013, November 13). Java Tutorial - Working with Parallel Arrays [Video]. YouTube. https://www.youtube.com/watch?v=2n00B3pH6jM
//Heidi Gentry Kolen. (2014, September 27). Java Parallel Arrays (for beginners) [Video]. YouTube. https://www.youtube.com/watch?v=5HDsOiyeSn0
//Alex Lee. (2023, March 30). How to get array input from a user in Java using Scanner [Video]. YouTube. https://www.youtube.com/watch?v=yHvQVc0WUF4
//Using Dialog Boxes PDF: Chapter 3, Introduction to classes, objects, methods and strings. (n.d.). https://canvas.liberty.edu/users/1128451/files/86461907?wrap=1&verifier=WgUnuPIVIvDq76Ihg4QqGj2zjZ8Qn7rq6fmlFqzc.

public class BusinessDaysLookup {
	public static void main(String[] args) {
		System.out.println("Victoria Young - Final Assignment Part 2 - Business Days LookUp\n");
		Scanner in = new Scanner(System.in);//activate scanner class
		
		BusinessDays aDay;//activating enum
		String input = "";//assign to nothing at first, user will change this
		
		for(BusinessDays day: BusinessDays.values())//retrieve values of days in list, then ask user to choose
			System.out.print(day + " ");
			
			System.out.print("\nPlease pick a day: ");
			input = in.nextLine().toUpperCase();//converts to upper case to match to enum list
			
			if(input.length() > 3)
				input = input.substring(0, 3); //trimming here in case full name of day entered
			
			try //if it matches, then return info
			{
				aDay = BusinessDays.valueOf(input); 
				
				System.out.println("The hours for " + aDay + " are " + aDay.getHours());//displays info
			}
			catch(Exception e) {
				if (input.isEmpty())
					System.out.println("Nothing entered exitting.");//if nothing entered
				else 
					System.out.println("Error: invalid entry!\n\t" + e);//if invalid entry
			}
			
		
	}
}
