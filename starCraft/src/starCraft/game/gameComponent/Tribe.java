package starCraft.game.gameComponent;

import java.util.List;

import lombok.ToString;

@ToString
public class Tribe {
	
	static Terran terran1 = new Terran("마린", 50, 10, 1);
	static Terran terran2 = new Terran("탱크", 300, 50, 2);
	static Terran terran3 = new Terran("골리앗", 250, 40, 3);
	static Terran terran4 = new Terran("벌쳐", 100, 20, 4);
	static Terran terran5 = new Terran("레이스", 200, 30, 5);
	static Terran terran6 = new Terran("배틀크루져", 350, 70, 6);
	
	public static Terran[] terran_list = {
			terran1, terran2, terran3, terran4, terran5, terran6
	};
	
	public static void showTerran() {
		System.out.println(terran_list);
	}
	
	private List<Terran> protoss;
	
	private List<Terran> zerg;
	
	
	
	
//	@Override
//	public String toString() {
//		for (Terran menuItem : menuList) {
//			System.out.println("음료명 : " + menuItem.getName());
//			System.out.println(menuItem);
//		}
//		return "결정되면 스태프에게 주문하세요";
}
