package day06_while;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int money, select;

		System.out.print("����� ���� �ϼ��� >>> ");
		money = scan.nextInt();

		while (true) {

			System.out.println("==========Ŀ�� ���Ǳ� =============");
			System.out.println("1. Ŀ��(200) 2. ���ھ� (250) 3.��ȯ 4.���� ");
			System.out.print("�޴��� �����ϼ��� >>> ");
			select = scan.nextInt();
			switch (select) {
			case 1:
				if (money <= 200) {
					System.out.println("����� �����մϴ�");
				} else {
					money= money-200;
					System.out.println("���ְ� �弼�� ���� �ݾ� : " + money);
				}
				break;
			case 2:
				if (money <= 250) {
					System.out.println("����� �����մϴ�");
				} else {
					money= money-250;
					System.out.println("���ְ� �弼�� ���� �ݾ� : " + money);
				}
				break;
			case 3:
				System.out.println("�Ž����� : " + money);
				break;
			case 4:
				System.out.println("�����մϴ�.");
				System.exit(0);

			}

		}

	}
}
