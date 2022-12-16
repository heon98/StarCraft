package juntae;

public class Battle {
	public static void battle() {
		int userPower = CalculateMineral.userPower;
		int enemyPower = Computer.enemyPower;
		
		
		System.err.println("유저 전투력 : "+userPower+", 컴퓨터 전투력 : "+enemyPower+" 입니다.");
		if(userPower>enemyPower) {
			System.err.println("당신의 승리입니다!!");
		} else if(userPower==enemyPower) {
			System.err.println("무승부 입니다!!");
		} else {
			System.err.println("당신의 패배입니다!!");
		}
	}
}
