package d.collection.practice;

import java.util.*;

public class RandomNumberStatistics{

	public static void main(String[] args){

		RandomNumberStatistics test = new RandomNumberStatistics();
		test.getRandomNumberStatisics();		

	}

	private final int DATA_BOUNDARY = 50;
	Hashtable<Integer, Integer> hashtable = new Hashtable<Integer, Integer>();

	public void getRandomNumberStatisics(){
		Random rd = new Random();
		for(int i=0; i<5000; i++) putCurrentNumber((rd.nextInt(DATA_BOUNDARY)+1));
		printStaticstics();
	}

	public void putCurrentNumber(int tempNumber){
		if(hashtable.containsKey(tempNumber)) hashtable.put(tempNumber, hashtable.get(tempNumber)+1);
		else hashtable.put(tempNumber, 1);
	}

	public void printStaticstics(){
		Set<Integer> keySet = hashtable.keySet();
		for(int tempKey: keySet){
			System.out.print(tempKey+ "=" +hashtable.get(tempKey)+" ");
			if(tempKey%10 == 1) System.out.println();
		}
	}
}