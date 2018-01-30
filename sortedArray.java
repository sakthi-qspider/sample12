package practice;

import java.util.Arrays;

public class sortedArray {

	public static void main(String[] args) {
		int arr[]= {45,7,62,12,36};
		int temp=0;
		boolean flag=true;
		while(flag) {
			flag=false;
			for(int i=0;i<arr.length-1;i++) {
				if(arr[i]>arr[i+1]) {
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
					flag=true;
					
				}
			}
			
		}
System.out.println(Arrays.toString(arr));
	}

}
