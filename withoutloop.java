package practice;

public class withoutloop {
	
	

	public static void main(String[] args) {
		withoutloop(1);
	}
		
	public  static void withoutloop(int number) {
		if(number<=100) {
			
			
			System.out.println(number);	
			number++;
			
			withoutloop(number);
			
			
			
		}
		else {
			System.exit(0);
		}
		

	}

}
