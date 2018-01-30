package practice;

public class string {
	public static void main(String[]args ){
		
	String str1="sakthi";
	String str2="leena";
	char count='a';
	for(int i=0;i<str1.length();i++) {
		for(int j=0;j<str2.length();j++) {
			if(str1.charAt(i)==str2.charAt(j)) {
				count++;
				System.out.println(count);
			}
				
			}
		}
	}
	
		
	}


