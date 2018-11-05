package fifth;

import java.util.Scanner;

public class ketang5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    while (sc.hasNext()) {
	        String choice = sc.next();
	        try {
	            if (choice.equals("number"))
	                throw new NumberFormatException();
	            else if (choice.equals("illegal")) {
	                throw new IllegalArgumentException();
	            } else if (choice.equals("except")) {
	                throw new Exception();
	            } else
	            	break;
	        }
	        catch(NumberFormatException e) {
	        	System.out.println("number format exception");
	        	System.out.println(e);
	        }
	       
	        catch(IllegalArgumentException e){
	        	System.out.println("illegal argument exception");

	            System.out.println(e);
	        }
	        catch (Exception e){
	        	System.out.println("other exception");
	            System.out.println(e);
	        }
	        
	        finally{
	         
	        }
	        /*���������Ĵ�*/
	    }//end while
	    sc.close();

	}

}
