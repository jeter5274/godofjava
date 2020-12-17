public class ProfilePrint{

	byte age;
	String name;
	boolean isMarried;

	public static void main(String[] args){
	ProfilePrint pp = new ProfilePrint();
	
	byte age = 31;
	String name = "jiter";
	boolean isMarried = false;
	
	pp.setAge(age);
	pp.setName(name);
	pp.setMarried(isMarried);

	System.out.println(pp.getAge());
	System.out.println(pp.getName());
	System.out.println(pp.getMarried());
		
	}

	public void setAge(byte val){
		age = val;		
	}
	
	public byte getAge(){
		return age;
	}	

	public void setName(String str){
		name = str;
	}

	public String getName(){
		return name;
	}

	public void setMarried(boolean flag){
		isMarried = flag;
	}
	
	public boolean getMarried(){
		return isMarried;
	}
}