package HW_7_Exercise_2_1;

public class Discipline implements Team {

	private String name;
	private int numberOfAthletes;
	private int numberOfGoldMedals;

	public Discipline(String name, int athletes, int gold) {
		this.name = name;
		numberOfAthletes = athletes;
		numberOfGoldMedals = gold;
	}

	@Override
	public void showAthletes() {
		System.out.println("Team: " + name + ", Number of Athletes: " + numberOfAthletes);

	}

	@Override
	public void showMedals() {
		System.out.println(" Team: " + name + ", Number of Gold medals: " + numberOfGoldMedals);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfAthletes() {
		return numberOfAthletes;
	}

	public void setNumberOfAthletes(int numberOfAthletes) {
		this.numberOfAthletes = numberOfAthletes;
	}

	public int getNumberOfGoldMedals() {
		return numberOfGoldMedals;
	}

	public void setNumberOfGoldMedals(int numberOfGoldMedals) {
		this.numberOfGoldMedals = numberOfGoldMedals;
	}

}
