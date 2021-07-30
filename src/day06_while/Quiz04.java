package day06_while;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int money, select;

		System.out.print("요금을 투입 하세요 >>> ");
		money = scan.nextInt();

		while (true) {

			System.out.println("==========커피 자판기 =============");
			System.out.println("1. 커피(200) 2. 코코아 (250) 3.반환 4.종료 ");
			System.out.print("메뉴를 선택하세요 >>> ");
			select = scan.nextInt();
			switch (select) {
			case 1:
				if (money <= 200) {
					System.out.println("요금이 부족합니다");
				} else {
					money= money-200;
					System.out.println("맛있게 드세요 남은 금액 : " + money);
				}
				break;
			case 2:
				if (money <= 250) {
					System.out.println("요금이 부족합니다");
				} else {
					money= money-250;
					System.out.println("맛있게 드세요 남은 금액 : " + money);
				}
				break;
			case 3:
				System.out.println("거스름돈 : " + money);
				break;
			case 4:
				System.out.println("종료합니다.");
				System.exit(0);

			}

		}

	}
}
