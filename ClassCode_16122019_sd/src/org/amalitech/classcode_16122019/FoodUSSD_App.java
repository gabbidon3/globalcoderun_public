package org.amalitech.classcode_16122019;

import java.util.Scanner;

public class FoodUSSD_App {

	static String name_of_person_str;// = "Kofi";
	
	static String menu_1 = "1. Fried Rice & Chicken";
	static String menu_2 = "\n2. Banku And Okro";
	static String menu_3 = "\n3. Chips & Chicken";
	
	static String list_of_menu = 
			menu_1
			+ menu_2
			+ menu_3;
	
	public static void main (String [] args){
		
		System.out.println(
				"Please select your meal by entering "
				+ "\n1, 2 or 3");
		
		System.out.println("The menu available are : "
				+ list_of_menu);
		
		Scanner kybd = new Scanner(System.in);
		
		int usrInpt = kybd.nextInt();
		
		if(usrInpt == 1) {
			System.out.println("You selected : "+menu_1);
		}else {
			if(usrInpt == 2){
				System.out.println("You selected : "+menu_2);
			}else{
				if(usrInpt == 3){
					System.out.println("You selected : "+menu_3);
				}else{
					System.out.println("Invalid Input. Please try again");
				}
			}
		}
		
		setUserName("Kofi");
		
		welcomeUserByName();
		
		//welcomeUser();
		
	}

	private static void welcomeUserByName() {
		String success_message_str = 
			"Hello "
			//+name_of_person_str
			+ getUserName()
			+", the meal you selected is ... ";
		
		System.out.println(success_message_str);
	}
	
	//setters 
	public static void setUserName(String userName_str){
		name_of_person_str=userName_str;
	}
	
	//getters 
	public static String getUserName(){
		return name_of_person_str;
	}
	
	//welcomeUser
	public static void welcomeUser(){
		welcomeUserByName();
	}
	
	//We are building a very simple console app
	//for users to select their meals for the 
	//day before
	
	//1. Enter your name
	
	//2. If the name entered is ok and it is a human being
		//if the name is more than 2 characters , then proceed
		//else , tell the user to enter a proper name
		//if the number of trials to get a proper exceeds
		//3, give the user an option to restart the program
		//or end the program
	
	//3. If the name is now fully ok, then 
		//Show the menu available
	
	//4. Tell the user on level of success of selection of
		//meal
	
	
}
