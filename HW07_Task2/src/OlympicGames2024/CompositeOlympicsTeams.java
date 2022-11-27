package OlympicGames2024;

import java.util.ArrayList;
import java.util.List;

public class CompositeOlympicsTeams implements OlympicsTeams{
	
	private List<OlympicsTeams> olympicsTeams = new ArrayList<>();
	private String name;

	
	
//  Constructor
	public CompositeOlympicsTeams(String name) {
		super();
		this.name = name;

	}

// Methodes
	public void add(OlympicsTeams olympicsTeams) {
		this.olympicsTeams.add(olympicsTeams);
	}
	public void remove(OlympicsTeams olympicsTeams) {
		this.olympicsTeams.remove(olympicsTeams);
		
	}
		
//	Visitor

	@Override
	public void getNameandNumberOfAthletes(Visitor visitor) {
		visitor.visitCompositegetNameandNumberOfAthletes(this);
	}

	@Override
	public void getNameandNumberOfGoldMedals(Visitor visitor) {
		visitor.visitCompositegetNameandNumberOfGoldMedals(this);
	}	
	
	
//	Getters&&Setters

	public List<OlympicsTeams> getOlympicsTeams() {
		return olympicsTeams;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
