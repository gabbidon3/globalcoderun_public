package org.amalitech.classcode_18122019;

public class TenaryOperators {

	public static void main(String[] args) {
		
		// ( condition ) ? this_would_be_done_if_true : this_would_be_done_if_false;
		
		int x = (true) ? 0 : 1;
		
		boolean acc_bool = false;
		String openAccount = (acc_bool) ? 
				"Yes, Open Account" : 
				"No, Close Account";
		
		System.out.println(x);
		
		System.out.println(openAccount);
		
	}

}
