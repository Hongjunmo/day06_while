package day06_while;

public class Quiz05 {
	public static void main(String[] args) {

//			//---- 1번문제 구구단
//		int su ,dan;
//		
//		for(dan=2; dan<=9; dan++) {
//			
//			for(su =1; su<=9; su++) {
//				
//			System.out.println(dan+"단 : "+ dan+"X"+su+"= " + dan*su);
//			}
//			System.out.println();
//		}

		// ---- 2번문제 삼각형 별찍기
//		for(int i =1 ;i<=4; i++) {
//				
//			for(int j=0; j<i; j++) {
//				System.out.print("*");
//				
//			}
//			System.out.println("");
//		}

		// ---- 3번문제 별찍기 역삼각

//		for(int i=0; i<=5; i++) {
//			for(int j = 5; j>i; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		// ----4번 문제 1~1000까지 숫자중 약수갯수가 6개인 수의 갯수

		int num = 0, cnt = 0;
		for (int i = 1; i < 1001; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					cnt++;
				}
			}
			if (cnt == 6) {
				num++;
				cnt = 0;
			} else {
				cnt = 0;
			}
		}
		System.out.println(num);

//		 ----5번 문제 1~100 소수출력
//		int count = 0;
//		for (int i = 2; i <= 100; i++) {
//			for (int j = 1; j < i; j++) {
//				if (i % j == 0) {
//					count++;
//				}
//				}
//			if(count==1) {
//				System.out.println(i);
//			}
//			count=0;
//		}

	}
}
