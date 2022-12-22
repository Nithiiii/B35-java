package org.tnsindia.client;

import org.tnsindia.application.Mbankfactory;
import org.tnsindia.application.Mcurrentacc;
import org.tnsindia.application.Msavingsacc;
import org.tnsindia.framework.bankfactory;
import org.tnsindia.framework.currentacc;
import org.tnsindia.framework.savingacc;



class client{
		public static void main(String args[])
		{
		
			bankfactory b =new Mbankfactory();
			savingacc s= new Msavingsacc(85639456,"arpitha", 60000, true);
			currentacc c = new Mcurrentacc(856936547,"bharath", 30000,10000);
			
			System.out.println("Saving Account");
			s.withdraw(s.getAccBal());
			
			System.out.println();
			
			System.out.println("Current Account");
			c.withdraw(c.getAccBal());
			
			System.out.println();
			
		    System.out.println(s);
		    System.out.println(c);
		    
		   
		}  
	} 


