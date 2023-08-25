package program;

public class StringPalindrome {
	public static void main(String[] args) {
		String org_str="radar",str="";
		
		for (int i=org_str.length()-1;i>=0; i--) {//0
			str=str+org_str.charAt(i);
		}
		if(org_str.equals(str)) {
			System.out.println("is paindrome");
		}
		else {
			System.out.println("not palindrome");
		}
		
		
	}

}
