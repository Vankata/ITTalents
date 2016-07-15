package advancedTasks;

public class DemoMobileWorld {

	public static void main(String[] args) {
	
		Car trabant = new Car("V12", true, "blue", 3000, 200);
		Car moskvich = new Car("sls63", false, "black", 2000, 150);
		
		System.out.println(trabant.isMoreExpensive(moskvich));
		System.out.println(trabant.calculateCarPriceForScrap(0.5));
		System.out.println("Printing trabanta: \n");
		trabant.printCar();
		System.out.println("Printing moskvicha: \n");
		moskvich.printCar();
		Person gosho = new Person("Gosho", 4825902331L, Gender.MALE, 4000);
		gosho.buyCar(trabant);
		System.out.println("Gosho's car: " + gosho.car.model);
		gosho.sellCarForScrap();
		System.out.println("Gosho's money after selling his car: " + gosho.money);
		
		CarShop motoPhoe = new CarShop(20);
		motoPhoe.addCar(trabant);
		motoPhoe.addCar(moskvich);
		System.out.println("Printing all the cars in the shop: \n");
		motoPhoe.showAllCarsInTheShop();
		motoPhoe.sellNextCar(gosho);
		System.out.println("Printing all the cars in the shop after selling one car: \n");
		motoPhoe.showAllCarsInTheShop();
		System.out.println("Gosho's new car: " + gosho.car.model);

	}

}
