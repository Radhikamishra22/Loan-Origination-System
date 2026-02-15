
public class EmiPlan {
	static int i=1;
	private static int remaining;
	private static int emi;
	@SuppressWarnings("static-access")
	public static void emiDetail(Customer customer){
		
		
		customer.setEmi(customer.getAmountWithInterest()/(customer.getTenure()*12));
		
		remaining= (int) (customer.getAmountWithInterest()-customer.getEmi());
		emi=(int) customer.getEmi();
		System.out.println("***************************************************************");
		System.out.println("***************************EMI PLAN****************************");
		System.out.println("***************************************************************");
		System.out.println("*MONTH****************EMI**************REMAINING AMOUNT TO PAY*");
        while(i!=(customer.getTenure()*12)+1){
        	
        System.out.println(""+i+"                  "+emi+"                   "+remaining);
        remaining=(int) (remaining-customer.getEmi());
        i++;
        }
	
	}
}


