
import java.util.Scanner;
public class Array {
	public static void main(String[]args) {
		//**** enter elemnts by user input *****
		int[] array=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter elements:");
		for(int i=0;i<10;i++) {
			array[i]=sc.nextInt();
		}
		System.out.println("Elements are:");
		for(int number:array) {
			System.out.println(number+"\t");
		}
		//**** elemnts are are already given in array ***
		
		/*int [] array = {10,20,30,40,50};
		System.out.println("Length="+array.length);
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		System.out.println("Numbers are:");
		for(int number:array) {
			System.out.println(number+"\t");
		}*/
	}

}
