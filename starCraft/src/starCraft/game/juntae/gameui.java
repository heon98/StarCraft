package starCraft.game.juntae;

import java.util.Date;

public class gameui {
	public static void main(String args[]) throws InterruptedException {
		Date nowDate = new Date();
		System.out.println("*--------------------------------------------------------*");
		System.out.println("*                                                        *");
		System.out.println("*	스타크래프트 구현예제                                  *");
		System.out.println("*                                                        *");
		System.out.println("*--------------------------------------------------------*");

		System.out.println("스타크래프트 게임을 시작합니다...");
		Thread.sleep(1000);
		User yoo = GameManager.getInstance().getUsers().get(0);
		Thread.sleep(1000);
		System.out.println("당"
				+ "신의 종족을 선택해주세요.....");
		System.out.println("1번 테란 | 2번 저그 | 3번 프로토스");
		yoo.selectTride();
		Thread.sleep(1000);
		System.out.println("최대 사용가능한 미네랄은 1000입니다.");
		Thread.sleep(1000);
		System.out.println("상대의 유닛은");
		Thread.sleep(1000);
		System.out.println("자원을 효율적으로 사용하여 유닛을 생성하고 승리하세요.");
		Thread.sleep(1000);
		yoo.selectUnit();
	}
}
