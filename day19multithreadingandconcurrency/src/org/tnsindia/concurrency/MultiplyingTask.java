package org.tnsindia.concurrency;

import java.util.concurrent.Callable;


//Callable interface
@SuppressWarnings("rawtypes")
public class MultiplyingTask implements Callable{
   int x,y;
   long sleeptime;
   
   //constructor
   public MultiplyingTask(int x,int y, long sleeptime) {
  	 super();
  	 this.x=x;
  	 this.y=y;
  	 this.sleeptime=sleeptime;
   }
   

	@Override
	public Object call() throws Exception {
	Thread.sleep(sleeptime);
		return x*y;
	}
}