package homework2;

public class DemoEmployer {

	public static void main(String[] args) {


		Task hardTask = new Task("Write a report", 4);
		Task easyTask = new Task("Send a report", 1);
		
		Employee mark = new Employee("Mark");
		mark.setCurrentTask(hardTask);
		mark.setHoursLeft(7);
		
		Employee gordon = new Employee("Gordon");
		gordon.setCurrentTask(easyTask);
		gordon.setHoursLeft(1);
		
		mark.work();
		gordon.work();

	}

}
