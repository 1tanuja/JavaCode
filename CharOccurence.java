package program;

public class CharOccurence {
	
	public static void main(String[] args) {
		String str="aaaabbbcc";
		char ch='a';
		int count=0;
		for (int i = 0; i < str.length(); i++) { //0,1,2,3,4,5,5,7,8
			if (str.charAt(i)==ch) {
				count++;
			}
			
		}
		System.out.println("occurence of"+" "+ch+" is"+count);
		
	}

}
