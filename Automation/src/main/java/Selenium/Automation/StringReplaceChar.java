package Selenium.Automation;

import java.util.Scanner;

public class StringReplaceChar {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any string");
		String s1=s.nextLine();
		char ch[]=s1.toCharArray();
		
		for(int i=0; i<ch.length;i++)
		{
			if(ch[i]=='A' || ch[i]=='E' || ch[i]=='I')
			{
				ch[i]='$';
				
			}
		}
		
		for(int j=0;j<ch.length;j++)
		{
			System.out.print(ch[j]);
			
		}		
		
		
	}
}
		
		
		
		
		
		
		
		
		
		
//		
//		Scanner scan=new Scanner(System.in);
//			System.out.println("Enter any String");
//			String str=scan.nextLine();
//			char ch[]=str.toCharArray();
//			System.out.println(ch.length);
//			for(int i=0;i<ch.length;i++)
//			{
//				if (ch[i]=='A' ||ch[i]=='a' ||ch[i]=='E' ||ch[i]=='e' ||ch[i]=='I' ||ch[i]=='i' ||ch[i]=='O' ||ch[i]=='o' ||ch[i]=='U' ||ch[i]=='u')
//				{
//					ch[i]='$';
//					
//				}
//			}
//			for(int j=0; j<ch.length;j++)
//				{
//					System.out.print(ch[j]);
//		
//				}
//			
//	}


