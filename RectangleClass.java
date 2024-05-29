package assignment1;// assignment exercise 8.4(Rectangle Class Assignment)
//made by Victoria Young 2.25.24
//CSIS 212-week6
//Citations: Deitel, P., & Deitel, H. (2019). Java How To Program, Late Objects (11th ed.). Pearson Education (US). https://libertyonline.vitalsource.com/books/9780134763507
//JavaScript tutorial. (n.d.). https://www.w3schools.com/js/default.asp
//Pearson Education, Inc. (1992). Chapter 8 Classes and Objects A deeper look: Java How to Program, Late Objects Version PowerPoint (Vol. 10).
//Dr. K Aguar. (2019, June 17). Writing a rectangle class in Java [Video]. YouTube. https://www.youtube.com/watch?v=rbwGThbsnJ8



public class RectangleClass {
	//initializing variables making them private
	private double length; 
	private double width;
	
	//constructor, makes them default to 1, and allows functions to be called elsewhere
	public RectangleClass() {
		setLength(1.0f);
		setWidth(1.0f);
	}
	
	
	//methods, allow only between 1.0 and 20.0
	public void setLength(double length) {
		if (length >= 1.0f && length <= 20.0f) {
		 this.length = length;
		}
		else 
			throw new IllegalArgumentException("Length must be between 0.0 and 20.0");
	}
	//end length method
	public void setWidth(double width) {
		if (width >= 1.0f && width <= 20.0f) {
		this.width = width; 
		}
		else 
			throw new IllegalArgumentException("Width must be between 0.0 and 20.0");
	}
	//end width method
	
	//get methods
	public double getLength() {
		return this.length;
	}
	public double getWidth() {
		return this.width;
	}
	
	//calculate area here
	public double getArea() {
		return (width * length);
	}
	
	//convert to string to print the information
	public String toString() {
		return String.format(
				"Width: %.2f\nLength: %.2f\nArea: %.2f\n", getLength(), getWidth(), getArea());
	}
	
	}
