package study;

public class Exercise9_3 {

	public static void main(String[] args) {
		String fullPath = "c:\\jdk1.8\\work\\PathSeparateTest.java";	
		String path = "";
		String fileName = "";
		
		
		
		System.out.println("fullPath:"+fullPath);
		System.out.println("path:"+fullPath.substring(0, 14));
		System.out.println("fileName:"+fileName);
		
		String p=	fullPath.substring(0, 14);
		
		System.out.println(p);
	}

}

//path:c:\jdk1.8\work
//fileName:PathSeparateTest.java