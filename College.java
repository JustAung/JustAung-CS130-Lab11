package Lab_11;

public class College {
String name;
String address;
Student student;
Department department;
College(String name, String address, Student student, Department department){
	this.name=name;
	this.address=address;
	this.student=student;
	this.department=department;
}
public static void main(String[] args) {
	Student student = new Student("Aung", "Something Avenue", "CS", 18);
	Department department = new Department("CS", "Chair 8");
	College c = new College("Bellarmine", "2001 Newburg Rd", student, department);
	System.out.println("------College Details------");
	System.out.println("College Name: "+c.name);
	System.out.println("College Address: "+c.address);
	System.out.println("------Student Details------");
	System.out.println("Student Name: "+student.name);
	System.out.println("Student Address: "+student.address);
	System.out.println("Student dept: "+student.dept);
	System.out.println("Student age: "+student.age);
	System.out.println("------Department Details------");
	System.out.println("Department Name: "+department.name);
	System.out.println("Department Chair: "+department.chair);
}
}
