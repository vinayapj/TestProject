package Selenium.Automation;
import java.util.Scanner;
public class basicProject {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name=");
		String name = sc.next();
		sc.close();
		for(int i=1;i<=5;i++)
			System.out.println(name+" is your name");

	}

}
