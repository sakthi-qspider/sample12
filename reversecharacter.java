package practice;

public class reversecharacter {

	public static void main(String[] args) {
		String str="welcome to candid java tutorial";
		char[] ch=str.toCharArray();
		
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(ch[i]);
			
		}
		
		
		

	}

}
