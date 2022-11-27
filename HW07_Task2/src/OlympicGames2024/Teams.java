package OlympicGames2024;


public class Teams implements OlympicsTeams {
	
	private String name;
	private int numberOfAthletes;
	private int numberOfGoldMedals;
	
	
//  Constructor	
	public Teams(String name, int numberOfAthletes, int numberOfGoldMedals) {
		this.name = name;
		this.numberOfAthletes = numberOfAthletes;
		this.numberOfGoldMedals = numberOfGoldMedals;
	}
	
	
//	Visitor

	@Override
	public void getNameandNumberOfAthletes(Visitor visitor) {
		visitor.visitTeamsgetNameandNumberOfAthletes(this);
		
	}


	@Override
	public void getNameandNumberOfGoldMedals(Visitor visitor) {
		visitor.visitTeamsgetNameandNumberOfGoldMedals(this);
		
	}

	
//  Getters&&Setters
	public String getName() {
		return name;
	}
	
	public int getNumberOfAthletes() {
		return numberOfAthletes;
	}
	
	public int getNumberOfGoldMedals() {
		return numberOfGoldMedals;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setNumberOfAthletes(int numberOfAthletes) {
		this.numberOfAthletes = numberOfAthletes;
	}


	public void setNumberOfGoldMedals(int numberOfGoldMedals) {
		this.numberOfGoldMedals = numberOfGoldMedals;
	}
	
	


}
