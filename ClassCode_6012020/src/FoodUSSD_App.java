

import java.util.Scanner;

public class FoodUSSD_App {

	static String name_of_person_str;// = "Kofi";
	
	static String menu_1 = "1. Fried Rice & Chicken";
	static String menu_2 = "\n2. Banku And Okro";
	static String menu_3 = "\n3. Chips & Chicken";
	
	static String [] list_of_menu_arr = {
			menu_1,
			menu_2,
			menu_3
	};
	
	//check the list of usernames predefined in
				//the array of usernames
	static String [] usrNm_arr;
	
	
	
	/*usrNm_arr = {
						"Adwoa",
						"Afia",
						"Joe",
						"Smith",
						"Andy",
						"Kim",
						"Kofi",
						"Ama"
	};*/
	
	public static void main (String [] args){
		/*
		String [] a = new String [6];
		
		a[0] = "b";
		a[6] = "c";
		
		String [] y = {
				"n",
				"m",
				"v"
		};
		
		y[3] = "h";
		
		String [] x = new String[]{
			"a",
			"b"
		};
		*/
		
		String [] a = new String [6];
		a[0]="something";
		
		String [] y = {
				"",
				"",
				""
		};
		y[2]="abcd";
		
		
		String [] x = new String[]{
				"",
				""
		};
		x[1]="apple";
		
		System.out.println("a[0] : " + a[0]);
		System.out.println("y[2] : " + y[2]);
		System.out.println("x[1] : " + x[1]);
		
		//We are building a very simple console app
	//for users to select their meals for the 
	//day before
	
	//After welcoming the user : 
		welcomeUser();
		
		//Open the scanner class to take input(s)
		Scanner kybd = new Scanner(System.in);
	
	//1. Enter your username : this would be used for (weak) login
		String entered_usr_nm = kybd.nextLine();
		
	//2. If the name entered is ok and it is a human being
		//if the name is more than 2 characters , then proceed
		int nm_entry_err_countr = 0;
		int total_nm_err_allownc = 3;
		boolean move_on_from_nm_entry = true;
		while(move_on_from_nm_entry && (nm_entry_err_countr <= total_nm_err_allownc)  ) {
			if(entered_usr_nm.trim().length()>=2){
				
				dsply("Name OK!");
				move_on_from_nm_entry=false;
				System.out.println("Welcome, "+entered_usr_nm+".");
				
			}else{
				
				dsply("Please enter a proper name.");
				nm_entry_err_countr++;
				move_on_from_nm_entry=true;
				entered_usr_nm = kybd.nextLine();
			}
		}
		
		
		
	}

	private static void welcomeUserByName() {
		String success_message_str = 
			"Welcome, Please enter your username to proceed .... ";
		
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
	
	public static void dsply(String inpt_str){
		System.out.println(inpt_str);
	}
	
	public static boolean validateUserNmEntered(
			String usrNmEntered_str
	){
		boolean isThisUserInTheArray_bool=false;
		for(int i=0; i<usrNm_arr.length; i++) {
			isThisUserInTheArray_bool = 
			usrNm_arr[i].equals(usrNmEntered_str);
			
		}
		return isThisUserInTheArray_bool;
	}
	
	//else , tell the user to enter a proper name
		//if the number of trials to get a proper name exceeds
		//3, give the user an option to restart the program
		//or end the program
	
	//3. If the name is now fully ok, then 
		//Show the menu available
	
			//3b. Check the array of users added
			//and see if this user (by username) is in the 
			//array.
	
		//System.out.println("Welcome, "+entered_usr_nm+".");
		
			//if the user has been added to the array or is in the 
			//array (ie. yes / true )
	
			//then : Show the list of all meals with instructions on how to select a meal.
			 
			//Open the scanner class for the user to select a meal by
			//number
			
			//Validate the user input for meal selection
	
			//if : yes/ true : Show the user the meal 
			//that was selected and tell about the next step.
	
			//End program ???
	
			//if : yes / true : End the program indeed
	
			//else : no/false : loop back to showing list of meals available.
	
	
	//4. Tell the user on level of success of selection of
		//meal
	
}
