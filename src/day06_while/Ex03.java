package day06_while;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int i, temp;
		System.out.println("�� �Է� : ");
		i = scan.nextInt();
		while (true) {
			temp = i % 10; 		//10���� ��� ���� 0�̵ɶ����� ������ �� ����� 
			i = i / 10;   
			System.out.print(temp + " ");
			if (i == 0)
				break;
		}
		System.out.println();

	}
}
