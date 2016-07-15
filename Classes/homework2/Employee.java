package homework2;

public class Employee {
	
	private String name;
	private Task currentTask;
	private int hoursLeft;
	
	public Employee(String name) {
		if(name == null || name.length() < 2 || name.equals("")){
			System.out.println("Invalid name! ");
		}else{
			this.name = name;
		}
	}

	public void work(){
		if(this.hoursLeft <= this.currentTask.getWorkingHours()){
			this.currentTask.setWorkingHours(this.currentTask.getWorkingHours() - this.hoursLeft);
			this.hoursLeft = 0;
		}else{
			this.hoursLeft -= this.currentTask.getWorkingHours();
			this.currentTask.setWorkingHours(0);
		}
		
		this.showReport();
	}
	
	private void showReport(){
		System.out.println("Name: " + this.name);
		System.out.println("Name of the task: " + this.currentTask.getName());
		System.out.println("Hours left to work: " + this.hoursLeft);
		System.out.println("Hours left for the task to be completed: " + this.currentTask.getWorkingHours());
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name == null || name.length() < 2 || name.equals("")){
			System.out.println("Invalid name! ");
		}else{
			this.name = name;
		}
	}

	public Task getCurrentTask() {
		return currentTask;
	}

	public void setCurrentTask(Task currentTask) {
		if(currentTask != null){
			this.currentTask = currentTask;
		}
	}

	public int getHoursLeft() {
		return hoursLeft;
	}
	
	public void setHoursLeft(int hoursLeft){
		if(hoursLeft < 0){
			System.out.println("Invalid hours left for work! ");
		}else{
			this.hoursLeft = hoursLeft;
		}
	}
	
}
