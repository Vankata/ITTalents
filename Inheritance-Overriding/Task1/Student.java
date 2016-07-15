package Task1;

public class Student extends Person {
	
	private static final double DEFAULT_SCORE = 2.0;
	private double score;

	public Student(String name, int age, Gender gender, double score) {
		super(name, age, gender);
		
		this.setScore(score);
	}
	
	@Override
	void showPersonInfo(){
		super.showPersonInfo();
		System.out.println("Score: " + this.score);
	}

	public void setScore(double score) {
		
		if(score >= 2 || score <= 6){
			this.score = score;
		}else{
			System.out.println("Invalid score! ");
			this.score = DEFAULT_SCORE;
		}
	}
	
	

	
}
