package org.tnsindia.abstractdemo;
//abstractclass
public abstract class person {
	//private data members
		private String name;
		private String gender;
		
		//constructor
		public person(String name, String gender) {
			super();
			this.name = name;
			this.gender = gender;
		}
		//abstract method
		public abstract void work();
		
		@Override
		public String toString() {
			return "Person [name=" + name + ", gender=" + gender + "]";
		}
		
		//user-defined method
		//non-abstract method
		public void changeName(String newname)
		{
			name=newname;
		}
}
