package OlympicGames2024;

public interface Visitor {
	
	public void visitCompositegetNameandNumberOfAthletes(CompositeOlympicsTeams compositeOlympicsTeams);
	public void visitCompositegetNameandNumberOfGoldMedals(CompositeOlympicsTeams compositeOlympicsTeams);
	public void visitTeamsgetNameandNumberOfAthletes(Teams teams);
	public void visitTeamsgetNameandNumberOfGoldMedals(Teams teams);
	
}
