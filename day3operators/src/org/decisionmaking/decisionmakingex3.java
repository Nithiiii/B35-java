package org.decisionmaking;

import java.util.Scanner;

public class decisionmakingex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		switch(a)
		{
		case 1:
			System.out.println("Hi");
		case 2:
			System.out.println("Hello");
		case 3:
			System.out.println("pengi");
			break;
			default:
				System.out.println("Invalid input");
				s.close();
		}
	}
}


