package ex;

import vo.Student;

//Learning Management System
public class LMSApp {
	public static void main(String[] args) {

		//Student 객체를 생성
		Student s1 = new Student();
		Student s2 = new Student("박구현", 20);

		s1.setName("박구현");
		s1.setAge(20);
		s1.setMajor("전자공학과");

		System.out.println("이름:" + s1.getName());
		System.out.println("나이:" + s1.getAge());
		System.out.println("전공:" + s1.getMajor());
	}
}
