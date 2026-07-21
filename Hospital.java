class Hospital{
	public static void bookAppointment(String patientName,String symptom){
		Nurse.basicCheck(patientName,symptom,true,false);
	}
}