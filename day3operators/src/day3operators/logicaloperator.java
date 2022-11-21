package day3operators;

import java.util.Scanner;

public class logicaloperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=10,b=5;
		boolean res= (a>b && b<8);
		boolean res1=(a<b || b>8);
		@SuppressWarnings("unused")
		boolean res2= !(a<b);
		
		System.out.println(res);
		System.out.println(res1);
		System.out.println(res2);
 s.close();
	}

	}


