package org.tnsindia.framework;

public abstract class bankfactory {
	
		abstract public savingacc getNewsavingacc(int accNo, String accNm, float accBal, boolean isSalaried);
		abstract public currentacc getNewcurrentacc(int accNo, String accNm, float accBal,float creditLimited);
	}
