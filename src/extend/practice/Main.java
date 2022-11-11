package extend.practice;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Human> human_list = new ArrayList<>();
			Human brave = new Brave();
			human_list.add(brave);
			
			Human fighter = new Fighter();
			human_list.add(fighter);
			
			Human wizard = new Wizard();
			human_list.add(wizard);			
	
		List<Monster> monster_list = new ArrayList<>();
			Monster slime = new Slime();
			monster_list.add(slime);
			
			Monster oak = new Oak();
			monster_list.add(oak);
			
			Monster dragon = new Dragon();
			monster_list.add(dragon);		
			
		while (true) {    // 処理が継続するように無限ループを使う（この中で戦いがおわったら break で抜ける）
		    System.out.println("人間のターン！");

		    int rand = Rand.get(human_list.size());
		    Human human = human_list.get(rand);    // 取得したランダムな値でリストから要素を取得

		    // モンスターも同様にランダムに取得する
		    int rand1 = Rand.get(monster_list.size());
			Monster monster = monster_list.get(rand1);
			
		    // ここまでで、攻撃者（人間）とターゲット（モンスター）がランダムに抽出できた

		    // 実際に、攻撃者がターゲットに攻撃
		    human.attack(monster);

		    // 当該モンスターのHPが0になったら
		    if (monster.hp <= 0) {
		        // リストから削除
		    	System.out.println(monster.name + "は倒れた。");
		    	monster_list.remove(monster);
		    }
		    // リストが無くなったらbreak		    	
		    if (monster_list.isEmpty()) {
		    	System.out.println("勇者は勝利した！");
		    	break;
		    }
		    
		    System.out.println("モンスターのターン！");
		    // 攻守交替
		    int rand2 = Rand.get(monster_list.size());
			Monster monster1 = monster_list.get(rand2);
			
			int rand3 = Rand.get(human_list.size());
		    Human human1 = human_list.get(rand3);
		    // 実際に、攻撃者がターゲットに攻撃
		    monster1.attack(human1);

		    // 当該人間のHPが0になったら
		    if (human1.hp <= 0) {
		        //リストから削除
		    	System.out.println(human1.name + "は倒れた。");
		    	human_list.remove(human1);		    	
		    }
		    // リストが無くなったらbreak		    	
		    if (human_list.isEmpty()) {
		    	System.out.println("モンスターは勝利した！");
			    break;		 	
		    }
		}
	}
	
}
