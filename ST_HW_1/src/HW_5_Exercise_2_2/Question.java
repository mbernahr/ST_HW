package HW_5_Exercise_2_2;

public abstract class Question {

	private String task;
	private int maxValue;
	private int id;
	
	public Question(int id, String task, int value) {
		this.id = id;
		this.task = task;
		this.maxValue = value;
	}
	
}
