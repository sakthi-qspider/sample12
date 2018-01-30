package practice;

public class arraysecondhighstvalue {

	public static void main(String[] args) {
		int arr[]= {200,400,100,500};
		int highst=arr[0];
		int second=arr[0];
		for(int i=0;i<=arr.length;i++) {
			System.out.println(arr[i]);
			
			
		}
		for(int i=0;i<=arr.length;i++) {
			if(arr[i]>highst) {
				second=highst;
				highst=arr[i];
				
				
			}else if(arr[i]>second) {
				second=arr[i];
				
			}
		}
System.out.println(second);
	}

}
