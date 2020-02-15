/*
	This program take input(student marks) from user and output his grade.
	
	if marks>89 S
	marks >79 and marks<=89 A
	marks >69 and marks<=79 B
	marks >59 and marks<=69 C
	marks >49 and marks<=59 D
	marks >39 and marks<=49 E
	marks <=30 Fail 
*/
//importing scanner class for taking input from user
import java.util.Scanner;
//creating GradeDecider Class
class GradeDecider{
	//main function
	public static void main(String args[]){
		//Scanner class object creating for taking input from user
		Scanner input = new Scanner(System.in);
		int marks; 	//declaring marks
		//printing message to user or student
		System.out.print("Enter your marks to know your grade :- ");
		//reading input from user or student
		marks = input.nextInt();
		if(marks>89 && marks<=100)
			System.out.println("Congratulations you got S Grade.");
		else if(marks>79 && marks<=89)
			System.out.println("Congratulations you got A Grade.");
		else if(marks>69 && marks<=79)
			System.out.println("Congratulations you got B Grade.");
		else if(marks>59 && marks<=69)
			System.out.println("Congratulations you got C Grade.");
		else if(marks>49 && marks<=59)
			System.out.println("Congratulations you got D Grade.");
		else if(marks>39 && marks<=49)
			System.out.println("Congratulations you got E Grade.");
		else if(marks>=0 && marks<=39)
			System.out.println("Sorry You failed in this Subject.");
		else
			System.out.println("Invalid Marks !!!. Please Enter Valid Marks.");
	}	
}
