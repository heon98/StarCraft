package starCraft.game.juntae;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
* Field Summary
* 1. 유닛 이름 - String name;
* 2. 유닛 가격 - int price;
* 3. 유닛 전투력 - int power;
* 4. 인덱스 - int num;
*/

@ToString
@Getter
@AllArgsConstructor
public class UnitItem {
	private String name;
	private int price;
	private int power;
	private int num;

}
