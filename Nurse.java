class Nurse{
	public static void basicCheck(String patientName,String symptom,
								boolean isBP,boolean isSugar){
		Doctor.treat(patientName,symptom);
	}
}