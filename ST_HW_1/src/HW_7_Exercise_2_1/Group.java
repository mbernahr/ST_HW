package HW_7_Exercise_2_1;

import java.util.ArrayList;

public class Group implements Team {

	private String name;
	private ArrayList<Team> teams;

	public Group(String name) {
		this.name = name;
		teams = new ArrayList<Team>();
	}

	public void addTeam(Team team) {
		teams.add(team);
	}

	public ArrayList<Team> getTeam() {
		return teams;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Team> getTeams() {
		return teams;
	}

	public void setTeams(ArrayList<Team> teams) {
		this.teams = teams;
	}

	@Override
	public void showAthletes() {
		System.out.println(name);
		for (int i = 0; i < teams.size(); i++) {
			teams.get(i).showAthletes();
		}

	}

	@Override
	public void showMedals() {
		System.out.println(name);

		for (int i = 0; i < teams.size(); i++) {
			teams.get(i).showMedals();
		}

	}

}
