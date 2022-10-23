package makeChange;

import java.util.Scanner;

public class cashRegister {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	int pennies, twenty, ten, five, ones ,quart, dimes, nickel, penn;
	 
	
	System.out.println("Please enter the price of item: ");
	double price1 = sc.nextDouble();
	double price2 = Math.round(price1*100)/100D;
		
	System.out.println("Amount given: ");
	double ammount1 = sc.nextDouble();
	double ammount2 = Math.round(ammount1*100)/100D;
	
	
	if (price1>ammount1) {
		System.out.println("Item cost more than ammount given.");
	}
	else if(price1 == ammount1) {	
		System.out.println("Thank you for your purchase.");
	}
	else if (price1<=ammount1) {
		double changeDue = ammount2 - price2;
		double changeDue2 = Math.round(changeDue*100)/100D;
		System.out.print("Customer is owed change.  $" + changeDue2 + "\nHere is your change." );
		
		double change = changeDue2;
		pennies = (int) (change * 100);
		twenty = (int)(pennies/2000);
        pennies %= 2000;
        ten = (int)(pennies/1000);
        pennies %= 1000;
        five = (int)(pennies/500);
        pennies %= 500;
        ones = (int)(pennies/100);
        pennies %= 100;
        quart = (int)(pennies/25);
        pennies %= 25;
        dimes = (int)(pennies/10);
        pennies %= 10;
        nickel = (int)(pennies/5);
        pennies %= 5;
        penn=(int)(pennies/1);
        pennies %=1;
        
      System.out.println( "\nTwenties: " + twenty + "\nTens: "+ten + "\nFives: "+five  + "\nOnes: " +ones+"\nQuarters: "+quart+  "\nDimes: "+dimes+ "\nNickels: "+nickel + "\nPennies: "+penn);  
	}
	else {
		System.out.print("Can not compute cost. please try again");	

	}
sc.close();
	}
}
