package org.amalitech.classcode19122019;

public class ClassCode_19122019{

	static double userAccountBalance;
	
	public static void 
	setUserAccountBalance(double currentUserAccountBalance){
		userAccountBalance=currentUserAccountBalance;
	}
	
	public static double getUserAccountBalance(){
		return userAccountBalance;
	}
	
	public static String balanceStmnt(String currency_str){
		 String customerStmnt = "Your account balance is : "+currency_str+" ";
		 return customerStmnt;
	}
	
	public static void tellUserAccountBalance(){
		System.out.println(
			balanceStmnt("GHC")
			+ getUserAccountBalance()
		);
	}
	public static void tellUserAccountBalance(double accountBal){
		System.out.println(
			balanceStmnt("USD")
			+ accountBal
		);
	}
	public static void tellUserAccountBalance(String currency_str, double accountBal){
		System.out.println(
			balanceStmnt(currency_str)
			+ accountBal
		);
	}
	
	static String [] listOfItemsInStore_arr = {
			"Milo",
			"Milk",
			"Gari",
			"Chips",
			"Sugar",
			"ThisWay",
			"Cowbell",
			"Nido",
			"Mosquitoe Coil",
			"Corn Flakes",
			"Key Soap",
			"Neat Fufu",
			"Neat Ab3nkwan",
			"Salted Fish"
	};
	
	public static void main(String [] args) {
		
		double def_acc_bal_d = 580.00;
		
		setUserAccountBalance(def_acc_bal_d);
		
		tellUserAccountBalance("GHC", getUserAccountBalance());
		
		System.out.println("The items currently available are :");
		
		for(int x=0; x<listOfItemsInStore_arr.length; x++){
			System.out.println(
					Integer.toString(x+1) 
					+ ". "
					+listOfItemsInStore_arr[x]
			);
		}
		
	}
	
	
}
