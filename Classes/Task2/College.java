package Task2;


public class College {

	public static void main(String[] args) {
		
		Student pesho = new Student("Pesho", "geometriq", 18);
		System.out.println("Printing pesho: ");
		pesho.printStudent();
		System.out.println();
		Student gosho = new Student("Gosho", "geometriq", 19, 5.0);
		System.out.println("Printing gosho: ");
		gosho.printStudent();
		gosho.yearUp();
		System.out.println("Printing gosho: ");
		gosho.printStudent();
		gosho.yearUp();
		gosho.yearUp();
		System.out.println("Printing gosho: ");
		gosho.printStudent();
		gosho.yearUp();
		System.out.println("Printing gosho: ");
		gosho.printStudent();
		System.out.println("Printing gosho: ");
		gosho.receiveScholarship(4.5, 200);
		gosho.printStudent();
		System.out.println("Printing gosho: ");
		gosho.receiveScholarship(5.5, 5000);
		gosho.printStudent();
		
		StudentGroup geometriq = new StudentGroup("geometriq");
		geometriq.printStudentsiInGroup();
		geometriq.addStudent(pesho);
		geometriq.addStudent(gosho);
		System.out.println("Printing all students: ");
		geometriq.printStudentsiInGroup();
		System.out.println("Printing best student's name: ");
		System.out.println(geometriq.theBestStudent());
		geometriq.emptyGroup();
		geometriq.printStudentsiInGroup();
		System.out.println("Printing best student's name: ");
		System.out.println(geometriq.theBestStudent());
		

	}

}
