package Task1;

public class Demo {


	public static void main(String[] args) {

		Person[] people = new Person[10];
		
		Person gosho = new Person("Gosho", 18, Gender.MALE);
		Person mirka = new Person("Mirka", 16, Gender.FEMALE);
		Student jivko = new Student("Jivko", 23, Gender.MALE, 5.5);
		Student niki = new Student("Niki", 17, Gender.MALE, 3.4);
		Employee magi = new Employee("Magi", 24, Gender.FEMALE, 75);
		Employee kolio = new Employee("Kolio", 13, Gender.MALE, 50);
		
		people[0] = gosho;
		people[1] = mirka;
		people[2] = jivko;
		people[3] = niki;
		people[4] = magi;
		people[5] = kolio;
		
		for (int index = 0; index <= 5; index++) {
			people[index].showPersonInfo();
			System.out.println();
		}
		
		for (int index = 0; index <= 5; index++) {
			if(people[index].getClass().equals(Employee.class)){
				System.out.println(((Employee) people[index]).calculateOvertime(2));
			}
		}

	}

}
