package finalassignment;
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

public enum BusinessDays {
	//enum list
	SUN("4-12"), MON("5-1"), TUE("6-2"), WED("7-3"), THU("8-4"), FRI("9-5"), SAT("10-6");
			
	private String hours; //make variable to display hours in enum, private so it can't be changed or seen
			
	BusinessDays(String hours) {// enum constructor
		this.hours = hours;//store info
			}
	
	public String getHours() {//return and keep data safe this way
		return hours;
	}
}
