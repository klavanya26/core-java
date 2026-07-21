class Cricket{
	public static void main(String sam[]){
		String menBatters[]={"ViratKohli","RohitSharma","ShubmanGill","JoeRoot","SteveSmith",
						"KaneWilliamson","BabarAzam","TravisHead","KLRahul","RishabhPant"};
		System.out.println("the men batters in the cricket are:");
		for(String battingMen:menBatters){
			System.out.println(battingMen);
		}
		String menBowlers[]={"JaspritBumrah","MohammedShami","KuldeepYadav","RavindraJadeja","PatCummins",
						"MitchellStarc","RashidKhan","TrentBoult","JoshHazlewood","ShaheenAfridi"};
		System.out.println("the men bowling in tthe cricket are:");
		for(String bowlingMen:menBowlers){
			System.out.println(bowlingMen);
		}
		String womenBatters[]={"SmritiMandhana","HarmanpreetKaur","ShafaliVerma","JemimahRodrigues","BethMooney",
						"MegLanning","EllysePerry","NatSciverBrunt","LauraWolvaardt","ChamariAthapaththu"};
		System.out.println("the women batting in tthe cricket are:");
		for(String battingWomen:womenBatters){
			System.out.println(battingWomen);
		}
		String womenBowlers[]={"DeeptiSharma","RenukaSingh","SophieEcclestone","MeganSchutt","ShabnimIsmail",
						"AmeliaKerr","JessJonassen","PoonamYadav","RadhaYadav","AlanaKing"};
		System.out.println("the women bowling in the cricket are:");
		for(String bowlingWomen:womenBowlers){
			System.out.println(bowlingWomen);
		}
	}
}