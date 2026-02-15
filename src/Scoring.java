public class Scoring {
	public static int scoringAge;
	public static int scoringIncome;
	public static int scoringExperience;
	public static int scoringLiability;
	public static float totalScore;
	
	@SuppressWarnings("static-access")
	public static void loanScoring(Customer customer) {

		//this is for age scoring
		if(customer.getLoanChoice()==4){   /// for student age can be below 18
			scoringAge=100;
		}
		else if(customer.getAge()<18){
			System.out.println("Loan cannot be granted because "+customer.getName()+" is minor.");
			return;
		}
		else if (customer.getAge()>=18&&customer.getAge()<=25) {
		   scoringAge=80;
		}
		else if (customer.getAge()>25&&customer.getAge()<=45) {
			scoringAge=100;
		}
		else if (customer.getAge()>45&&customer.getAge()<=60) {
			scoringAge=75;
		}
		else if (customer.getAge()>60&&customer.getAge()<=75) {
			scoringAge=60;
		}
		else if(customer.getAge()>75){
			System.out.println("Loan cannot be granted because "+customer.getName()+" over age.");
			return;
		}
		
		
		//this is for income scoring
		if((customer.getIncome()*customer.getTenure())<=(customer.getLoanAmount())/4){
			System.out.println("Loan cannot be granted because "+customer.getName()+"'s income is very less. ");
			return;
		}
		else if(((customer.getIncome()*customer.getTenure())>(customer.getLoanAmount())/4)&&((customer.getIncome()*customer.getTenure())<=(customer.getLoanAmount())/2)){
			scoringIncome=50;
		}
		else if((customer.getIncome()*customer.getTenure())>(customer.getLoanAmount())/2){
			scoringIncome=100;
		}

		
		//this is for scoring experience
		if(customer.getLoanChoice()==4){
			scoringExperience=100;   /// as student dont have any experience
		}
		else if((customer.getAge()-customer.getExperience())<=18){
			System.out.println("The experience shown by "+customer.getName()+" is fake.");
			return;
		}
		else if (customer.getExperience()>=2&&customer.getExperience()<5) {
			scoringExperience=60;
		}
		else if (customer.getExperience()>=5&&customer.getExperience()<8) {
			scoringExperience=80;
		}
		else if (customer.getExperience()>=8) {
			scoringExperience=100;
		}
		
		//this is for scoring liability
		if(customer.getLiability()<(customer.getLoanAmount()/4)){
			scoringLiability=100;
		}
		else if((customer.getLiability()<(customer.getLoanAmount()/2))&&(customer.getLiability()>(customer.getLoanAmount()/4))){
			scoringLiability=90;
		}
		else if((customer.getLiability()>(customer.getLoanAmount()/2))&&(customer.getLiability()<(customer.getLoanAmount()))){
			scoringLiability=60;
		}
		else if((customer.getLiability()>(customer.getLoanAmount()*1.5))&&(customer.getLiability()<(customer.getLoanAmount())*2)){
			scoringLiability=40;
		}
		else if(customer.getLiability()>(customer.getLoanAmount())*2){
			scoringLiability=20;
		}
		
		totalScore= (float) ((scoringAge+scoringExperience+scoringIncome+scoringLiability)/400.0);
        customer.setScore(totalScore);
	}

}
