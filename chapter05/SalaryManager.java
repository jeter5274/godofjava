public class SalaryManager{

	public static void main(String[] agrs){

	SalaryManager person = new SalaryManager();

	System.out.println(person.getMontilySalary(20000000));


	}

	public double getMontilySalary(int yearlySalary){
		double MontilySalary = yearlySalary/12.0;

		double tax = calculateTax(MontilySalary);
		double np = calculateNationalPension(MontilySalary);
		double hi = calculateHealthInsurance(MontilySalary);

		MontilySalary -= (tax+np+hi);
		
		return MontilySalary;
	}

	public double calculateTax(double monthSalary){
		System.out.println("Tax(12.5%) : " + monthSalary*0.125);
		return monthSalary*0.125;
	}

	public double calculateNationalPension(double monthSalary){
		System.out.println("NationalPension(8.1%) : " + monthSalary*0.081);
		return monthSalary*0.081;
	}
	public double calculateHealthInsurance(double monthSalary){
		System.out.println("HealthInsurance(13.5%) : " + monthSalary*0.135);
		return monthSalary*0.135;
	}

}