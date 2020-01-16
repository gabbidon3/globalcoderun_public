

public class ForLoopAndArrays {

	static String [] usrNm_arr = {
						"Adwoa",
						"Afia",
						"Joe",
						"Smith",
						"Andy",
						"Kim",
						"Kofi",
						"Ama"
	};
	
	public static void main(String[] args) {

		String enteredUsrNm_str="Kofi";
		
		if(validateUserNmEntered(enteredUsrNm_str)) {
			System.out.println(
				enteredUsrNm_str+" is in the array."
			);
		}else {
			System.out.println(
				enteredUsrNm_str+" is NOT in the array."
			);
		}
	}

	public static boolean validateUserNmEntered(
			String usrNmEntered_str
	){
		boolean isThisUserInTheArray_bool=false;
		for(int i=0; i<usrNm_arr.length; i++) {
			isThisUserInTheArray_bool = 
			usrNm_arr[i].equals(usrNmEntered_str);
			//first suggested solution
			if(isThisUserInTheArray_bool){
				break;
			}
			//second suggested solution
			if(isThisUserInTheArray_bool==true){
				break;
			}
			//third suggested solution
			if(isThisUserInTheArray_bool){
				isThisUserInTheArray_bool=true;
				break;
			}else{
				isThisUserInTheArray_bool=false;
			}
			//fourth suggested solution
			isThisUserInTheArray_bool 
			= usrNm_arr[i].equals(usrNmEntered_str)? true : false;
			if(isThisUserInTheArray_bool){
				break;
			}
		}
		return isThisUserInTheArray_bool;
	}
	
}
