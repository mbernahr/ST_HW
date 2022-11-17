package HW_6_Exercise_2_1;

import java.util.Scanner;

public class Player {

	private int x;
	private boolean isComputer;

	public int Start() {
		BetMore_Game xy = new BetMore_Game();

		if (this.isComputer) {
			xy.Play();
			x = xy.getX();
			return x;
		} else {
			Scanner scan = new Scanner(System.in);

			for (int i = 0; i < 5; i++) {
				xy.Play();
				x = xy.getX();
				if (i < 4) {
					System.out.println("Your number is: " + xy.getX() + " Want to try again? Y/N");
				} else {
					System.out.println("Your number is: " + xy.getX());
					break;
				}
				String yesOrNo = scan.next();

				if (yesOrNo.equalsIgnoreCase("N") || yesOrNo.equalsIgnoreCase("n")) {
					break;
				}

			}
			scan.close();
			return x;

		}

	}

	public Player(int x, boolean isComputer) {
		super();
		this.x = 0;
		this.isComputer = isComputer;
	}

	public boolean isComputer() {
		return isComputer;
	}

	public void setComputer(boolean isComputer) {
		this.isComputer = isComputer;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

}
