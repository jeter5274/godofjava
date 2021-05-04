package c.middle;

public class CalculateSalary{
	public static void main(String[] args){
		CalculateSalary cs = new CalculateSalary();
		cs.calculatorSalaries();	
	}

	public long getSalaryIncrease(Employee employee){
		long increaseRate = 0;
		switch(employee.getType()){
			case 1:
				increaseRate = -95;
				break;
			case 2:
				increaseRate = 10;
				break;
			case 3:
				increaseRate = 20;
				break;
			case 4:
				increaseRate = 30;
				break;
			case 5:
				increaseRate = 100;
				break;
		}
		return increaseRate;
	}

	public void calculatorSalaries(){
		Employee[] employees = new Employee[5];
		employees[0] = new Employee("LeeDaeRi", 1, 1000000000);
		employees[1] = new Employee("KimManager", 2, 100000000);
		employees[2] = new Employee("WhangDesign", 3, 70000000);
		employees[3] = new Employee("PrakArchi", 4, 80000000);
		employees[4] = new Employee("LeeDevelop", 5, 60000000);

		for(Employee employee : employees){
			float increaseRate = getSalaryIncrease(employee);
			long increaseSalary = (long)(employee.getSalary() * ((100+increaseRate)/100));

			System.out.println(employee.getName()+ "=" +increaseSalary);
			
		}	
	}
}