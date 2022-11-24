package HW_7_Exercise_2_1;

public class OlympicComitee {
	public static void main(String[] args) {
		Group olympicTeam = new Group("Olympics Team");
		Group asiaTeam = new Group("Asia Team");
		Group africaTeam = new Group("Africa Team");
		Group europeTeam = new Group("Europe Team");
		Group southAmerciaTeam = new Group("South America Team");
		Group chinaTeam = new Group("China Team");
		Group afghanistanTeam = new Group("Afghanistan Team");
		Group germanyTeam = new Group("Germany Team");
		Group italyTeam = new Group("Italy Team");
		Group chinaWomenTeam = new Group("China Women's Team");
        Group chinaMenTeam = new Group("China Men's Team");
        Group germanyWomenTeam = new Group("Germany Women's Team");
        Group germanyMenTeam = new Group("Germany Men's Team");
        Group italyWomenTeam = new Group("Italy Women's Team");
        Group italyMenTeam = new Group("Italy Men's Team");
        
        chinaWomenTeam.addTeam(new Discipline("Women's Teakwondo", 4, 3));
        chinaWomenTeam.addTeam(new Discipline("Women's Waterpolo", 9, 8));
        chinaWomenTeam.addTeam(new Discipline("Women's Artistic Gymnastics Team", 6, 3));
        chinaMenTeam.addTeam(new Discipline("Men's Shooting", 4, 5));
        germanyWomenTeam.addTeam(new Discipline("Women's Cycling", 2, 9));
        germanyWomenTeam.addTeam(new Discipline("Women's Tennis", 2, 5));
        germanyMenTeam.addTeam(new Discipline("Men's Table Tennis", 6, 3));
        germanyMenTeam.addTeam(new Discipline("Men's Football", 22, 2));
        italyWomenTeam.addTeam(new Discipline("Women's Alpine Sky", 4, 1));
        italyMenTeam.addTeam(new Discipline("Men's Football", 22, 1));
        italyMenTeam.addTeam(new Discipline("Men's Swimming", 2, 1));

        chinaTeam.addTeam(chinaWomenTeam);
        chinaTeam.addTeam(chinaMenTeam);
        asiaTeam.addTeam(chinaTeam);
        asiaTeam.addTeam(afghanistanTeam);
        germanyTeam.addTeam(germanyWomenTeam);
        germanyTeam.addTeam(germanyMenTeam);
        italyTeam.addTeam(italyWomenTeam);
        italyTeam.addTeam(italyMenTeam);
        europeTeam.addTeam(germanyTeam);
        europeTeam.addTeam(italyTeam);
        olympicTeam.addTeam(asiaTeam);
        olympicTeam.addTeam(africaTeam);
        olympicTeam.addTeam(europeTeam);
        olympicTeam.addTeam(southAmerciaTeam);
		
        germanyMenTeam.showAthletes();
        germanyTeam.showMedals();
        asiaTeam.showMedals();
        olympicTeam.showAthletes();
	}
	
}
