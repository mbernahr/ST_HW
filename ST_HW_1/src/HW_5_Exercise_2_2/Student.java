package HW_5_Exercise_2_2;

public class Student {
	
	private int id;
	private String name;
	
	public Exam[] exam;
	//@invariant course != null
	public Course[] course;
	
	
	public Student(int id, String name, Exam[] exam, Course[] course) {
		super();
		this.id = id;
		this.name = name;
		this.exam = exam;
		this.course = course;
	}

	public Project getProject() {
		return null;
	}

	public String getName() {
		return name;
	}

	
	

}
