package day06_while;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int i, temp;
		System.out.println("수 입력 : ");
		i = scan.nextInt();
		while (true) {
			temp = i % 10; 		//10으로 계속 나눠 0이될때까지 나머지 를 출력함 
			i = i / 10;   
			System.out.print(temp + " ");
			if (i == 0)
				break;
		}
		System.out.println();

	}
}
