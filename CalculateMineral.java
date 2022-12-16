package juntae;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import lombok.Getter;

@Getter
public class CalculateMineral {
	static int userPower = 0;
	
	public static HashMap calculateChange() {
		int maxMineral = 2000;

		HashMap<UnitItem, Integer> userUnits = new HashMap<UnitItem, Integer>();

		List<UnitItem> confirmUnit;
		List<UnitItem> terran = GameManager.getInstance().getTerranUnit().getUnitList();
		List<UnitItem> zerg = GameManager.getInstance().getZergUnit().getUnitList();
		List<UnitItem> protoss = GameManager.getInstance().getProtossUnit().getUnitList();

		String tride = User.tride;

		if (tride == "테란") {
			confirmUnit = terran;
		} else if (tride == "저그") {
			confirmUnit = zerg;
		} else {
			confirmUnit = protoss;
		}

		while (true && maxMineral != 0) {
			System.out.println(maxMineral + "원 남았습니다.");
			System.out.print("생성할 유닛번호를 입력하세요/ 멈추려면 10을 입력해주세요.");
			Scanner sc = new Scanner(System.in);
			int temp;
			
			while (true) {
				temp = sc.nextInt() - 1;
				if ((temp <= 5 && temp >=0)|| temp == 9) {
					break;
				}
				System.out.println("1~6의 유닛 번호를 입력 하시거나 종료하시기 위해 10을 입력해주세요.");
			}

			if (temp == 9) {
				break;
			}
			maxMineral -= confirmUnit.get(temp).getPrice();
			if (maxMineral < 0) {
				System.out.println("돈이없어서 못사는 유닛입니다.");
				maxMineral += confirmUnit.get(temp).getPrice();
			}
			else if (userUnits.containsKey(confirmUnit.get(temp))) {
				userUnits.put(confirmUnit.get(temp), userUnits.get(confirmUnit.get(temp)) + 1);
			} else {
				userUnits.put(confirmUnit.get(temp), 1);
			}
            System.out.println("--------------------------------------------");
			Iterator<UnitItem> keys = userUnits.keySet().iterator();
	        while (keys.hasNext()){
	            UnitItem key = keys.next();
	            System.out.println(key.getName() + " = " + userUnits.get(key) + " 개");
	        }
            System.out.println("--------------------------------------------");
		}
		System.out.println("유닛 구매가 완료되었습니다.");

		Iterator<UnitItem> keys = userUnits.keySet().iterator();
        while (keys.hasNext()){
            UnitItem key = keys.next();
            userPower += key.getPower()*userUnits.get(key);
            System.out.println(key.getName() + " = " + userUnits.get(key) + " 개");
        }
        
		return userUnits;
	}
}