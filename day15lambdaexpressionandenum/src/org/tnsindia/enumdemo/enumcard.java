package org.tnsindia.enumdemo;

//we can implement interface using enum
public enum enumcard implements CardsDemo{
	//Enum constants
	HEART,CLUB,DIAMOND,SPADES;

	@Override
	public void accept() {
		System.out.println("Selected shape in the cards are: "+this);
		
	}
}
