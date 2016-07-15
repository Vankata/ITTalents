public class Student {
	String name;
	String subject;
	double grade;
	int yearInCollege;
	int age;
	boolean isDegree;
	double money;

	Student() {
		this.grade = 4.0;
		this.yearInCollege = 1;
		this.isDegree = false;
		this.money = 0;
	}

	Student(String name, String subject, int age) {
		this();
		if (name == null || name.equals("")) {
			System.out.println("Invalid name! ");
		} else {
			this.name = name;
		}

		if (subject == null || subject.equals("")) {
			System.out.println("Invalid subject! ");
		} else {
			this.subject = subject;
		}

		if (age < 0 || age > 130) {
			System.out.println("Invalid age! ");
		} else {
			this.age = age;
		}
	}
	
	//pravq i tozi constructor, zashtoto ako polzvame samo tozi s tri parametyra nqma da moje da sravnqvame studentite po ocenki tyi kato vsichki imat 4.0
	Student(String name, String subject, int age, double grade){
		this(name, subject, age);
		this.grade = grade;
	}

	void yearUp() {
		if (this.isDegree) {
			System.out.println("The student has graduated! ");
		} else {
			this.yearInCollege++;
			if (this.yearInCollege == 4) {
				this.isDegree = true;
			}
		}
	}
	
	double receiveScholarship(double min, double amount){
		if(this.grade >= min && this.age < 30){
			this.money += amount;
		}
		
		return this.money;
	}
	
	void printStudent(){
		System.out.println("Name: " + this.name);
		System.out.println("Subject: " + this.subject);
		System.out.println("Grade: " + this.grade);
		System.out.println("Age: " + this.age);
		System.out.println("Year/s in college: " + this.yearInCollege);
		System.out.println("Graduated: " + this.isDegree);
		System.out.println("Money from scholarship: " + this.money);
		System.out.println();
	}
}
