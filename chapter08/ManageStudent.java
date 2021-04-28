public class ManageStudent{
	
	public static void main(String[] args){
		ManageStudent ms = new ManageStudent();
		Student[] student = null;
		student = ms.addStudent();
		ms.printStudent(student);			
	}

	public Student[] addStudent(){
		Student[] student = new Student[3];
		student[0] = new Student("Lim");
		student[1] = new Student("Min");
		student[2] = new Student("Sook", "Seoul", "010XXXXXXXX", "ask@godofjava.com");
		return student;
	}

	public void printStudent(Student[] student){
		for(Student printStudent : student){
			System.out.println(printStudent);	//println use toString for print
			//System.out.println(printStudent.toString());
		}
	}
}