package study;

import javax.xml.bind.ParseConversionEvent;

public class Exercise9_8 {

	public static void main(String[] args) {

		System.out.println(round(3.1415,1));
		System.out.println(round(3.1415,2));
		System.out.println(round(3.1415,3));
		System.out.println(round(3.1415,4));
		System.out.println(round(3.1415,5));
		
		
	}
						
	private static double round(double d, int n) {

		return Math.round(d * Math.pow(10, n)) / Math.pow(10,n);
		
	}

}
/*
 *	3.1
	3.14
	3.142
	3.1415
	3.1415
 */
