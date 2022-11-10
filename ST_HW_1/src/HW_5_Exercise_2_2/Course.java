package HW_5_Exercise_2_2;

public class Course {
	
	private int id;
	private String name;
	private int maxCapacity;
	private boolean isFull;
	
	public Professor[] professor = new Professor[3];
	public TA ta;
	public Department[] department = new Department[1];
	
	public Course(int id, String name, int cap, Professor prof) {
		
	}
	
	public void enroll(Student student) {
		
	}

	public void apply(TA ta) {
		
	}
	
	public void setMaxCap(int max) {
		
	}
	
	public Professor getProf() {
		return professor;
		
	}
	
	public TA getTA() {
		return ta;
	}
	
	public void setTA(TA ta) {
		this.ta = ta;
	}


	public void setName(String name) {
		this.name = name;
	}

	
	
}
