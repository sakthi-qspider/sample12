package practice;

public class Arrayhighestnumber {

	public static void main(String[] args) {
		int arr[]= {10,30,40,60};
		int firsthighestnumber= 0;
		int secondhighestnumber=0;
		for(int i=0;i<arr.length;i++) {
			//System.out.println(arr[i]+"\t");
		}
for(int i=0;i<arr.length;i++) {
	if(arr[i]>firsthighestnumber) {
		secondhighestnumber=firsthighestnumber;
		firsthighestnumber=arr[i];
	}
		else if(arr[i]>secondhighestnumber) {
			secondhighestnumber=arr[i];
			
			
		}
	
	
	}
System.out.println(" the second highest number is: " + secondhighestnumber);
}
	}


