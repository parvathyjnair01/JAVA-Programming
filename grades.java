package java_lab ;
import java.util.Scanner;

public class grades {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks:");
		double marks=sc.nextDouble();
		if(marks>=90) {
			System.out.println("Grade A");
		}
		else if(marks>=75) {
			System.out.println("Grade B");
		}
		else if(marks>=60) {
			System.out.println("Grade C");
		}
		else if(marks>=40) {
			System.out.println("Grade D");
		}
		else {
			System.out.println("Fail");
		}
		
	
	}

}
