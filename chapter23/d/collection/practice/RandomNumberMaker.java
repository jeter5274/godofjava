package d.collection.practice;

import java.util.*;

public class RandomNumberMaker{
	
	public static void main(String[] args){
		RandomNumberMaker test = new RandomNumberMaker();
		for(int i=0; i<10; i++){
			System.out.println(test.getSixNumber()); 
		}
	}

	public HashSet<Integer> getSixNumber(){
		HashSet<Integer> sixNum = new HashSet<Integer>();
		Random random = new Random();
		while(sixNum.size() < 6){
			sixNum.add(random.nextInt(45));
		}

		return sixNum;
	}
}	