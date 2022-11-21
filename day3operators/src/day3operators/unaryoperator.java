package day3operators;

import java.util.Scanner;

public class unaryoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=1,b=4;
		int x=a++;
		@SuppressWarnings("unused")
		int y=++b;
		int z=a+x;
		System.out.println(z);
s.close();
	}

	}


