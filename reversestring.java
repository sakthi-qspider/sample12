package practice;

public class reversestring {
	public static void main (String[]args) {
		
		String s=" sakthi as test engineer";
		char[]sarray=s.toCharArray();
		for(int i=sarray.length-1;i>=0;i--) {
			System.out.print(sarray[i]);
		}
	}

}
