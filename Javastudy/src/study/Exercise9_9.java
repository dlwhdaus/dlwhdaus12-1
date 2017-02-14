//굿 문제[ 좋아욤!!

package study;

public class Exercise9_9 {

	public static String delChar(String num1,String num2){
		
		StringBuffer buffer = new StringBuffer();
		
		for(int i= 0; i < num1.length(); i++){
			char num1Arr = num1.charAt(i);
			
			if(num2.indexOf(num1Arr) == -1 )
				buffer.append(num1Arr);
			
			
		}
		
		return buffer.toString();
	}
	
	
	
	public static void main(String[] args) {

		
		System.out.println("(1!2@3^4~5)"+" -> "+delChar("(1!2@3^4~5)","~!@#$%^&*()"));
		
		
	}

}


//(1!2@3^4~5) -> 12345