package starCraft.game.juntae;


import java.util.Scanner;

import lombok.AllArgsConstructor;
import lombok.Getter;

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
public class User {
	private String nickName;
	private int mineral;
	private String tride;
//	private UserInfo userInfo;
	
	public Unit showUnit() {
		if (tride == "테란") {
			return GameManager.getInstance().getTerranUnit();
		} else if (tride == "저그") {
			return GameManager.getInstance().getZergUnit();
		} else {
			return GameManager.getInstance().getProtossUnit();
		}
	}
	
	public void selectTride() {
		Scanner sc = new Scanner(System.in);
		int isTrideSelect = sc.nextInt();
		if((isTrideSelect == 1) || (isTrideSelect == 1) || (isTrideSelect == 1)) {
			Tride trides = GameManager.getInstance().getTrides().get(isTrideSelect - 1);
			tride = trides.getTitle();
			System.out.println("당신의 종족은 " + trides.getTitle() + "입니다.");
		} else {
			System.out.println("종족을 제대로 선택해주세요");
			System.out.println("1번 테란 | 2번 저그 | 3번 프로토스");
			selectTride();
		}
	}

	public void selectUnit() {
		Unit unit = showUnit();
		System.out.println(unit);
	}

	public User(String nickName, int mineral) {
		super();
		this.nickName = nickName;
		this.mineral = mineral;
	}
	
}
