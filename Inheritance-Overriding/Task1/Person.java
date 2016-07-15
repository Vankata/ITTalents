package Task1;

public class Person {

	private static final String DEFAULT_NAME = "no name";
	private static final int DEFAULT_AGE = 0;
	private String name;
	private int age;
	private Gender gender;
	
	
	public Person(String name, int age, Gender gender) {

		this.setName(name);
		this.setAge(age);
		this.gender = gender;
	}

	void showPersonInfo(){
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		
		if(gender.ordinal() == 0){
			System.out.println("Gender: male");
		}else{
			System.out.println("Gender: female");
		}
	}

	public void setName(String name) {
		
		if(name != null && !name.equals("") && name.length() >= 2){
			this.name = name;
		}else{
			System.out.println("Invalid name! ");
			this.name = DEFAULT_NAME;
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		
		if(age > 0){
			this.age = age;
		}else{
			System.out.println("Invalid age! ");
			this.age = DEFAULT_AGE;
		}
		
	}

}
