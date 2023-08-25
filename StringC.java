package program;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringC {
	public static void main(String[] args) {
		String str="trupti";
		for(char i:str.toCharArray()) {
			if(str.indexOf(i)==str.lastIndexOf(i)) {
				System.out.println(i );
				
		    }
			
		}
		
		int x=10;
		int y=11;
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println(x+"and"+y);
		
		
		String s1="Tanuja";
		int content[]= new int[250];
		for (int i=0; i<s1.length(); i++) {
			content[(int)str.charAt(i)]++;
		}
		
		ArrayList<String> s= new  ArrayList<String>();
		s.add("Tanuja");
		s.add("Trupti");
		s.add("Manish");
		s.add("Sahana");
		System.out.println(s);
		List<String> result = s.stream().filter(st->s.equals("a")).collect(Collectors.toList());
		System.out.println(result);
	}

	
}
