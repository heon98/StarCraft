package starCraft.game.gameComponent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tribe {
	private List<Terran> terranUnits;
	private List<Protoss> protossUnits;
	private List<Zerg> zergUnits;
	private Unit unit;
	
	private static Tribe tribe = new Tribe(); // 고유 인스턴스
	
	private Tribe() {
		// 초기 유닛 세팅
		// 테란, 프로토스, 저그 기본 유닛 생성
		
		// 테란 유닛 세팅
		Terran terran1 = new Terran("마린", 50, 10, 1);
		Terran terran2 = new Terran("탱크", 300, 50, 2);
		Terran terran3 = new Terran("골리앗", 250, 40, 3);
		Terran terran4 = new Terran("벌쳐", 100, 20, 4);
		Terran terran5 = new Terran("레이스", 200, 30, 5);
		Terran terran6 = new Terran("배틀크루져", 350, 70, 6);
		
		// terranUnits에 초기 유닛 저장
		Terran[] terranComponents = { terran1, terran2, terran3, terran4, terran5, terran6 };
		List<Terran> terranUnits = new ArrayList<>(Arrays.asList(terranComponents));
		
		// 저그 유닛 셑팅
		Zerg zerg1 = new Zerg("저글링", 50, 10, 1);
		Zerg zerg2 = new Zerg("히드라", 100, 20, 2);
		Zerg zerg3 = new Zerg("럴커", 250, 50, 3);
		Zerg zerg4 = new Zerg("뮤탈", 150, 30, 4);
		Zerg zerg5 = new Zerg("스커지", 100, 25, 5);
		Zerg zerg6 = new Zerg("울트라리스크", 300, 60, 6);
		
		Zerg[] zergComponents = { zerg1, zerg2, zerg3, zerg4, zerg5, zerg6 };
		List<Zerg> zergUnits = new ArrayList<>(Arrays.asList(zergComponents));
		
		
		Protoss protoss1 = new Protoss("질럿", 150, 15, 1);
		Protoss protoss2 = new Protoss("드라군", 200, 20, 2);
		Protoss protoss3 = new Protoss("리버", 300, 30, 3);
		Protoss protoss4 = new Protoss("스카우트", 300, 30, 4);
		Protoss protoss5 = new Protoss("셔틀", 200, 0, 5);
		Protoss protoss6 = new Protoss("캐리어", 400, 70, 6);
	
		Protoss[] protossComponents = { protoss1, protoss2, protoss3, protoss4, protoss5, protoss6 };
		List<Protoss> protossUnits = new ArrayList<>(Arrays.asList(protossComponents));
	
		
		Tribe tribe = new Tribe();
		this.tribe = tribe;
		
	}
}
