class Reception{
	public static void book(String patientName,String symptom,
							String email,long phoneNumber){
		Hospital.bookAppointment(patientName,symptom);
	}
}