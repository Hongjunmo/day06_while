package day06_while;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	
		while(true) {
			System.out.println("1. 걷기 2. 대중교통 3.종료");
			int select = scan.nextInt();
			switch (select) {
			case 1: System.out.println("걸어가"); break;
			case 2: System.out.println("bus "); break;
			case 3: System.exit(0);
			}
		}
	
	
	
	}
}
