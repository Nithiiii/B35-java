package org.tnsindia.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Example1 {

@SuppressWarnings("unused")

	public static void main(String[] args) {
		//LocalDate d=LocalDate.now();
		//LocalTime obj=LocalTime.now();
		LocalDateTime obj1=LocalDateTime.now();
		LocalDate obj2=LocalDate.of(2022, 2, 28);
		//System.out.println(d);
		//System.out.println(obj);
		
		
		System.out.println(obj1);
		System.out.println(obj2);
		

	}

}
