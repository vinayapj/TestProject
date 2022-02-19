package Selenium.Automation;

public class StringVowelReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "Welcome to Candid Java Programming";    //Input String
	      System.out.println("Input String : "+string);   //Displaying Input String
	      string = string.replaceAll("[AaEeIiOoUu]", "*");  //Replace vowels with star
	         //Display the word after replacement
	      
	      //string=string.replaceAll("[AaWl]", "%");
	      
	      System.out.println(string);
	    
	}

}
