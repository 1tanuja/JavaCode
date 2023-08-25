package program;

import java.sql.Array;
import java.util.List;

public class SecondLargestNumber {
	public static int getSecondLargest(int[]a,int total) {
	    int temp;
		for (int i = 0; i < total; i++) {
			for (int j = i+1; j < total; j++) {
				if (a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		
		return a[total-2] ;
	}
	public static void main(String[] args) {
		int a[]= {1,3,5,6,7,8};
		System.out.println("second largest"+getSecondLargest(a,6));
		
	}

}
