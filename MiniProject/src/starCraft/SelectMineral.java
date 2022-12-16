package starCraft;

import java.util.Scanner;

public class SelectMineral {
	static int maxMineral;
	public static void selectMineral() {
		System.out.print("\n최대 자원을 몇으로 할 지 선택하세요.(추천 : 1000~2000) : ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while (true) {
			maxMineral = sc.nextInt();
			if (maxMineral>=500 && maxMineral<=3000) {
				break;
			}
			System.err.print("자원의 양을 500~3000 사이로 입력해주세요");
		}
	}
}
