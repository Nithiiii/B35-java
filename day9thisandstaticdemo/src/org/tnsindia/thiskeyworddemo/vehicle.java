package org.tnsindia.thiskeyworddemo;
//3. this can be passed as an argument in the method call
public class vehicle {
	//data members
	public int speed;
	public void display1(vehicle v)
	{
		System.out.println("Speed is: "+speed+"Km/hr");
	}
	
	public void display2()
	{
		//passing this keyword as an argument to call display1()method
		display1(this);
	}


}
