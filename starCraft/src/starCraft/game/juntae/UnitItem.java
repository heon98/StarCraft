package starCraft.game.juntae;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;


@Getter
@AllArgsConstructor
public class UnitItem {
	private String name;
	private int price;
	private int power;
	private int num;
	
	@Override
	public String toString() {
		return "[" + name + ", 가격 = " + price + ", 유닛 번호 = " + num + "]";
	}
	
}
