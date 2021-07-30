package day06_while;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String id = null, id1, pw = null, pw1;
		while (true) {
			System.out.println("1.로그인");
			System.out.println("2.회원기입");
			System.out.println("3.나가기");
			System.out.print(">>> ");
			int select = scan.nextInt();
			switch (select) {
			case 1:
				System.out.print("아이디 입력: ");
				id1 = scan.next();
				System.out.print("비밀번호 입력: ");
				pw1 = scan.next();

				if (id1.equals(id) && pw1.equals(pw)) {
					System.out.println("인증 성공!");
				} else {
					System.out.println("인증 실패!");
				}
				break;

			case 2:
				System.out.println("회원가입 진행.");
				System.out.print("아이디: ");
				id = scan.next();
				System.out.print("비밀번호: ");
				pw = scan.next();
				System.out.println("가입 성공!!");
				break;
			case 3:
				System.exit(0);

			}

		}

	}
}
