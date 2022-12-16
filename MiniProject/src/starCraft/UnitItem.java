package starCraft;

import lombok.AllArgsConstructor;
import lombok.Getter;


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
