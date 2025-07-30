package javaLab;
class Student{
	int rollNumber;
	String Name;
	int m1,m2,m3;
	float avg;
	
Student(int rollNumber, String Name, int m1, int m2, int m3){
	this.rollNumber=rollNumber;
	this.Name=Name;
	this.m1=m1;
	this.m2=m2;
	this.m3=m3;
	
       } 
   
public void average() {
	avg=(m1+m2+m3)/3;
}
public void displayDetais() {
	System.out.println("Roll Number:"+ rollNumber);
	System.out.println("Name:"+ Name);
	System.out.println("Mark1:"+ m1 +"\tMark2:"+ m2 +"\tMark3:"+ m3);
	System.out.println("Average mark:"+ avg);
}

public class StudentDemo {
	public static void main(String []args) {
		Student std1=new Student(10, "Demo", 22, 55,85);
		std1.average();
		std1.displayDetais();
		Student std2=new Student(30, "Hello", 58, 98,55);
		std2.average();
		std2.displayDetais();
		
 
	}
}

}
