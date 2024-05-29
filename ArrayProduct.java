//Exercise 6.14 JHTP: (Variable-Length Argument List) Write an application that calculates the
//product of a series of integers that are passed to method product using a variable-length
//argument list. Test your method with several calls, each with a different number of arguments

//CSIS 212-week5
//Citations: JavaScript tutorial. (n.d.). https://www.w3schools.com/js/default.asp
//Deitel, P., & Deitel, H. (2019). Java How To Program, Late Objects (11th ed.). Pearson Education (US). https://libertyonline.vitalsource.com/books/9780134763507
//Alex Lee. (2018, October 11). Arrays in Java Tutorial #10 [Video]. YouTube. https://www.youtube.com/watch?v=xzjZy-dHHLw
package assignment1;

public class ArrayProduct {
	public static int product(int... numbers) {//initiate array of numbers
		if (numbers.length == 0)//if array is empty, return 
			return 0;
		
		int total = 1;//start at beginning of array
		
		for (int number: numbers)
			total *= number; //multiplies each number in array, sets to total
		
		return total;
	}
	
	public static void main(String[] args) {
		System.out.println("Victoria Young - Assignment 5 - Product Arrays");
		System.out.println();//nothing will show, no numbers in array
		System.out.println(product(10));//product of 10*1=10
		System.out.println(product(10,8));//product of 10*8*1=80
		System.out.println(product(10,5,10));//product of 10*5*10*1=500
	}
}
