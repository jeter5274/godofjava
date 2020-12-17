public class InterestManager{

	public static void main(String[] agrs){
		
		InterestManager year = new InterestManager();
		long amount=0;
		double rate=0;
		
		for(int i = 0; i <= 365 ; i++){
			amount += 1000000;
			rate = year.calculateAmount(i, amount);
			System.out.println(i+ "Day, amount : " +rate+ " rate : " +(rate-amount));
						
		}
	}

	public double getInterestRate(int day){
		double interestRate;

		if(day<=90){
			interestRate = 0.005;			
		}else if(day <= 180) {
			interestRate = 0.01;			
		}else if(day <= 364) {
			interestRate = 0.02;			
		}else {
			interestRate = 0.056;
		}

		return interestRate;
	}

	public double calculateAmount(int day, long amount){
		amount += (amount * getInterestRate(day));
		return amount;
	}
}