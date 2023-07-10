package week3.day1.assignments.org.student;

import week3.day1.assignments.org.department.Department;

public class Student extends Department{
	public void studentName() {
		System.out.println("Name Of The Student  ----------->From STUDENT Class");

	}
public void studentDept() {
	System.out.println("Department Of The Student  ----------->From STUDENT Class");

}
public void studentId() {
	System.out.println("ID Of The Student  ----------->From STUDENT Class");

}

	public static void main(String[] args) {
		System.out.println("Multi LevelInheritance Example:");
		Student s=new Student();
		s.collegeCode();
		s.collegeName();
		s.collegeRank();
		s.deptName();
		s.studentDept();
		s.studentId();
		s.studentName();
	}

}
