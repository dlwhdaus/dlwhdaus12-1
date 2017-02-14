//쉽다~~~~~~~~~~~~~~~~~~~~~~~~~~~

package study;

public class Exercise9_7 {

	public static boolean contains(String number1, String number2){
		
		boolean flag = false;
		if(number1.indexOf(number2) != -1){
			
			return true;
		}
		
		
		
		return flag;
	}
	
	public static void main(String[] args) {
		
		System.out.println(contains("12345","23"));
		System.out.println(contains("12345","67"));
		
		
	}

}
