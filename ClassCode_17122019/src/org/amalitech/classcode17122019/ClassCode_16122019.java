package org.amalitech.classcode17122019;

public class ClassCode_16122019 {

	static double userAccountBalance;
	
	public static void 
	setUserAccountBalance(double currentUserAccountBalance){
		userAccountBalance=currentUserAccountBalance;
	}
	
	public static double getUserAccountBalance(){
		return userAccountBalance;
	}
	//pos. 1
	//static String customerStmnt = "Your account balance is : GH ";
	//we are moving the code (@ pos.1) above into a method
	//the method would be called, balanceStmnt(...) and 
	//it would take a parameter for chaning the currency 
	//ie. the currency is considered as  string ,
	//therefore the data type of the method signature would
	//be String and the variable name could be any name
	
	public static String balanceStmnt(String currency_str){
		 String customerStmnt = "Your account balance is : "+currency_str+" ";
		 return customerStmnt;
	}
	
	public static void tellUserAccountBalance(){
		//String customerStmnt = "Your account balance is : GH ";
		//we have moved the code above to pos. 1
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
	public static void main(String [] args) {
		//tellUserAccountBalance();//calling this method here 
		//as seen above would lead to a logic error, of which 
		//the IDE would not be able to help ya.
		setUserAccountBalance(127542.65);
		
		//tellUserAccountBalance();
		
		//tellUserAccountBalance(45000.00);
		
		tellUserAccountBalance("Euro", getUserAccountBalance());
		
	}
	/*
	 
	  the basic syntax for create a method :
	  
	  //access_modifier : public, protected, private
	  //modifier : [none] , static
	  //datatype : cbs, bsilfd
	  //argument/variable : the name of the variable/argument
	  
	  access_modifier modifier datatype 
	  methodName(DateType argument/variable){
	  	//expressions / 
	  	 * actions / 
	  	 * returning a datatype or result
	  }
	  
	 */
	
}
