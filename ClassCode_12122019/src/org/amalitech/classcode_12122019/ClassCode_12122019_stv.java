package org.amalitech.classcode_12122019;

public class ClassCode_12122019_stv {

	public static void main(String[] args) {
		
		//Scanner 
		
		
		//finding the sum of all numbers between 1 and 200
		//int x, y, z;
		
		/*
		int x;
		int y;
		int z;
		
		x = 1;
		y = 200;
		z = 2;
		*/
		
		int x=1, y=500, z=2;
		
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
		
		
	}
	
}
