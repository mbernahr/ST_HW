package HW_6_Exercise_2_1;

public class BetMore_Game {

	private int x;

	public int Play() {
		Shuffle y = new Shuffle();
		y.pick_card();
		x = y.getX();
		return x;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void findWinner(Player computer, Player player_2) {
		System.out.println("Computer: " + computer.getX());
		System.out.println("You: " + player_2.getX());
		if (computer.getX() > player_2.getX()) {
			System.out.println("The Computer wins!");
		} else {
			System.out.println("YOU WIN!");
		}
	}

}
