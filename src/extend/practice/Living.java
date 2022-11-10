package extend.practice;

public abstract class Living {
	protected String name;    // キャラの名前
	protected int hp;         // ヒットポイント
	protected int offensive;  // 攻撃力	

	abstract void attack(Living target);  // ターゲットを攻撃するメソッド	
}
