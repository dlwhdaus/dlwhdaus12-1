package study;

public class Exercise9_10 {

	public static String format(String str, int length, int alignment){
		
		int diff = length - str.length();
		if(diff < 0 ) return str.substring(0, length);
		
		
		
		return str; 
	}
	
	public static void main(String[] args) {

		String str = "가나다";
		System.out.println(format(str,7,0)); // 왼쪽 정렬
		System.out.println(format(str,7,1)); // 가운데 정렬
		System.out.println(format(str,7,2)); // 오른쪽 정렬

	
		
	}

}
