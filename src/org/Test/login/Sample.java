package org.Test.login;

public class Sample {
	

	public static void main(String[] args) {
		
		String s ="Java application";
		String s1 = "JaVa application";
		
		boolean equals = s.equals(s1);
		System.out.println(equals);
		
		boolean equalsIgnoreCase = s.equalsIgnoreCase(s1);
		System.out.println(equalsIgnoreCase);
		
		boolean startsWith = s.startsWith(s);
		System.out.println(startsWith);
		
		int length = s.length();
		System.out.println(length);

		int charNew = s.charAt(2);
		System.out.println(charNew);
}
}