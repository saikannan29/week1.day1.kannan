package week1.day1;

public class Student {
    String name="kannan";
	int rollNo=78930;
	public static void main(String args[]) {
		Student studentDetails = new Student();
		System.out.println(studentDetails.name);
		System.out.println(studentDetails.rollNo);
		studentDetails.college();
	}	
	public void college() {
	String collegeName="TestLeaf";
	System.out.println(collegeName);
}
}
