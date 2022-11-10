package HW_5_Exercise_2_2;

public class Professor extends Employee{
	

	public Exam[] exam;
	//@invariant course != null
	public Course[] course;
	
	
	public Professor(String name, int employeedId, Exam[] exam, Course[] course) {
		super(name, employeedId);
		this.exam = exam;
		this.course = course;
	}

	public void publicCourse() {
		
	}
	
	public void assignTA() {
		
	}
	
	public void addCourse() {
		
	}

}
