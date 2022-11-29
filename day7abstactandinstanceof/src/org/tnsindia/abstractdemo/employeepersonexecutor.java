package org.tnsindia.abstractdemo;
//driver class
public class employeepersonexecutor {
	
		public static void main(String[] args) {
			person p1=new employee("Rajesh","Male",23);
			person p2=new employee("Monika","Female",-4);
			
			//to return the data that we inserted
			System.out.println(p1.toString());
			System.out.println(p2.toString());
			p1.work();
			p2.work();


		}


}
