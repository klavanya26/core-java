class OTT{
	public static void main(String [] movies){
		String hotstar[]={"Label","Arya","Arya2","Bahubali","Bahubali2",
						"MS Dhoni","Bigil","KoffeeWithKaran","LaughterCheif","Connet",
						"Parampara","Kerala Story","BigMouth","WeddingAgreement","Love Mocktail1",
						"Love Mocktail2","Love Mocktail3","CriminalJustice","CID","Cocktail1",
						"Cocktail2","CityOfDreams","SaveTheTigers","TheNightManager","Kannagi"};
		System.out.println("the hotstar movies are:");
		for(String Series:hotstar){
			System.out.println(Series);
		}
		String netflix[]={"AllOfUsAreDead","Code8","ProjectPower","TripleFrontier","HeartOfStone",
							"CarryOn","OutsideTheWire","RebelRidge","Underground","SpenserConfidential",
							"Lou","Kate","TheMother","Spaceman","Polar",
							"Bright","Luther","Atlas","Damsel","Lift",
							"Wednesday","Extraction","RedNotice","BirdBox","TheGrayMan"};
		System.out.println("the netflix series are: ");
		for (String webseries:netflix){
			System.out.println(webseries);
		}
		String amazon[]={"MadeInHeaven","CrashCourse","MumbaiDaires","TheLastHour","Dhoota",
							"InspectorRishi","Chhorii","Sherni","SardarUdham","JaiBhim",
							"Tanhaji","ModernLove","CampusBeats","Mizapur","Farzi",
							"Panchayat","FamilyMan","PaatalLok","Citadel","Breath",
							"Suzhal","Jubilee","Poacher","HostelDaze","BandishBandits"};
		System.out.println("the amazon series are: ");
		for (String Movie:amazon){
			System.out.println(Movie);
		}
	}
}