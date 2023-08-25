package program;

public class PrimeNumber {
	public static void main(String[] args) {
		int num,count=0;
		num=37;
		for (int i=2; i<num; i++) {
			if (num%i==0) {
				count++;
				break;
				
			}
			
		}
		if (count==0) {
			System.out.println("Prime number");
		}else {
			System.out.println("not Prime number");
		}
	}
	

}
