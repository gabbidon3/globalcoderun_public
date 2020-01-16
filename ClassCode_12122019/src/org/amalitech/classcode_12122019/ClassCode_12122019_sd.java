package org.amalitech.classcode_12122019;

import java.util.Scanner;

public class ClassCode_12122019_sd {

	public static void main (String [] args) {
		
		//Find the sum of all number between 1 and 200
		
		//Display a user guide or inform users on what to do
		String app_instruction_str = "Welcome, this is a simple calculator"
				+"\n"
				+ "to find the sum of numbers."
				+"\n\n"
				+ "Please enter your first Number ... ";
		System.out.println(app_instruction_str);
		
		//Initialising a Scanner Class
		Scanner kybd = new Scanner(System.in);
		int kybd_x_i = kybd.nextInt();
		
		System.out.println("You entered : "+kybd_x_i);
		
		System.out.println("Please enter your second number .... ");
		
		int kybd_y_i = kybd.nextInt();
		
		//Initial Equation ( Pre Abstraction )
		
		//Declaration of variables 
		int x, y, z;
		//x = 1;
		x = kybd_x_i;
		
		//y = 1000;
		y = kybd_y_i;
		z = 2;
		
		//Pre Abstraction :  ( x + y ) * ( y / z )
		int rslt;
		
		//rslt = (x + y) * ( y / z );
		//we want to use methods instead :
		rslt = calculateTheSum(x, y);
		
		String prblm_stmnt_str = "The sum of all numbers between %s and %s = ";
		
		//String formating : 
		prblm_stmnt_str = String.format(prblm_stmnt_str, x, y);
		
		System.out.println( prblm_stmnt_str + rslt );
		
		
		
		
	}
	
	//SECOND HALF : 
		//Creating of methods or functions
		public static int calculateTheSum(int x, int y ) {
			int z = 2;
			int rslt = (x+y)*(y/z);
			return rslt;
		}
	
}
