package chapter3;

import java.util.Scanner;

public class OperatorEx25 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char ch= ' ';
		System.out.printf("gogo letter.>");
		String input = scanner.nextLine();
		ch=input.charAt(0);
		
		if('0'<= ch && ch <='9') {
			System.out.println("number");
		}
		if(('a'<=ch && ch<='z')||('A'<=ch && ch<='Z')) {
			System.out.println("English Letter.");
		}
	}
}
