package Extend;
/**
 * 法师类*/
public class Archmage extends Hero{
	private int magicAttack;
	public Archmage() {
		setNickName("默认法师");
		setLevel(1);
		setMaxLife(100);
		setCurrLife(100);
		setMagicAttack(99);
	}
	/**
	 * 重写toSting*/
	@Override
		public String toString() {
			StringBuffer str = new StringBuffer();
			str.append(getLevel());
			str.append("\t");
			str.append(getNickName());
			str.append("\t");
			str.append(getMaxLife());
			str.append("\t");
			str.append(getCurrLife());
			return str.toString();
		}
	public Archmage(String nickName) {
		this();//调用本类的构造方法
		setNickName(nickName);
	}
	public void Biubiubiu() {
		System.out.println("大法师" + getNickName() + "正在搓火球");
	}
	public int getMagicAttack() {
		return magicAttack;
	}
	public void setMagicAttack(int magicAttack) {
		this.magicAttack = magicAttack;
	}
}
