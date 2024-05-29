package assignment1;
import java.util.Scanner; // import scanner class
//made by Victoria Young 1.18.24
//CSIS 212-week1
//Citations: 
//Alex Lee. (2019, February 7). While Loop Java Tutorial #37 [Video]. YouTube. https://www.youtube.com/watch?v=SGJ9DpxGCkY
//JavaScript tutorial. (n.d.). https://www.w3schools.com/js/default.asp
//TheCodingChannelPH. (2021, August 25). Java Tutorial #8🔴EMPLOYEE SALARY CALCULATOR PROGRAM | ELSE IF | PRINTF | Tagalog | English | 2021 [Video]. YouTube. https://www.youtube.com/watch?v=0SWN5v7PfZs
//Deitel, P., & Deitel, H. (2019). Java How To Program, Late Objects (11th ed.). Pearson Education (US). https://libertyonline.vitalsource.com/books/9780134763507
//


public class EmployeePayroll {
	
	public static void main(String[] args) {
		System.out.println("Victoria Young - Employee Payroll Calculator\n");
		Scanner input = new Scanner(System.in); //Scanner class called
		//variable declarations
		final int Standard_Work=40; //keep the same throughout
		double hourlyRate = 0; //will change to input from user
		double basicPay = 0; //will change to input from user
		double hoursWorked = 0; //will change to input from user
		double overTimePay = 0; //will change to input from user
		double overTime = 0; //needed for calculation
		double overTimeRate = 0; //needed for calculation
		double grossSalary = 0; //final answer for calculation
		int employeeCounter = 1; //count employees starting at 1
		
		
		while (employeeCounter <=3) {
			
		//Assign inputs to hourly rate and hours worked...
		System.out.print ("Enter hourly rate: "); //prompt
		hourlyRate = input.nextDouble(); //read from user
		System.out.print ("Enter hours worked: "); //prompt
		hoursWorked = input.nextDouble(); //read from user
		
		//Calculate...
		
		if (hoursWorked <= Standard_Work){
			basicPay = hoursWorked * hourlyRate;
			System.out.printf("Pay for employee %d%n is $%.2f%n", employeeCounter++, basicPay);
		} 
		else {
			basicPay= Standard_Work * hourlyRate; 
			//40 hours * basic rate
			overTime = hoursWorked - Standard_Work; 
			/*minus 40 from quantity
			 entered for amount of overtime hours*/
			overTimeRate = hourlyRate * 1.5;
			//calculate overtime amount based on input
			overTimePay = overTimeRate * overTime;
			//multiply this overtime amount to excess hours of work
			grossSalary = basicPay + overTimePay; 
			//final answer
			System.out.printf("Pay for employee %d%n is $%.2f%n", employeeCounter++, grossSalary);
		}
	
	}
	}	
	}
	

