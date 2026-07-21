class EcommerceCategories{
	public static void main(String [] ecommerce){
		String[] ecommerceCategories = {"Mobiles", "Laptops", "Computers", "Electronics", "Fashion", 
										"Men Clothing", "Women Clothing", "Kids Clothing", "Footwear", "Watches", 
										"Books", "Groceries", "Home Appliances", "Kitchen Appliances", "Furniture", 
										"Beauty Products", "Health Care", "Sports", "Fitness", "Toys", 
										"Baby Products", "Jewellery", "Automotive", "Pet Supplies", "Office Supplies", 
										"Stationery", "Gaming", "Music", "Gift Cards", "Travel Accessories"};
		System.out.println("the categories in the ecommerce are:");
		for(String Category:ecommerceCategories){
			System.out.println(Category);
		}
	}
}