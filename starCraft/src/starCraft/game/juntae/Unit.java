package starCraft.game.juntae;

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
		return "추가하고싶은 유닛 번호를 입력하세요";
	}

}