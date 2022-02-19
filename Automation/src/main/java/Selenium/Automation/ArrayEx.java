package Selenium.Automation;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
		arr[0]=2;
		arr[1]=3;
		arr[2]=4;
		arr[3]=54;
		arr[4]=68;
		String[] name= {"ram","hello","shyam"};
		System.out.println(arr[3]);
		
		//for(int i = 0;i<name .length;i++) {
			//System.out.println(name[i]);
	//	}
		
		for( String s:name) {
			System.out.println(s);
		}
		for(int j=0;j<arr.length;j++) {
			if (arr[j] % 2==0) {
		System.out.println(arr[j]);
		break;
			}
			else
			{
				System.out.println(arr[j] +"  is not multiple of 2");
			}
}

	}  

}
