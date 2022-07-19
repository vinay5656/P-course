package streamAPI;

import java.util.ArrayList;

class Student{
	public int rollNo;
	public String name;
	public int mark;
	/**
	 * @param rollNo
	 * @param name
	 * @param mark
	 */
	public Student(int rollNo, String name, int mark) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.mark = mark;
	}
	
	
}

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(101803296,"Vinay",60));
		studentList.add(new Student(101803297,"Ravi",40));
		studentList.add(new Student(101803298,"Bhavesh",90));
		studentList.add(new Student(101803299,"Janvi",45));
		studentList.add(new Student(101803290,"Loki",33));
		
		long count = studentList.stream().filter(student -> student.mark>=50).count();
		System.out.println(count);

	}

}
