import java.util.Scanner;


public class DedupeCheck{


    static int counter=0;
	private static String mobileNo[]={"8285297473","8081455875","9044096425","9452623395","1"};
	private static String email[]={"anshul.d27@gmail.com","anshul.d27@hotmail.com","anshulhumai@gmail.com","isthereeveryok@outlook.com","1"};
	private static String pancard[]={"ABC","DEF","GHI","XYZ","1"};
	private static String voterid[]={"123","456","111","222","1"};
	
    public static void verification(Customer customer){
    	@SuppressWarnings("resource")
		Scanner sc1=new Scanner(System.in);
    		for(int i=0;i<mobileNo.length;i++){
    			if(mobileNo[i].equals(customer.getMobile())){
    		     counter++;
    		     
    		    }
    	     }
    	
    		for(int i=0;i<email.length;i++){
    			if(email[i].equals(customer.getEmail())){
        		counter++;
    		    }
    	     }
    	
    	
    		for(int i=0;i<pancard.length;i++){
    			if(pancard[i].equals(pancard)){
        		counter++;

        		}
    	    }
    	
    	
    		for(int i=0;i<voterid.length;i++){
    			if(voterid[i].equals(voterid)){
        		counter++;
        		}
    	     }
    	
    	
    	if(counter>=2){
    		System.out.println("Depude Record Found. Do you want to Continue? (y/n)");
	    	String s1=sc1.next();
	    	char continueChoice = s1.charAt(0);
	    	if(continueChoice!='y'){
			        System.out.println("Thank You...");
			    	return;
		    	}

	   
    	}
    }
	
}
