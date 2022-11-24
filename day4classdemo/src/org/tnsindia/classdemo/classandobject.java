package org.tnsindia.classdemo;
import java.util.Scanner;
public class classandobject {
	//Driver class
		public static void main(String[] args) {

			Scanner s=new Scanner(System.in);
			System.out.println("Enter the speed of the car:");
			int speed=s.nextInt();
			
			//creation of object
			car obj=new car();
			
			//compile time input
			//obj.speed=45;
			obj.speed(speed);
			s.close();
		}
	}
