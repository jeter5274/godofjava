public class Student{

	String name, address, phone, email;

	public Student(String name){
		this.name = name;
	}

	public Student(String name, String address, String phone, String email){
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}

	public String toString(){
		return name+ " " + address+ " " +phone+ " " +email;
	}

	public boolean equals(Student student){
		if(this.name != student.name ) return false;
		if(this.address != student.address ) return false;
		if(this.phone != student.phone ) return false;
		if(this.email != student.email ) return false;

		return true;
	}

}