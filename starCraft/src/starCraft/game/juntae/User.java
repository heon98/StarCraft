package starCraft.game.juntae;


import java.util.Scanner;

import lombok.AllArgsConstructor;
import lombok.Getter;
import step08oopcafe.cafe.CafeManager;
import step08oopcafe.cafe.hall.Menu;

/**
 * 유저는 종족을 선택할수있음
 * 유저는 유닛 선택시에 자원을 지불함
 * 자신이 가진 자원보다 높은 자원유닛은 생성 불가능
 * 
 * 
 * Field Summary
 * 1. 주문용 닉네임 - String nickName;
 * 2. 사용할 자원 - int mineral;
 * 3. 사용자 메타 정보 - UserInfo userInfo; 미구현
 * 
 * Method Summary
 * 1. 종족 선택 - Menu selectTride();
 * 2. 유닛 결정 및 결제 - void confirmUnit(); 미구현
 */

@Getter
@AllArgsConstructor
public class User {
	private String nickName;
	private int mineral;
//	private UserInfo userInfo;
	
	public Unit showUnit() {
		return GameManager.getInstance().getUnit();   
	}
	
	public void selectTride() {
		Scanner sc = new Scanner(System.in);
		int isTrideSelect = sc.nextInt();
		Tride tride = GameManager.getInstance().getTrides().get(isTrideSelect - 1);
		System.out.println("당신의 종족은 " + tride.getTitle() + "입니다.");
	}

	public void selectUnit() {
		Unit unit = showUnit();
		System.out.println(unit);
	}
	
}
