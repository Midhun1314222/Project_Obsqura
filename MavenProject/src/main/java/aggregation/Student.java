package aggregation;

public class Student {
String studentName;
int rollNum;

Address a;

public Student(String studentName,int rollNum,Address a) {
this.studentName=studentName;
this.rollNum=rollNum;
this.a=a;
}
public void display() {
	System.out.println("Student name "+studentName);
	System.out.println("Student roll number "+rollNum);
	System.out.println("Student house name "+a.houseName);
	System.out.println("Student pin code "+a.pinCode);
	System.out.println("Student state name "+a.state);



}
public static void main(String[] args) {
	Address obj=new Address(12,"House",52626,"Kerala");
	Student obj1=new Student("Midhun",24,obj);
	obj1.display();
}
}
