package program;

public class EachStringOccurence {
	public static void main(String[] args) {
		String str="esrstrcesersrreerreyy";
		int counter[] =new int[250];
		for (int i = 0; i < str.length(); i++) {
			counter[(int)str.charAt(i)]++;
		}
		for (int i = 0; i < counter.length; i++) {
			if (counter[i]!=0) {
				System.out.println((char)i+" "+"occures"+" "+counter[i]+" "+"times");
			}
		}
	}

}
