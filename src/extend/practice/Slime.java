package extend.practice;

public class Slime  extends Monster {
	public String skill;
	
	public Slime() {
		this.name = "スライム";
		this.hp = 20;
		this.offensive = 5;
		this.skill = "体当たり";
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
