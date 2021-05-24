package d.collection.practice;

import java.util.*;

public class ManageHeight{
	
	public static void main(String args[]){

		ManageHeight test = new ManageHeight();
		test.setData();
		for(int i=0; i<5; i++) test.printAverage(i); //test.printHeight(i);

	}

	ArrayList<ArrayList<Integer>> gradeHeights = new ArrayList<ArrayList<Integer>>();

	public void setData(){
				
		ArrayList<Integer> grade1 = new ArrayList<Integer>();
		grade1.add(170);
		grade1.add(180);
		grade1.add(173);
		grade1.add(175);
		grade1.add(177);		

		ArrayList<Integer> grade2 = new ArrayList<Integer>();
		grade2.add(160);;
		grade2.add(165);
		grade2.add(167);
		grade2.add(186);

		ArrayList<Integer> grade3 = new ArrayList<Integer>();
		grade3.add(158);
		grade3.add(177);
		grade3.add(187);
		grade3.add(176);

		ArrayList<Integer> grade4 = new ArrayList<Integer>();
		grade4.add(173);
		grade4.add(181);
		grade4.add(182);

		ArrayList<Integer> grade5 = new ArrayList<Integer>();
		grade5.add(170);
		grade5.add(180);;
		grade5.add(165);
		grade5.add(177);
		grade5.add(172);

		gradeHeights.add(grade1);
		gradeHeights.add(grade2);
		gradeHeights.add(grade3);
		gradeHeights.add(grade4);
		gradeHeights.add(grade5);
	}

	public void printHeight(int classNo){

		System.out.println("Class No.: "+(classNo+1));
		
		ArrayList<Integer> gradeHeight = gradeHeights.get(classNo);
		for(int height : gradeHeight){
			System.out.println(height);
		}
	}

	public void printAverage(int classNo){
		
		double avr = 0;

		System.out.println("Class No.: "+(classNo+1));

		ArrayList<Integer> gradeHeight = gradeHeights.get(classNo);
		for(int height : gradeHeight){
			avr += height;
		}

		System.out.println("Height average:"+(avr/gradeHeight.size()));		
	}
}