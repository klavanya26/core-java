class MobileApp{
	public static void register(String patientName,String symptom,
								String email,long phoneNumber){			
		Reception.book(patientName,symptom,email,phoneNumber);
		
	}
}




/*task 1 --- resturant: tablemanager---seatGuest()
					  waiter---takeOrder()
					  OrderSystem--sendOrderToKitchen()
					  Kitchen--cook()
					  Chef--prepareOrder()
					  ReciepeBook--cookingSteps()
					write our own layer based on  Ingredients--
					
					
task 2 ---*/ 