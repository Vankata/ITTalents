package Task1;


public class ComputerDemo {
	
	public static void main(String[] args) {
		

		Computer myComputer = new Computer(2014, 2000, false, 500, 100, "Linux Ubuntu");
		Computer myLaptop = new Computer(2012, 1300, true, 500, 200, "Windows 7");
		
		myComputer.useMemory(50);
		myLaptop.changeOperationSystem("Windows 10");
		
		myComputer.print();
		System.out.println();
		myLaptop.print();
		
		myComputer.comparePrice(myLaptop);
	}

}
