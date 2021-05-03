package c.string.practice;

public class UseStringMethods{

	public static void main(String[] args){
		String testString = "The String class represents character strings.";
		UseStringMethods usm = new UseStringMethods();
		usm.printwords(testString);
		usm.findString(testString, "string");
		usm.findAnyCaseString(testString, "string");
		usm.countChar(testString, 's');
		usm.printContainWords(testString, "ss");
	}

	public void printwords(String str){
		String[] splitString = str.split(" ");
		for(String word : splitString){
			System.out.println(word);
		}
	}

	public void findString(String str, String findStr){
		//System.out.println("string is appeared at " +str.indexOf(findStr));
		//shoud be check str not include findStr
		int result = str.indexOf(findStr);
		if(result > -1) System.out.println("string is appeared at " +result);
		else System.out.println("Not Found");
	}

	public void findAnyCaseString(String str, String findStr){
		//System.out.println("string is appeared at " +(str.toLowerCase()).indexOf(findStr.toLowerCase()));
		//shoud be check str not include findStr
		String lowerStr = str.toLowerCase();
		String lowerFindStr = findStr.toLowerCase();
		int result = lowerStr.indexOf(lowerFindStr);

		if(result > -1) System.out.println("string is appeared at " +result);
		else System.out.println("Not Found");
	}

	public void countChar(String str, char c){
		char[] strCharArray = str.toCharArray();
		int countC = 0;
		for(char searchChar : strCharArray){
			if(searchChar == c) countC++;
		}

		System.out.println("Char '" +c+ "' count is " +countC);
	}

	public void printContainWords(String str, String findStr){
		String[] words = str.split(" ");
		int findCount = 0;
		for(String word : words){
			if(word.contains(findStr)){
				System.out.println(word+ " contain " +findStr);
				findCount++;
			}
		}
		
		if(findCount == 0) System.out.println(findStr+ " Not Found");
	}
}