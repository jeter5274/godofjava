package d.lang.practice;

public class NumberObject{

	public static void main(String[] args){
		NumberObject test = new NumberObject();
		//test.parseLong("r1024");
		test.printOtherBase(1024);
	}
	public long parseLong(String data){
	
		long result;

		try{
			result = Long.parseLong(data);		
		}catch(Exception e){
			System.out.println(data+" is not a number");
			result = -1;
		}

		return result;
	}

	public void printOtherBase(long value){		
		System.out.println("Original : " +value);
		System.out.println("Binary	: " +Long.toBinaryString(value));
		System.out.println("Hex	: " +Long.toHexString(value));
		System.out.println("Octal	: " +Long.toOctalString(value));
	}
}