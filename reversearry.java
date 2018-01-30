package practice;

import java.util.Arrays;

public class reversearry {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		int temp=0;
	boolean flag=true;
		int startindex=0;
		int endindex=arr.length-1;
		while(flag) {
			flag=false;
		}
		for(int i=0;i<arr.length/2;i++) {
			temp=arr[startindex];
			arr[startindex]=arr[endindex];
			arr[endindex]=temp;
			startindex++;
			endindex--;
			flag=true;
			
			
		}
		System.out.println(Arrays.toString(arr));

	}
}

