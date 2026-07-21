class AgricultureTools{
	public static void main(String [] tools){
		String[] agricultureTools = {"Tractor", "Plough", "Cultivator", "Rotavator", "Seeder",
									"Seed Drill", "Harvester", "Combine Harvester", "Sprayer", "Power Tiller",
									"Hoe", "Spade", "Shovel", "Sickle", "Rake", 
									"Wheelbarrow", "Water Pump", "Drip Irrigation Kit", "Lawn Mower", "Pruning Shears", 
									"Axe", "Weeder", "Soil Tester", "Thresher", "Mulcher", 
									"Disc Harrow", "Leveler", "Fertilizer Spreader", "Irrigation Pipe", "Hand Trowel"};
		System.out.println("the tools of agriculture are:");
		for(String AgriTools:agricultureTools){
			System.out.println(AgriTools);
		}
	}
}