package juntae;

public class Battle {
	public static void battle() {
		int userPower = CalculateMineral.userPower;
		int enemyPower = Computer.enemyPower;
		
		
		System.out.println("유저 전투력 : "+userPower+", 컴퓨터 전투력 : "+enemyPower+" 입니다.");
		if(userPower>enemyPower) {
			System.out.println("당신의 승리입니다!!");
		} else if(userPower==enemyPower) {
			System.out.println("무승부 입니다!!");
		} else {
			System.out.println("당신의 패배입니다!!");
		}
	}
}
