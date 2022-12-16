package starCraft.game.juntae;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Computer {
	public static void main(String[] args) {
//	public Computer() {
			
		int maxMineral = 1000; // private

		HashMap<UnitItem, Integer> enemyUnits = new HashMap<UnitItem, Integer>();

		Random rd = new Random();// 랜덤 객체 생성
		int tribe = rd.nextInt(3);

		List<UnitItem> confirmUnit;

		List<UnitItem> terran = GameManager.getInstance().getTerranUnit().getUnitList();
		List<UnitItem> zerg = GameManager.getInstance().getZergUnit().getUnitList();
		List<UnitItem> protoss = GameManager.getInstance().getProtossUnit().getUnitList();

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
			maxMineral -= confirmUnit.get(temp).getPrice();
			if (maxMineral < 0) {
				break;
			}
			if (enemyUnits.containsKey(confirmUnit.get(temp))) {
				enemyUnits.put(confirmUnit.get(temp), enemyUnits.get(confirmUnit.get(temp)) + 1);
			} else {
				enemyUnits.put(confirmUnit.get(temp), 1);
			} 
		}
		
		int enemyPower = 0;
		Iterator<UnitItem> keys = enemyUnits.keySet().iterator();
        while (keys.hasNext()){
            UnitItem key = keys.next();
            enemyPower += key.getPower()*enemyUnits.get(key);
        }
        System.out.println(enemyUnits);
        System.out.println(enemyPower);
        UnitItem[][] synergy = {{confirmUnit.get(0), confirmUnit.get(1)}, {confirmUnit.get(1), confirmUnit.get(1)}};
        for (UnitItem[] unitItems : synergy) {
			if(unitItems in enemyUnits.keySet())
		}
		
	}

}
