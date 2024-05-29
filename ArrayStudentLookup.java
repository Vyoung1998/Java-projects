package finalassignment;
import java.util.Scanner;
import javax.swing.JOptionPane; 
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

public class ArrayStudentLookup {
	
	//initiate variables
	 private int[] studentID = {1111,2222,3333,4444,5555,6666,7777,8888,9999,1000};
	 private int[] averageGrade = {50,55,60,65,70,75,80,85,90,95};
	 private String[] firstName = {"Jill", "Jane", "Joseph", "Joe","Jason","Jacob","Jessica","Janet","Jade","Jordan"};

	 //constructor
	 public ArrayStudentLookup(int[] studentID, int[] averageGrade, String[] firstName) {
		 this.studentID = studentID;
		 this.averageGrade = averageGrade;
		 this.firstName = firstName;
		 
	 }
	 
	 
	public ArrayStudentLookup() {
		// TODO Auto-generated constructor stub
	}

	//to print all info test... did this to get started.
	public void getStudentInfo() {
		Scanner input = new Scanner(System.in);
		//prompt user input without dialog box...
		System.out.println("Enter Student ID:");
		
		//prompt user input here with dialog box... this works then doesn't continue program?
		//String enter = JOptionPane.showInputDialog("Enter Student ID: ");
		
		//assign input to variable here
		int x = input.nextInt();
		
	for(int i = 0; i < studentID.length; i++) {
		if(studentID[i] == x) {
		//Below is code without dialog message box (works)
		System.out.printf("Student ID: %d\n First Name: %s\n Average Grade %d\n", studentID[i], firstName[i], averageGrade[i]);
		
		//attempt here to use dialog box, this doesn't work.
		//String message = String.format("Student ID: %d\n First Name: %s\n Average Grade %d\n", studentID[i], firstName[i], averageGrade[i]);
		//Display here
		//JOptionPane.showMessageDialog(null, message);
		
		//then leave loop
		System.exit(x);
		}
	}
	
	//if fail, send this message
	//code below without dialog box (works)
	System.out.printf("Invalid ID. Please try again.\n");
	//with dialog box...
	//JOptionPane.showMessageDialog(null, "Invalid ID. Please try again.\n");
	
	//then repeat to attempt new input
	getStudentInfo();
	
	}
}
	

 