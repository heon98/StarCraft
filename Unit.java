package juntae;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Unit {
	private String title;
	private List<UnitItem> unitList;

	@Override
	public String toString() {
		for (UnitItem unitItem : unitList) {
			System.out.println(unitItem);
		}
		return "--------------------------------------------------------------------------------";
	}
	
}
