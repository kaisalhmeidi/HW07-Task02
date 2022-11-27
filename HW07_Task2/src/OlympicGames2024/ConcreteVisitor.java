package OlympicGames2024;

import java.util.ArrayList;
import java.util.List;

public class ConcreteVisitor implements Visitor {

	@Override
	public void visitCompositegetNameandNumberOfAthletes(CompositeOlympicsTeams compositeOlympicsTeams) {
		Visitor visitor = new ConcreteVisitor();
		List<OlympicsTeams> olympicsTeams = new ArrayList<>();
		olympicsTeams = compositeOlympicsTeams.getOlympicsTeams();
		if (olympicsTeams.isEmpty()) {
			System.out.println(compositeOlympicsTeams.getName() + ": 0");
		}else {
			System.out.println(compositeOlympicsTeams.getName() + ":");
			for(OlympicsTeams newOlympicsTeams : olympicsTeams) {
				newOlympicsTeams.getNameandNumberOfAthletes(visitor);
			}
		}		
	}

	@Override
	public void visitCompositegetNameandNumberOfGoldMedals(CompositeOlympicsTeams compositeOlympicsTeams) {
		Visitor visitor = new ConcreteVisitor();
		List<OlympicsTeams> olympicsTeams = new ArrayList<>();
		olympicsTeams = compositeOlympicsTeams.getOlympicsTeams();
		if (olympicsTeams.isEmpty()) {
			System.out.println(compositeOlympicsTeams.getName() + ": 0");
		}else {
			System.out.println(compositeOlympicsTeams.getName() + ":");
			for(OlympicsTeams newOlympicsTeams : olympicsTeams) {
				newOlympicsTeams.getNameandNumberOfGoldMedals(visitor);
			}
		}
	}

	@Override
	public void visitTeamsgetNameandNumberOfAthletes(Teams teams) {
		System.out.println("Team: " + teams.getName() + ", Number of Athletes: " + teams.getNumberOfAthletes());
		
	}

	@Override
	public void visitTeamsgetNameandNumberOfGoldMedals(Teams teams) {
		System.out.println("Team: " + teams.getName() + ", Number of Gold Medals: " + teams.getNumberOfGoldMedals());
		
	}

	
}
