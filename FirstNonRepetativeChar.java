package program;

public class FirstNonRepetativeChar {
	public static void main(String[] args) {
		String str="trivikrama";
		for (char i : str.toCharArray()) {
			if (str.indexOf(i)==str.lastIndexOf(i)) {
				System.out.println("first non repeatative character is"+" "+i);
				break;
			}
			
			
		}
	}

}
