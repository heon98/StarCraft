package starCraft.game.juntae;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class GameManager {
	private List<Tride> trides;
	private List<User> users;
	private Unit unit;
	private Unit terranUnit;
	private Unit zergUnit;
	private Unit protossUnit;

	private static GameManager gameManager = new GameManager();

	private GameManager() {

		// 종족 리스트
		Tride terran = new Tride("테란");
		Tride zerg = new Tride("저그");
		Tride protoss = new Tride("프로토스");

		Tride[] trideList = { terran, zerg, protoss };
		trides = new ArrayList<>(Arrays.asList(trideList));

		// 유닛 메뉴판
		UnitItem unit1 = new UnitItem("마린", 50, 10, 1);
		UnitItem unit2 = new UnitItem("탱크", 300, 50, 2);
		UnitItem unit3 = new UnitItem("골리앗", 250, 40, 3);
		UnitItem unit4 = new UnitItem("벌쳐", 100, 20, 4);
		UnitItem unit5 = new UnitItem("레이스", 200, 30, 5);
		UnitItem unit6 = new UnitItem("배틀크루져", 350, 70, 6);

		UnitItem unit7 = new UnitItem("저글링", 50, 10, 1);
		UnitItem unit8 = new UnitItem("히드라", 100, 20, 2);
		UnitItem unit9 = new UnitItem("럴커", 250, 50, 3);
		UnitItem unit10 = new UnitItem("뮤탈", 150, 30, 4);
		UnitItem unit11 = new UnitItem("스커지", 100, 25, 5);
		UnitItem unit12 = new UnitItem("울트라리스크", 300, 60, 6);

		UnitItem unit13 = new UnitItem("질럿", 150, 15, 1);
		UnitItem unit14 = new UnitItem("드라군", 200, 20, 2);
		UnitItem unit15 = new UnitItem("리버", 300, 30, 3);
		UnitItem unit16 = new UnitItem("스카우트", 300, 30, 4);
		UnitItem unit17 = new UnitItem("셔틀", 200, 0, 5);
		UnitItem unit18 = new UnitItem("캐리어", 400, 70, 6);

		UnitItem[] terranLists = { unit1, unit2, unit3, unit4, unit5, unit6};
		List<UnitItem> terranList = new ArrayList<>(Arrays.asList(terranLists));
		UnitItem[] zergLists = { unit7, unit8, unit9, unit10, unit11, unit12};
		List<UnitItem> zergList = new ArrayList<>(Arrays.asList(zergLists));
		UnitItem[] protossLists = { unit13, unit14, unit15, unit16, unit17, unit18};
		List<UnitItem> protossList = new ArrayList<>(Arrays.asList(protossLists));
		
		Unit terranUnit = new Unit("유닛 메뉴", terranList);
		this.terranUnit = terranUnit;
		Unit zergUnit = new Unit("유닛 메뉴", zergList);
		this.zergUnit = zergUnit;
		Unit protossUnit = new Unit("유닛 메뉴", protossList);
		this.protossUnit = protossUnit;


		User yoo = new User("guguttemi", 10000);
		User kim = new User("kimkongmi", 12000);

		User[] userList = { yoo, kim };
		users = new ArrayList<>(Arrays.asList(userList));
		this.users.add(yoo);
		this.users.add(kim);

	}

	public static GameManager getInstance() {
		return gameManager;
	}

	


}
