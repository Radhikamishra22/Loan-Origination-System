import java.util.Scanner;
public class LoanOriginationSystem implements ValidationUtility {

	@SuppressWarnings({ "resource", "static-access" })
	public static void main(String[] args) {
		System.out.println("***************************************************************");
		System.out.println("******************WELCOME TO MISHRA JI FINANCE******************");
		System.out.println("***************************************************************");
        Customer customer=new Customer();
        Scanner scanner=new Scanner(System.in);
        
        do{
        	System.out.print("Enter Name: ");
            customer.setName(scanner.nextLine());
            if(ValidationUtility.isEmpty(customer.getName()))
		    {
	            System.out.println("Name can not be left blank");
		    }
        }while(ValidationUtility.isEmpty(customer.getName()));
        

 		do{
 			System.out.print("Enter Mobile No: ");
            customer.setMobile(scanner.nextLine());
            if(ValidationUtility.isEmpty(customer.getMobile()))
			   {
		         System.out.println("Mobile can not be left blank");
		       }
           }while(ValidationUtility.isEmpty(customer.getMobile()));

        do{
        	System.out.print("Enter Email i.d.: ");
            customer.setEmail(scanner.nextLine());
            if(ValidationUtility.isEmpty(customer.getEmail()))
			{
		     System.out.println("Email i.d. can not be left blank");
		    }
        }while(ValidationUtility.isEmpty(customer.getEmail()));
        
        System.out.print("Amount required for Loan: ");
        customer.setLoanAmount(scanner.nextFloat());
        System.out.print("Tenure(in years): ");
        customer.setTenure(scanner.nextInt());
        
 	   System.out.println("Select type of loan, you want to apply:");
       System.out.println("1: Home Loan(85%)");
       System.out.println("2: Auto Loan(50%)");
       System.out.println("3: Personal Loan(100%)");
       System.out.println("4: Education Loan(100%)");
       customer.setLoanChoice(scanner.nextInt());
       System.out.println("***************************************************************");
       System.out.println("************************QUICK DATA ENTRY***********************");
       System.out.println("***************************************************************");
       System.out.println(" User Name : "+customer.getName());
       System.out.println(" Mobile No. : "+customer.getMobile());
       System.out.println(" Email i.d.: "+customer.getEmail());
       System.out.print(" Income Source: ");
       customer.setIncomeSource(scanner.next());
       System.out.print(" Income: ");
       customer.setIncome(scanner.nextInt());
       System.out.print(" Assets: ");
       customer.setAssets(scanner.nextInt());
       System.out.print(" Liability: ");
       customer.setLiability(scanner.nextInt());
       System.out.print(" Qualification: ");
       customer.setQualification(scanner.next());
       System.out.print(" Age: ");
       customer.setAge(scanner.nextInt());
       System.out.print(" Experience(in years): ");
       customer.setExperience(scanner.nextInt());
       System.out.print(" PAN Card: ");
       customer.setPancard(scanner.next());
       System.out.print(" Voter I.D.: ");
       customer.setVoterid(scanner.next());
       
        DedupeCheck.verification(customer);
        Scoring.loanScoring(customer);
        Loan.loanType(customer);
        EmiPlan.emiDetail(customer);
        

	}
}
