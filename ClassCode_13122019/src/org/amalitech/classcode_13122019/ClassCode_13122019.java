package org.amalitech.classcode_13122019;

import java.util.Scanner;

public class ClassCode_13122019 {
	public static void main(String[] args) {
		
		String wlcm_msg = "Welcome, please enter your first number. . . . ";
		System.out.println(wlcm_msg);
		
		//Scanner 
		Scanner scnnr_kybd = new Scanner(System.in);
		int kybd_x_i = scnnr_kybd.nextInt();
		
		//the line below messes up with our
		//user experience , therefore move it
		//to the right place or location.
		//int kybd_y_i = scnnr_kybd.nextInt();
		
		String tell_user_smthn_x = 
				"You entered %s";
		tell_user_smthn_x = 
				String.format(
						tell_user_smthn_x, 
						Integer.toString(kybd_x_i)
				);
		System.out.println(tell_user_smthn_x);
		
		//let the console app be a bit more 
		//user friendly
		System.out.println("Thank you, Please enter the second number . . .");
		
		int kybd_y_i = scnnr_kybd.nextInt();
		String tell_user_smthn_y = 
				"You entered %s";
		tell_user_smthn_y = 
				String.format(
						tell_user_smthn_y, 
						Integer.toString(kybd_y_i)
				);
		System.out.println(tell_user_smthn_y);
		
		System.out.println("Calculating . . . ");
		
		//finding the sum of all numbers between 1 and 200
		//int x, y, z;
		
		
		int x=kybd_x_i,
				//y=500, 
				y=kybd_y_i,
				z=2;
		
		int rslt;
		
		rslt = (x + y) * (y / z);
		
		/*String pre_stmnt_of_rslt = "The sum of numbers "
				+ "between x and y = ";
		*/
		
		//we want the string to be a bit more 
		//intelligent or smart so we pass 
		//parameters to it.
		String pre_stmnt_of_rslt;
		pre_stmnt_of_rslt = "The sum of numbers between %s and %s = ";
		
		String pre_stmnt_of_rslt_formatted =
				String.format(
						pre_stmnt_of_rslt, 
						x,
						y
				);
		
		System.out.println(
				pre_stmnt_of_rslt_formatted
				+rslt
		);
		
		//we care about the user so we are 
		//going to tell them that the program
		//ended 
		
		System.out.println("\nThank you for using our application.\nGood Bye.");
		
		
	}
	
	public static String tellUserWhatWasEntered(
			int kybd_inpt
	){
		
		//we realised that the user has to 
		//get the feedback : "You entered [kybd_inpt]
		
		String tell_user_smthn_x ="You entered %s";
		tell_user_smthn_x = String.format(tell_user_smthn_x, Integer.toString(kybd_inpt));
		System.out.println(tell_user_smthn_x);
		
		return String.format(tell_user_smthn_x);
		
	}
	
	
}

