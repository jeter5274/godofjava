package e.thread.practice;

import java.util.Date;

public class TimerThread extends Thread{
	
	public void run(){
		printCurrentTime();
	}

	public void printCurrentTime(){
	
		Date date = new Date();
		for(int i=0; i<10; i++){
			try{
				System.out.println(date.toString()+" "+System.currentTimeMillis());
				Thread.sleep(1000);
			}catch(InterruptedException ie){
				ie.printStackTrace();
			}
		}
		
	}
}