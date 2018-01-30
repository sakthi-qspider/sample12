package practice;

public class RemoveduplicatefromArray {

	public static void main(String[] args) {
		int arr[]= {10,30,20,40,10,60};
		int size=arr.length;
		System.out.println("Before Remoing Duplicate:"+ size);
		for(int i=0;i<size;i++) {
			
			
			for(int j=i+1;j<size;j++) {
				if(arr[i]==arr[j]) {
					while(j<size-1) {
						arr[j]=arr[j+1];
						j++;
						
					}
					size--;
				}
			}
			
		}
		System.out.println("After removing duplicate:"+size);
		for(int k=0;k<size;k++) {
			System.out.println(arr[k]);
		
		}

	}

}
