package Task1;

public class Employee extends Person {
	
	private static final int DEFAULT_DAY_SALARY = 100;
	private static final int WORKING_HOURS = 8;
	private static final double COEF_OVERTIME_SALARY = 1.5;
	private static final int LEGAL_AGE = 18;
	private double daySalary;

	
	
	public Employee(String name, int age, Gender gender, double daySalary) {
		super(name, age, gender);
		
		this.setDaySalary(daySalary);
	}
	
	double calculateOvertime(int hours){
		if(this.getAge() < LEGAL_AGE){
			return 0;
		}else{
			double hourSalary = this.daySalary / WORKING_HOURS;
			return hours * hourSalary * COEF_OVERTIME_SALARY;
		}
	}
	
	@Override
	void showPersonInfo(){
		super.showPersonInfo();
		System.out.println("Day salary: " + this.daySalary);
	}


	public void setDaySalary(double daySalary) {
		
		if(daySalary > 0){
			this.daySalary = daySalary;
		}else{
			System.out.println("Invalid day salary! ");
			this.daySalary = DEFAULT_DAY_SALARY;
		}
	}
	
	
}
