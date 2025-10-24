package day4;

import java.util.HashMap;
import java.util.Scanner;

class MenuItem {
	String dishName;
	double price;

	public MenuItem(String dishName, double price) {
		this.dishName = dishName;
		this.price = price;
	}

	public String getDishName() {
		return dishName;
	}

	public double getprice() {
		return price;
	}

}


public class OnlineFoodOrder {
	Scanner sc = new Scanner(System.in);
	double cost = 0;
	double totalCost;
	double discount;
	double netBillAmount;
	String moreDish;
	boolean dineFlag = false;
	int totalNumDishesh = 0;
	

	public void serviceOffering() {

		System.out.println("Hello Welcome to Numpy Ninja restaurant !" + "\n" );
		System.out.println("Please select the service offering from below list : ");
		System.out.println("[1] dine-in" + "\n" + "[2] take away ");
		int val = sc.nextInt();

		if(val == 1) {
			dineFlag = true;
			dineIn();
		}else {
			takeAway();
		}

	}
	public void dineIn()
	{
		System.out.println("Please select the category from the below list : ");
		System.out.println("[1] vegetarian  " + "\n" + "[2] Non-vegetarian  ");
		int inputVegNvegOption = sc.nextInt();

		if (1 == inputVegNvegOption) {
			printVegDishes();

			System.out.println("\n" + "Please enter the dish option : ");
			int dishOptionNumber = sc.nextInt();

			totalCost = processOrderVeg(dishOptionNumber);

			System.out.println("Would you like to order one more dish ? [Y] or [N] -");
			String moreDish = sc.next();

			totalCost = processUserInput(moreDish) + totalCost;
			
			calculation();
		}else {
			printNonVegDishes();
			System.out.println("\n" + "Please enter the option: ");
			int dishOptionNumber = sc.nextInt();
			totalCost = processOrderNonVeg(dishOptionNumber);
			System.out.println("Would you like to order one more dish ? [Y] or [N] -");
			String moreDish = sc.next();

			totalCost = processUserInputNonVeg(moreDish) + totalCost;

			calculation();
		}

	}

	public void takeAway() {


		System.out.println("Please select the category from the below list : ");
		System.out.println("[1] vegetarian  " + "\n" + "[2] Non-vegetarian  ");
		int inputVegNvegOption = sc.nextInt();

		if (1 == inputVegNvegOption) {
			printVegDishes();

			System.out.println("\n" + "Please enter the dish option : ");
			int dishOptionNumber = sc.nextInt();

			totalCost = processOrderVeg(dishOptionNumber);

			System.out.println("Would you like to order one more dish ? [Y] or [N] -");
			String moreDish = sc.next();

			totalCost = processUserInput(moreDish) + totalCost;

			calculation();
		}else {
			printNonVegDishes();
			System.out.println("\n" + "Please enter the option: ");
			int dishOptionNumber = sc.nextInt();
			totalCost = processOrderNonVeg(dishOptionNumber);
			System.out.println("Would you like to order one more dish ? [Y] or [N] -");
			String moreDish = sc.next();

			totalCost = processUserInputNonVeg(moreDish) + totalCost;

			calculation();



		}
	}


	public void calculation() {
		System.out.println("Total :-" + totalCost);
		double priceWithGst = totalCost * .06;
		System.out.println("GST :-" + priceWithGst);
		double dineInCharge;
		
		if(dineFlag) {
			dineInCharge = 30;
			System.out.println("Parcel/Dine-in charge : " + dineInCharge);
		}else {
			dineInCharge = totalNumDishesh*10;
			System.out.println("Parcel/Dine-in charge : " + dineInCharge);
		}
		
		double finalAmount = totalCost + priceWithGst + dineInCharge;

		if (finalAmount> 1500) {
			Double discount = finalAmount * .15;
			System.out.println("Discount :-" + discount);
		}else if (finalAmount>1000) {
			Double discount = finalAmount * .1;
			System.out.println("Discount :-" + discount);
		}
		else {
			Double discount= 0.00;
			System.out.println("Discount :-" + discount);
		}


		double netBillAmount = finalAmount - discount;
		System.out.println("Net Bill Amount := " + netBillAmount);
		System.out.println("Thank you ! Visit again !\r\n" + " ");
	}

	private double processUserInput(String userIpOptionYorN) {
		

		if ("Y".equalsIgnoreCase(userIpOptionYorN)) {
			printVegDishes();
			System.out.println("\n" + "Please enter the option: ");
			int inputBuyItem1 = sc.nextInt();
			cost = processOrderVeg(inputBuyItem1) + cost;

			System.out.println("Would you like to order one more dish ? [Y] or [N] -");
			String moreDish = sc.next();
			processUserInput(moreDish);
		} else if ("N".equalsIgnoreCase(userIpOptionYorN)){
			System.out.println("Would you like to order from other category ? [Y] or [N] -");
			String moreCategory = sc.next();
			if ("Y".equalsIgnoreCase(moreCategory)) {
				System.out.println("Below are the dishes available currently to order : " + "\n");
				printNonVegDishes();
				System.out.println("\n" + "Please enter the option: ");
				int inputBuyItem3 = sc.nextInt();
				processOrderNonVeg(inputBuyItem3);
			}
		}
		else {
			System.out.println("Please Enter Y or N-");
		}

		return cost;
	}

	private double processUserInputNonVeg(String userIpOptionYorN) {

		if ("Y".equalsIgnoreCase(userIpOptionYorN)) {
			printNonVegDishes();
			System.out.println("\n" + "Please enter the option: ");
			int inputBuyItem1 = sc.nextInt();
			cost = processOrderNonVeg(inputBuyItem1) + cost;

			System.out.println("Would you like to order one more dish ? [Y] or [N] -");
			String moreDish = sc.next();
			processUserInputNonVeg(moreDish);
		} else if("N".equalsIgnoreCase(userIpOptionYorN)) {
			System.out.println("Would you like to order from other category ? [Y] or [N] -");
			String moreCategory = sc.next();
			if ("Y".equalsIgnoreCase(moreCategory)) {
				System.out.println("Below are the dishes available currently to order : " + "\n");
				printVegDishes();
				System.out.println("\n" + "Please enter the option: ");
				int inputBuyItem3 = sc.nextInt();
				processOrderVeg(inputBuyItem3);
			}
		}
		else {
			System.out.println("Please Enter Y or N-");
		}

		return cost;


	}

	double processOrderVeg(int itemNumber) {
		HashMap<Integer, MenuItem> vegItemMap = getVegDishes();
		MenuItem item = vegItemMap.get(itemNumber);
		double cost;
		System.out.println("Please enter number of “ " + item.dishName + " ” you would like to order: ");
		int orderCount = sc.nextInt();
		totalNumDishesh = orderCount+totalNumDishesh;
		cost = item.price * orderCount;
		return cost;
	}

	double processOrderNonVeg(int itemNumber) {

		HashMap<Integer, MenuItem> nonVegItemMap = getNonVegDishes();
		MenuItem item = nonVegItemMap.get(itemNumber);
		System.out.println("Please enter number of “ " + item.dishName + " ” you would like to order: ");
		int orderCount = sc.nextInt();
		totalNumDishesh = orderCount+totalNumDishesh;
		cost = item.price * orderCount;
		return cost;

	}

	void printVegDishes() {



		HashMap<Integer, MenuItem> hashMap = getVegDishes();

		for (HashMap.Entry<Integer, MenuItem> entry : hashMap.entrySet()) {
			Integer key = entry.getKey();
			MenuItem menuItem = entry.getValue();
			System.out.println(key + " " + menuItem.getDishName() + " - " + menuItem.getprice() + " (per item) ");

		}
	}

	void printNonVegDishes() {
		HashMap<Integer, MenuItem> hashMapNonveg = getNonVegDishes();
		for (HashMap.Entry<Integer, MenuItem> entry : hashMapNonveg.entrySet()) {
			Integer key = entry.getKey();
			MenuItem menuItem = entry.getValue();
			System.out.println(key + " " + menuItem.getDishName() + " - " + menuItem.getprice() + " (per item) ");

		}
	}

	HashMap<Integer, MenuItem> getVegDishes() {
		HashMap<Integer, MenuItem> vegDishesMap = new HashMap<Integer, MenuItem>();

		vegDishesMap.put(1, new MenuItem("Paneer Tikka", 120.00));
		vegDishesMap.put(2, new MenuItem("Cashew pulao", 150.00));
		vegDishesMap.put(3, new MenuItem("Veg fried rice", 130.00));
		vegDishesMap.put(4, new MenuItem("Gobi 65", 100.00));
		vegDishesMap.put(5, new MenuItem("Veg. thali", 140.00));
		return vegDishesMap;

	}

	HashMap<Integer, MenuItem> getNonVegDishes() {
		HashMap<Integer, MenuItem> NonVegDishesMap = new HashMap<Integer, MenuItem>();
		NonVegDishesMap.put(1, new MenuItem("Chicken briyani", 200.00));
		NonVegDishesMap.put(2, new MenuItem("Fish curry", 150.00));
		NonVegDishesMap.put(3, new MenuItem("Chicken 65", 120.00));
		NonVegDishesMap.put(4, new MenuItem("Mutton gravy", 220.00));
		NonVegDishesMap.put(5, new MenuItem("Chicken fried rice", 180.00));
		return NonVegDishesMap;

	}



	public static void main(String[] args) {

		OnlineFoodOrder order = new OnlineFoodOrder();
		order.serviceOffering();
	}
}
