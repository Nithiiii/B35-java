package org.tnsindia.thiskeyworddemo;
//5.to invoke current class constructor
public class color {
public String name;
	
	//default constructor
	color()
	{
		this("RED");//invoking paramterized constructor
		System.out.println("Default Constructor");
	}
	//paramterized constructor
	color(String name)
	{
		System.out.println("The color is: "+name);
	}

}
