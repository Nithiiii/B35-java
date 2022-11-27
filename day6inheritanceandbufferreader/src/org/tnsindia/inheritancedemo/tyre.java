package org.tnsindia.inheritancedemo;
//child class for BMW
	public class tyre extends bmw{
		
		private String Tyre_name;
		public void display3()
		{
			System.out.println("The tyre name is: "+Tyre_name);
		}
		//setters and getters

		public String getTyre_name() {
			return Tyre_name;
		}
		public void setTyre_name(String Tyre_name) {
			this.Tyre_name = Tyre_name;
		}

}
