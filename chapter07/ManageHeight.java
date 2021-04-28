public class ManageHeight{

	public static void main(String args[]){
		ManageHeight mh = new ManageHeight();	
		mh.setData();
		for(int i=1; i<=5; i++){
			System.out.println("Class No : " +i);
			mh.printHeight(i);
			mh.printAverage(i);
		}
	}
	
	int classHeight[][];

	public void setData(){
		classHeight = new int[5][];
		classHeight[0] = new int[] {170, 180, 173, 175, 177};
		classHeight[1] = new int[] {160, 165, 167, 186};
		classHeight[2] = new int[] {158, 177, 187, 176};
		classHeight[3] = new int[] {173, 182, 181};
		classHeight[4] = new int[] {170, 180, 165, 177, 172};
	}
	
	public void printHeight(int classNo){
		for(int height : classHeight[classNo-1]){
 			System.out.println(height);
		}
	}
	
	public void printAverage(int classNo){
		double sum=0;
		int classCnt = 0;
		
		for(int height : classHeight[classNo-1]){
 			sum += height;
			classCnt++;
		}
		
		System.out.println("Height average : " +(sum / classCnt));				
	}
}