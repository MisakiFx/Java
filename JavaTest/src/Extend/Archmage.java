package Extend;
/**
 * ��ʦ��*/
public class Archmage extends Hero{
	private int magicAttack;
	public Archmage() {
		setNickName("Ĭ�Ϸ�ʦ");
		setLevel(1);
		setMaxLife(100);
		setCurrLife(100);
		setMagicAttack(99);
	}
	/**
	 * ��дtoSting*/
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
		this();//���ñ���Ĺ��췽��
		setNickName(nickName);
	}
	public void Biubiubiu() {
		System.out.println("��ʦ" + getNickName() + "���ڴ����");
	}
	public int getMagicAttack() {
		return magicAttack;
	}
	public void setMagicAttack(int magicAttack) {
		this.magicAttack = magicAttack;
	}
}
