package org.amalitech.classcode_16122019;

public class ClassCode_16122019 {

	static double userAccountBalance;
	
	public static void 
	setUserAccountBalance(double currentUserAccountBalance){
		userAccountBalance=currentUserAccountBalance;
	}
	
	public static double getUserAccountBalance(){
		return userAccountBalance;
	}
	
	public static void tellUserAccountBalance(){
		String customerStmnt = "Your account balance is : GH ";
		System.out.println(
			customerStmnt
			+ getUserAccountBalance()
		);
	}
	public static void tellUserAccountBalance(double accountBal){
		customerStmnt = "Your account balance is : GH ";
		System.out.println(
			customerStmnt
			+ accountBal
		);
	}
	public static void main(String [] args) {
		//tellUserAccountBalance();//calling this method here 
		//as seen above would lead to a logic error, of which 
		//the IDE would not be able to help ya.
		setUserAccountBalance(127542.65);
		tellUserAccountBalance();
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
