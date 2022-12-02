package org.tnsindia.thiskeyworddemo;
//2.It can be used to invoke or initiate current class constructor

public class flower {
	
	//private data member
	private String name;
	
	
	
	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//default constructor
	public flower() {
		super();
		// TODO Auto-generated constructor stub
	}
	//Parameterized constructor

	public flower(String name) {
		this.name=name;
	}
	
	


}
