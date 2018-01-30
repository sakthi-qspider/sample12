package practice;

public class palindrom {

	public static void main(String[] args) {
		String str="sakthi";
		String str2="";
		
		for(int i=str.length()-1;i>0;i--)
		{
			String str3=str.substring(i, i+1);
			str2=str2+str3;
			if(str.equals(str2)) {
				System.out.println("Given String is palindrom");
			}else {
				System.out.println("Given String is not palindrom");
				break;
			}
		}
	}

}
