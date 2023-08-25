package program;

public class DuplicateElement {
      public static void main(String[] args) {
		int[] x= {0,1,1,1,2,2,3,3,5,4,6,5,6};//i1,i2,i3,i4
		int[] temp=new int[x.length];//j1,j2,j3,j4,j5
		int j=0;
		for (int i = 0; i < x.length-1; i++) {
			if (x[i]!=x[i+1]) {
				temp[j]=x[i];
			    j++;	
				}
			for (int y : x) { //
				System.out.println(y);
			}
			
		}
	}
}
