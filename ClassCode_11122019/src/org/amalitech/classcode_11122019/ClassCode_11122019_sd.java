package org.amalitech.classcode_11122019;

public class ClassCode_11122019_sd {

	public static void main (String [] args){
		
		//declaration of a variable x
		/*int x;
		x = 2;*/
		
		/*
		int x =2;
		
		int y;
		y=7;
		*/
		
		/*int x, y;
		x = 2;
		y = 7;
		*/
		
		int x=2, y=7;
		
		System.out.println(x);
		System.out.println(y);
		
		//Concatenation
		System.out.println(x + y);
		
		String eql_str = " = ";
		String main_stmnt_add_str = "x + y";
		String pre_stmnt_add_str = "x + y "+eql_str;
		
		System.out.println(pre_stmnt_add_str + x + y );
		
		System.out.println(x + y + eql_str + main_stmnt_add_str );
		
		System.out.println(pre_stmnt_add_str + (x + y) );
		
		System.out.println( (x+y) + " "+eql_str+" " + main_stmnt_add_str );
		
		//Multiplication : 
		System.out.println("x * y = " + x * y);
		
		System.out.println("x * y = " + (x * y));
		
		//DRY : Dont Repeat Yourself
		
		//Division
		System.out.println("x / y = "+ x / y);
		
		//Casting (Type Casting)
		
		double x_d = (double) x;
		double y_d = (double) y;
		
		System.out.println("x_d / y_d = "+ x_d / y_d);
		
		//Incremental(s)
		//x = 2;
		x = x+1;
		System.out.println("x = x+1;"+eql_str+ x);
		
		x+=1;
		System.out.println("x+=1;"+eql_str+x);
		//x = 4;
		int n = x++;
		System.out.println("n = x++;"+eql_str+n);
		
		int m = ++x;
		System.out.println("m = ++x;"+eql_str+m);
		
		x=x+2;
		System.out.println("x=x+2;"+eql_str+x);
		
		x+=2;
		System.out.println("x+=2;"+eql_str+x);
		
		x = x+3;
		System.out.println("x = x+3;"+eql_str+x);
		
		x+=3;
		System.out.println("x+=3;"+eql_str+x);
		
	}
	
}
