package starCraft.game.juntae;

import java.util.List;

public class calculateMineral {
	
	public static int calculateChange(String isUnitSelect, int mineral) {
			Unit unit = GameManager.getInstance().getTerranUnit();
			List<UnitItem> unitList = unit.getUnitList();
			for (UnitItem unitItem : unitList) {
				if(unitItem.getName().equals(isUnitSelect)) {
					int change = mineral - unitItem.getPrice();
					return change;
				}
			}
		
		return 0; // TODO: 추후 예외처리 적용
	}

}
