import java.util.Scanner;

public class Transpose {
	public static void main(String[]args) {
		
	// *** transpose of the matrix ***
	
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter number of rows:");
			int row=sc.nextInt();
			System.out.println("Enter number of column:");
			int col=sc.nextInt();
			
			int[][] matrix=new int[row][col];
			int[][] transpose=new int[col][row];
			System.out.println("Enter matrix elements:");
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					matrix[i][j]=sc.nextInt();
				}
			}
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					transpose[j][i]=matrix[i][j];
				}
			}
			  System.out.println("Transpose elements:");
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					System.out.println(transpose[i][j] + "\t");
				}
				System.out.println();
			}
		
	}
}
