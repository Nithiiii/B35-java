package org.tnsindia.abstractdemo;

public class employee extends person {

	private int ID;
	public employee(String name, String gender,int id) {
		super(name, gender);
		ID=id;
		// TODO Auto-generated constructor stub
	}
	public void work() {

		if(ID>0)
		{
			System.out.println("Employee Exist");
		}
		else
		{
			System.out.println("Not Exist");
		}
	}}
