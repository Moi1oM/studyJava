package chapter4;

import java.util.Scanner;

public class FlowEx6 {
	public static void main(String[] args) {
		System.out.print("현재 월을 입력하세요");
		Scanner scanner= new Scanner(System.in);
		int month=scanner.nextInt();
		switch(month) {
			case 3:
			case 4:
			case 5:
				System.out.println("Spring");
				break;
			case 6: case 7: case 8:
				System.out.println("Summer");
				break;
			case 9: case 10: case 11:
				System.out.println("Fall");
				break;
			default:
				System.out.println("Winter");
		}
	}
}
