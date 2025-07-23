package java_lab;
import java.util.Scanner;
public class studentDetails {
	String Name;
	int Roll_number;
public void studentDetails() {
	System.out.println("Name:"+Name);
	System.out.println("Roll number:"+Roll_number);
}
	public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
		studentDetails std=new studentDetails();
		System.out.println("Enter name:");
		std.Name=sc.nextLine();
		System.out.println("Enter roll number:");
		std.Roll_number=sc.nextInt();
		std.studentDetails();
}

}
