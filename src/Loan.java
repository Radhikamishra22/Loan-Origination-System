public class Loan {

	public static void loanType(Customer customer){
		switch(customer.getLoanChoice()){
		
		case 1:customer.setAmountWithInterest((customer.getScore()*customer.getLoanAmount())*1.10f*0.85f); //1.10f implies 10% of interest..
		       break;// for home loan (85%)
		case 2: customer.setAmountWithInterest((customer.getScore()*customer.getLoanAmount())*1.10f*.50f); //1.10f implies 10% of interest..
		       break;//for auto loan(50%)
		case 3:customer.setAmountWithInterest((customer.getScore()*customer.getLoanAmount())*1.10f*1.00f); //1.10f implies 10% of interest..
			   break;//for personal loan(100%)  
		case 4: customer.setAmountWithInterest((customer.getScore()*customer.getLoanAmount())*1.10f*1.00f); //1.10f implies 10% of interest..
		   break;//for education loan(100%) 
		}
		

	}
   }

