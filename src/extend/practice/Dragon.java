package extend.practice;

public class Dragon extends Monster {
	public String skill;
	
	public Dragon() {
		this.name = "ドラゴン";
		this.hp = 300;
		this.offensive = 30;
		this.skill = "炎";
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
