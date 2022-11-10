package HW_5_Exercise_2_2;

public class Exam {

	private int maxValue;
	
	//@invariant questions != null
	public Question[] questions;
	public Student[] students;
	public Professor[] professor;
	//@invariant ta != null
	public TA[] ta;
	
	
	public Exam(int maxValue, Question[] questions, Student[] students, Professor[] professor, TA[] ta) {
		super();
		this.maxValue = maxValue;
		this.questions = questions;
		this.students = students;
		this.professor = professor;
		this.ta = ta;
	}

	public boolean register(Student student) {
		return false;
	}
	
	public void addQuestion(int id, String task, int value) {
		
	}
	
	public Student getRegisteredStudents() {
		return null;
	}
	
	public void setMaxValue(int max) {
		this.maxValue = max;
	}
}
