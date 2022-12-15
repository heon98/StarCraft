package starCraft.game.juntae;

import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Computer {

	public static void main(String[] args) {
		int maxMineral = 1000; // private

		HashMap<UnitItem, Integer> enemyUnits = new HashMap<UnitItem, Integer>();

		Random rd = new Random();// 랜덤 객체 생성
		int tribe = rd.nextInt(3);

		List<UnitItem> confirmUnit;

		List<UnitItem> terran = GameManager.getInstance().getTerranUnit().getUnitList();
		List<UnitItem> zerg = GameManager.getInstance().getZergUnit().getUnitList();
		List<UnitItem> protoss = GameManager.getInstance().getProtossUnit().getUnitList();

//		System.out.println(terran.get(5));

		if (tribe == 0) {
			confirmUnit = terran;
		} else if (tribe == 1) {
			confirmUnit = zerg;
		} else {
			confirmUnit = protoss;
		}

		// 제약조건
		// 미네랄 1000

		while (maxMineral >= 0) {
			int temp = rd.nextInt(6);
			if (enemyUnits.containsKey(terran.get(temp))) {
				enemyUnits.put(confirmUnit.get(temp), enemyUnits.get(confirmUnit.get(temp)) + 1);
			} else {
				enemyUnits.put(confirmUnit.get(temp), 1);
			} 
			maxMineral -= terran.get(temp).getPrice();
		}
		
		System.out.println(enemyUnits);
		
		
		// 합격
//		enemyUnits.put(terran.get(0), 1);
//		enemyUnits.put(terran.get(0), enemyUnits.get(terran.get(0))+1);
//		enemyUnits.put(terran.get(0), enemyUnits.get(terran.get(0))+1);
//		System.out.println(enemyUnits);
		


	}

}
