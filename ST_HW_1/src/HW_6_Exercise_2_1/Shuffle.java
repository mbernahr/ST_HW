package HW_6_Exercise_2_1;

public class Shuffle {

	private int x;

	public int pick_card() {
		x = (int) (Math.random() * 100) + 1;
		return x;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

}
