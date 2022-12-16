package starCraft.game.juntae;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class calculateMineral {

	public static HashMap calculateChange() {
		int maxMineral = 1000;

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
			int temp = sc.nextInt() - 1;
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
			System.out.println(userUnits);
		}
		System.out.println("유닛 구매가 완료되었습니다.");
		return userUnits;
	}
}