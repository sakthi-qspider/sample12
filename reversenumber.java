package practice;

public class reversenumber {

	public static void main(String[] args) {
		int num= 123;
		int reversed=0;
		while(num!=0) {
			int temp =num%10;
			reversed=reversed*10+temp;
			num/=10;
		}
		System.out.println("Reversed is" +  reversed);
		
			
		

	}

}
