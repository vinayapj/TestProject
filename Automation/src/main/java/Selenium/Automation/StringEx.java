package Selenium.Automation;

public class StringEx {

	public static void main(String[] args) {
		String s="Hello world Java";
		
		String s1=new String("Selenium Java SQL");
		System.out.println(s.length());
		String[] spl=s1.split("Java");
		System.out.println(spl[0]);
		System.out.println(spl[1]);		
		//System.out.println(spl[2].trim());
		
		//for (int i=0;i<s1.length();i++) {
		//	System.out.println(s1.charAt(i));
		
		for(int i=s1.length()-1;i>=0;i--) {
			System.out.println(s1.charAt(i));
		}
	}

}
