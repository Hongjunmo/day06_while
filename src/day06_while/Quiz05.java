package day06_while;

public class Quiz05 {
	public static void main(String[] args) {

//			//---- 1������ ������
//		int su ,dan;
//		
//		for(dan=2; dan<=9; dan++) {
//			
//			for(su =1; su<=9; su++) {
//				
//			System.out.println(dan+"�� : "+ dan+"X"+su+"= " + dan*su);
//			}
//			System.out.println();
//		}

		// ---- 2������ �ﰢ�� �����
//		for(int i =1 ;i<=4; i++) {
//				
//			for(int j=0; j<i; j++) {
//				System.out.print("*");
//				
//			}
//			System.out.println("");
//		}

		// ---- 3������ ����� ���ﰢ

//		for(int i=0; i<=5; i++) {
//			for(int j = 5; j>i; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		// ----4�� ���� 1~1000���� ������ ��������� 6���� ���� ����

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

//		 ----5�� ���� 1~100 �Ҽ����
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
