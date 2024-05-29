package assignment1;// assignment exercise 5.35 (Computer Assist Instruction)
//made by Victoria Young 2.11.24
//CSIS 212-week4
//Citations: JavaScript tutorial. (n.d.). https://www.w3schools.com/js/default.asp
//Deitel, P., & Deitel, H. (2019). Java How To Program, Late Objects (11th ed.). Pearson Education (US). https://libertyonline.vitalsource.com/books/9780134763507

import java.util.Random;
import java.util.Scanner;

public class Multiply {
		Random randomNumbers = new Random(); //makes random numbers
		int answer; //initiates variable
		
		//ask student the question here
		public void quiz() {
			Scanner input = new Scanner(System.in);
			  int guess = 0; // the students guess here
			  
			  while ( guess !=-1) {
				  checkResponse(guess);
				  System.out.println("Enter our answer (-1 to exit program):");
				  guess = input.nextInt();
			  }//end while
		}//end this method
		
		//ask student random generated math question
		public void createQuestion() {
			int digit1 = randomNumbers.nextInt(10);
			int digit2 = randomNumbers.nextInt(10);
			
			answer = digit1*digit2; //assign correct answer here  
			System.out.printf("How much is %d times %d?\n", digit1, digit2);
		}//end method createQuestion
		
		public void checkResponse(int guess) {
			if (guess != answer)
				System.out.println("No. Please try again.");
			else {
				System.out.println("Very Good!");
				createQuestion();
			}//end else
		}//end method checkResponse
	//ends method Multiply here	
//Ends StudentQuiz here
}//Ends MultipleCheck here
  
