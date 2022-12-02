package org.tnsindia.thiskeyworddemo;
//driver class
public class executor {

	public static void main(String[] args) {
		account a=new account();
		a.accept(12225, "Saving Account");
		a.display();
		
		
		flower f=new flower();
		f.setName("Rose");
		System.out.println("Flower is: "+f.getName());
		
		vehicle v=new vehicle();
		v.speed=45;
		v.display2();
		
		food f1=new food();
		f1.get1();
		
		color c=new color();
	

	}
	}


