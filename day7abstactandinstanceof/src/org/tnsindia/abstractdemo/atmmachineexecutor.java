package org.tnsindia.abstractdemo;
//driver class
public class  atmmachineexecutor {

	public static void main(String[] args) {
		atmmachine a=new atmmachinechild();
		//ATMMachineChild a=new ATMMachineChild();
		a.withdraw();
		a.display();

	}

}
