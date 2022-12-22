package org.tnsindia.application;

import org.tnsindia.framework.savingacc;

public class  Msavingsacc extends savingacc {
		static final float MINBAL=00.0f;



		@Override
		public void withdraw(float accBal) {
			{
				System.out.println("Account no.is: "+this.getAccNo()+" "+
						"Account name is: "+this.getAccNm()+" "+
						"Balance is: "+this.getAccBal());
			}
			if(accBal>=10000.00f)
			{
				System.out.println("You can withdraw Money");
			}
			else 
			{
				System.out.println("You can not withdraw Money");
			}
			
			System.out.println(accBal);
		}



		public Msavingsacc(int accNo, String accNm, float accBal, boolean isSalaried) {
			super(accNo, accNm, accBal, isSalaried);
			
			
			
		}




		@Override
		public String toString() {
			return "Msavingsacc [toString()=" + super.toString() + "]";
		}



		
		

	}



