package homework2;

public class Task {
	
	private String name ;
	private int workingHours;
	
	public Task() {
		
	}
	
	public Task(String name, int workingHours){
		if(name == null || name.length() < 2 || name.equals("")){
			System.out.println("Invalid name! ");
		}else{
			this.name = name;
		}
		
		if(workingHours < 0){
			System.out.println("Invalid working hours! ");
		}else{
			this.workingHours = workingHours;
		}
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

	public int getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(int workingHours) {
		if(workingHours < 0){
			System.out.println("Invalid working hours! ");
		}else{
			this.workingHours = workingHours;
		}
	}
	
	
}
