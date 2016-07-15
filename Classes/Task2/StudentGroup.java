package Task2;

public class StudentGroup {
	String groupSubject;
	Student[] students;
	int freePlaces;

	StudentGroup() {
		this.students = new Student[5];
		this.freePlaces = 5;
	}

	StudentGroup(String groupSubject) {
		this();
		if (groupSubject == null || groupSubject.equals("")) {
			System.out.println("Invalid subject! ");
		} else {
			this.groupSubject = groupSubject;
		}
	}

	void addStudent(Student newStudent) {
		if (newStudent.subject.equals(this.groupSubject) && freePlaces > 0 && newStudent != null) {
			this.students[5 - this.freePlaces] = newStudent;
			this.freePlaces--;
		} else {
			System.out.println("This students cannot be added! ");
		}
	}

	void emptyGroup() {
		this.students = new Student[5];
		this.freePlaces = 5;
	}

	String theBestStudent() {
		if (this.freePlaces == 5) {
			return "There are no students in the group! ";
		} else {
			String nameBS = students[0].name;
			double tempGrade = students[0].grade;
			for (int index = 1; index < 5 - this.freePlaces; index++) {
				if (tempGrade < students[index].grade) {
					tempGrade = students[index].grade;
					nameBS = students[index].name;
				}
			}

			return nameBS;
		}
	}

	void printStudentsiInGroup() {
		if (this.students[0] != null) {
			for (int index = 0; index < 5 - this.freePlaces; index++) {
				this.students[index].printStudent();
				System.out.println();
			}
		}
	}

}
