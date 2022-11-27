package OlympicGames2024;

public class Main {

	public static void main(String[] args) {


		
		
//		OlympicsTeams
		CompositeOlympicsTeams olympicsTeams = new CompositeOlympicsTeams("Olympics Teams");
		
//		AsiaTeam
		CompositeOlympicsTeams asiaTeam = new CompositeOlympicsTeams("Asia Teams");
//			ChinaTeam
		CompositeOlympicsTeams chinaTeam = new CompositeOlympicsTeams("China Teams");
//				ChinaWomensTeam
		CompositeOlympicsTeams chinaWomensTeam = new CompositeOlympicsTeams("China Womens Teams");
//				ChinaMensTeam
		CompositeOlympicsTeams chinaMensTeam = new CompositeOlympicsTeams("China Mens Teams");
//			Afghanistan
		CompositeOlympicsTeams afghanistan = new CompositeOlympicsTeams("Afghanistans");
		
//		AfricaTeam
		CompositeOlympicsTeams africaTeam = new CompositeOlympicsTeams("Africa Teams");
		
//		EuropeTeam
		CompositeOlympicsTeams europeTeam = new CompositeOlympicsTeams("Europe Teams");
//			GermanyTeam
		CompositeOlympicsTeams germanyTeam = new CompositeOlympicsTeams("Germany Teams");
//				GermanyWomensTeam
		CompositeOlympicsTeams germanyWomensTeam = new CompositeOlympicsTeams("Germany Womens Teams");
//				GermanyMensTeam
		CompositeOlympicsTeams germanyMensTeam = new CompositeOlympicsTeams("Germany Mens Teams");
//			ItalyTeam
		CompositeOlympicsTeams italyTeam = new CompositeOlympicsTeams("Italy Teams");
//				ItalyWomensTeam
		CompositeOlympicsTeams italyWomensTeam = new CompositeOlympicsTeams("Italy Womens Teams");
//				ItalyMensTeam
		CompositeOlympicsTeams italyMensTeam = new CompositeOlympicsTeams("Italy Mens Teams");
		
//		SouthAmericaTeam
		CompositeOlympicsTeams southAmericaTeam = new CompositeOlympicsTeams("South America Teams");
		

		
		
		
		
//		Teams:
		OlympicsTeams teakwondo = new Teams("Teakwondo Team", 3, 5);
		OlympicsTeams waterpolo = new Teams("Waterpolo Team", 1, 2);
		OlympicsTeams artisticGymnastics = new Teams("ArtisticGymnastics Team", 8, 3); 
		OlympicsTeams shooting = new Teams("Shooting Team", 6, 1);
		OlympicsTeams cycling = new Teams("Cycling Team", 1, 1);
		OlympicsTeams tennis = new Teams("Tennis Team", 1, 9);
		OlympicsTeams tableTennis = new Teams("Table Tennis Team", 2, 6);
		OlympicsTeams footballG = new Teams("Football Team ", 11,14);
		OlympicsTeams alpineSky = new Teams("Alpine Sky Team", 3, 5);
		OlympicsTeams footballI = new Teams("Football Team", 11, 15);
		OlympicsTeams swimming = new Teams("Swimming Team", 4, 1);
		
//		Italy
		italyMensTeam.add(swimming);
		italyMensTeam.add(footballI);
		italyWomensTeam.add(alpineSky);
		italyTeam.add(italyMensTeam);
		italyTeam.add(italyWomensTeam);
//		Germany
		germanyMensTeam.add(footballG);
		germanyMensTeam.add(tableTennis);
		germanyWomensTeam.add(tennis);
		germanyWomensTeam.add(cycling);
		germanyTeam.add(germanyMensTeam);
		germanyTeam.add(germanyWomensTeam);
//		Europe
		europeTeam.add(italyTeam);
		europeTeam.add(germanyTeam);
		
//		China
		chinaMensTeam.add(shooting);
		chinaWomensTeam.add(artisticGymnastics);
		chinaWomensTeam.add(waterpolo);
		chinaWomensTeam.add(teakwondo);
		chinaTeam.add(chinaMensTeam);
		chinaTeam.add(chinaWomensTeam);
//		Asia
		asiaTeam.add(afghanistan);
		asiaTeam.add(chinaTeam);
		
//		Olympics
		olympicsTeams.add(asiaTeam);
		olympicsTeams.add(africaTeam);
		olympicsTeams.add(europeTeam);
		olympicsTeams.add(southAmericaTeam);
		
		
		Visitor visitor = new ConcreteVisitor();
		
		System.out.println("4.a:");
		System.out.println();
		germanyMensTeam.getNameandNumberOfAthletes(visitor);
		
		System.out.println("-----------------------------------");
		System.out.println("4.b:");
		System.out.println();
		
		germanyTeam.getNameandNumberOfGoldMedals(visitor);
		
		System.out.println("-----------------------------------");
		System.out.println("4.c:");
		System.out.println();
		
		asiaTeam.getNameandNumberOfGoldMedals(visitor);
		
		System.out.println("-----------------------------------");
		System.out.println("4.d:");
		System.out.println();
		
		olympicsTeams.getNameandNumberOfAthletes(visitor);
		
		
		
	}

}
