package day06_while;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String id = null, id1, pw = null, pw1;
		while (true) {
			System.out.println("1.�α���");
			System.out.println("2.ȸ������");
			System.out.println("3.������");
			System.out.print(">>> ");
			int select = scan.nextInt();
			switch (select) {
			case 1:
				System.out.print("���̵� �Է�: ");
				id1 = scan.next();
				System.out.print("��й�ȣ �Է�: ");
				pw1 = scan.next();

				if (id1.equals(id) && pw1.equals(pw)) {
					System.out.println("���� ����!");
				} else {
					System.out.println("���� ����!");
				}
				break;

			case 2:
				System.out.println("ȸ������ ����.");
				System.out.print("���̵�: ");
				id = scan.next();
				System.out.print("��й�ȣ: ");
				pw = scan.next();
				System.out.println("���� ����!!");
				break;
			case 3:
				System.exit(0);

			}

		}

	}
}
