package extend.practice;

public class Oak extends Monster {
	public String skill;
	
		
		public Oak() {
			this.name = "オーク";
			this.hp = 100;
			this.offensive = 10;
			this.skill = "槍";
		}
		
		public String getName() {
			return this.name;
		}

		public String setName() {
			return this.name;
		}

		public int getHp() {
			return this.hp;
		}

		public int setHp() {
			return this.hp;
		}
		
		public int getOffensive() {
			return this.offensive;
		}
		
		public int setOffensive() {
			return this.offensive;
		}
		
		public String getSkill() {
			return this.skill;
		}
		
		public String setSkill() {
			return this.skill;
		}
		public void attack(Living target) {	
			int damage = offensive * Rand.get(10);
			System.out.println(this.name + "が" + this.skill + "で攻撃！" + target.name + "に" + damage + "のダメージ！");
			this.hp = this.hp - damage;
		}
}
