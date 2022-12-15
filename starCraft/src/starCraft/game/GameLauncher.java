package starCraft.game;

import java.util.Scanner;

import starCraft.game.gameComponent.Tribe;

/**
 * 게임 시작
 * 1. 종족을 보여주고 선택
 * 2. 종족의 유닛 보여주고 선택
 * 3. 추가 선택 여부
 * -> yes 추가 선택
 * -> no 뽑은 유닛 보여주고 사용 자원 보여주기
 */

public class GameLauncher {

	public static void main(String[] args) {
		System.out.println("종족 고르세요.(Zerg / Protoss / Terran)");
//		Scanner sc = new Scanner();
//		
//		String tribe = sc.nextLine();
//		sc.nextLine();
//		
//		if (tribe == "Zerg") {
//			// zerg 클래스에서 가져오기
//		}
//		else if (tribe == "Terran") {
//			// terran 클래스 참조
//		}
//		else if (tribe == "Protoss") {
//			// ~~
//		}
//		else {
//			System.out.println("제대로 선택해주세요.");
//			
//		}
		
		Tribe.showTerran();
	}

}
