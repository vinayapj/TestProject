package Selenium.Automation;

public class MethodsExample {
	
	public static void main(String[] args) {
		MethodsExample m=new MethodsExample();
		String name = m.getData();
		System.out.println(name);
		
	}
	
public String getData() {
	System.out.println("hello world");
	return "Ram";
}
} 
