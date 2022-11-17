package HW_6_Exercise_2_1;

import java.util.Scanner;

public class Game_Chair {

	public static void main(String[] args) {

		Player computer = new Player(0, true);
		Player player_2 = new Player(0, false);

		computer.Start();
		player_2.Start();

		BetMore_Game game = new BetMore_Game();
		game.findWinner(computer, player_2);

	}

}
