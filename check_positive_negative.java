import java.util.Scanner;

public class check_positive_negative {
	public static void main(String [] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number:");
	int number=sc.nextInt();
	if (number>0) {
		System.out.println("Number is positive" );
	}
	else if(number<0) {
		System.out.println("Number is negative");
	}
	else {
		System.out.println("Number is 0");
	}
	}
}
	
