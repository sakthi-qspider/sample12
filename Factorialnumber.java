package practice;

import java.util.Scanner;

public class Factorialnumber {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the Factorial Number:");
	int n=scan.nextInt();
	int fact=1;
	
	for(int i=n;i>=1;i--) {
		fact=fact*i;
		
		
		
		
	}
	
	System.out.println("The Factorial Number is :"+"is"+fact);
	}

}
