package org.tnsindia.abstractdemo;

public class atmmachinechild extends atmmachine{

	//provided the implementation to abstarct method of parent class
	@Override
	void withdraw() {
		
		int balance=50000;
		System.out.println("Withdrawing amount is: "+balance);
		
	}

}
