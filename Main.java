package program;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static int elementFrequency(int N, int M, int[] A) {
		Map<Integer, Integer> mp= new HashMap<Integer,Integer>();
		for (int i = 0; i <N; i++) {
			if (!mp.containsKey(A[i])) {
				mp.put(A[i],0);
				mp.put(A[i],mp.get(A[i])+1);
				
				
			}
		}	
		int result=0;
		for(Map.Entry<Integer,Integer> kvp:mp.entrySet()) {
			if (kvp.getValue()< M) {
				result += M - kvp.getValue();
					
			}
		}
			
		return result;
	}
	public static void  main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int N =sc.nextInt();
		int M =sc.nextInt();
		int A[]= new int[N];
		for(int i=0; i<N;i++) {
			A[i]=sc.nextInt();
		}
		System.out.println(elementFrequency(N,M,A));
		sc.close();
	}

}
