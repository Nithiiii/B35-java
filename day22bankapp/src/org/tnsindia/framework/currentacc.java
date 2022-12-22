package org.tnsindia.framework;

	

	public abstract class currentacc extends bankacc {

		final private float creditLimit;
		
		public currentacc(int accNo,String accNm,float accBal,float creditLimit)
		{
			super(accNo,accNm,accBal);
			this.creditLimit = creditLimit;
		}
		@Override
		public void withdraw(float accBal)
		{
			System.out.println("Account no.is: "+this.getAccNo()+" "+
					"Account name is: "+this.getAccNm()+" "+
					"Balance is: "+this.getAccBal());
		}
		@Override
		public String toString() {
			return "currentacc [creditLimit=" + creditLimit + "]";
		}


		
		}




