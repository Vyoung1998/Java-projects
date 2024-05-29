package assignment1;
import java.util.Scanner;

//made by Victoria Young 1.18.24
//CSIS 212-week1
//Deitel, P., & Deitel, H. (2019). Java How To Program, Late Objects (11th ed.). Pearson Education (US). https://libertyonline.vitalsource.com/books/9780134763507
//JavaScript tutorial. (n.d.). https://www.w3schools.com/js/default.asp
//
public class BarChart {
	public static void main(String[] args) {
		System.out.println("Victoria Young - Assignment 3 part 2 - BarChart\n");
		System.out.println("Please enter 5 numbers between 1 and 30...");
		Scanner input = new Scanner(System.in);
		int num1=0;
		int num2=0;
		int num3=0;
		int num4=0;
		int num5=0;
		
		int inputnumber, counter=1;
while(counter<=5) {
	inputnumber = input.nextInt();
	if(inputnumber >=1 && inputnumber<=30)
		//rules, only 1 - 30 to be input
		//set inputed numbers as variables num1 through num5
	{
		switch(counter) {
		case 1: 
			num1 = inputnumber;//set input number to this variable
			break;
		case 2: 
			num2 = inputnumber;//set input number to this variable
			break;
		case 3: 
			num3 = inputnumber;//set input number to this variable
			break;
		case 4: 
			num4 = inputnumber;//set input number to this variable
			break;
		case 5:
			num5 = inputnumber; //set input number to this variable
			break;
	}
		counter++;//to cycle through cases...
	}
	else //if incorrect number outside of 1-30 is inputted...
	{
		System.out.println("Please enter a number between 1 and 30.");
	}	
}
//end of inputing numbers, now to set them as values and print asterisks
int value = 0;
for(counter =1; counter <= 5; counter++) { 
	switch(counter)
	{
	case 1: 
		value = num1;
		break;
	case 2: 
		value = num2;
		break;
	case 3: 
		value = num3;
		break;
	case 4:
		value = num4;
		break;
	case 5:
		value = num5;
		break;
	}
	for(int j= 1; j<=value; j++) {
		System.out.print("*");
	}
	System.out.println();
}

}
}
