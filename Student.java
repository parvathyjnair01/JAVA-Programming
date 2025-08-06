package Javalab;
class Student_details {
	String name;
	int studentNumber;
	static int studentCount=0;
	
	Student_details(String name) {
		this.name=name;
		studentNumber=++studentCount;
	}
	public static int getstudentCount() {
		return studentCount;
	}
	public void getStudent_details() {
		System.out.println("Student number:" +studentNumber);
		System.out.println("Student name:" +name);
	}
}

public class Student {
	public static void main(String [] args) {
		Student_details s1= new Student_details("Parvathy J");
		Student_details s2= new Student_details("Ambady");
		Student_details s3= new Student_details("Jyothi");
		s1.getStudent_details();
		s2.getStudent_details();
		s3.getStudent_details();
		System.out.println("Total students:"+Student_details.getstudentCount());
		
	}

}
