package org.amalitech.classcode_18122019;

public class ForLoopAndArrays {

	public static void main(String[] args) {

		String [] usrNm_arr = {
						"Adwoa",
						"Afia",
						"Joe",
						"Smith",
						"Andy",
						"Kim",
						"Kofi",
						"Ama"
		};
		
		int [] account_enable_i = {
				1,//Adwoa's account is enabled
				1,//Afia's account is disabled
				1,//Joe's account is enabled
				1,//Smith's account is enabled
				0,//Andy's account is disabled
				1,//Kim
				1,//Kofi
				1//Ama
		};
		
		//Understanding of for loops 
		/*
		 for(initialisation, condition, incremental){
		 	//actions / expressions / statements
		 } 
		*/
		
		System.out.println("The users are :\n");
		/*for(int i=0; i<usrNm_arr.length; i++){
			String status_0 = "Disabled", status_1="Enabled";
			String status_str;
			if(account_enable_i[i]==0){//Account Disabled
				status_str= "("+status_0+")";//"(Disabled)";
			}else{//Account Enabled
				status_str = "("+status_1+")";//"(Enabled)";
			}
			
			System.out.println(Integer.toString(i+1)+". "
					+usrNm_arr[i]+" "+status_str);
		}*/
		
		for(int i=0; i<usrNm_arr.length; i++) {
			/*String tenary_op_str = (account_enable_i[i]==0)? "(Disabled)" : "(Enabled)";
			System.out.println(Integer.toString(i+1)+". "+usrNm_arr[i]+" "+tenary_op_str);
			*/
			String stmnt_out_str = (account_enable_i[i]==0) ? "(Disabled)" : "(Enabled)";
			System.out.println( Integer.toString(i+1)+". "+usrNm_arr[i]+" "+stmnt_out_str);
			
		}
		
	}

}
