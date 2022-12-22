package org.tnsindia.application;

import org.tnsindia.framework.bankfactory;
import org.tnsindia.framework.currentacc;
import org.tnsindia.framework.savingacc;

public class Mbankfactory extends bankfactory {

		@Override
		public savingacc getNewsavingacc(int accNo, String accNm, float accBal, boolean isSalaried) {
			Msavingsacc s=new Msavingsacc(accNo,accNm,accBal,isSalaried);
			return s;
		}

		@Override
		public currentacc getNewcurrentacc(int accNo, String accNm, float accBal, float creditLimited) {
			Mcurrentacc c=new Mcurrentacc(accNo,accNm,accBal,creditLimited);
			return c;
		}

	}


