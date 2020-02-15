import java.util.Scanner;  //importing scanner class for taking input from user

class EvenOrOdd{  //declaring even or odd class
	
	public static void main(String args[]){ //main method
		//creating Scanner class object as input
		Scanner input = new Scanner(System.in);
		//asking user to enter a number to check weather it is even or odd
		System.out.print("Enter a number to know weather it is Even or Odd number :- ");
		//reading number from user
		int num = input.nextInt();
		
		//if condition to decide weather it is even or odd
		if(num%2==0)
			System.out.println(num + " is Even number");
		else
			System.out.println(num + " is Odd number");
		
		return;
	}
}
