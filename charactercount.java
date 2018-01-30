package practice;

public class charactercount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s=" java is again java";
		char c='a';
		int count=s.length()-s.replace("a","").length();
		System.out.println(" number of character is :"+s+"="+count);

	}

}
