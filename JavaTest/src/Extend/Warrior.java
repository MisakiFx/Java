package Extend;
/**
 * սʿ��-�̳���Hero ��
 * */
public class Warrior extends Hero {
	//�̳к�ӵ�и��๫�е����Ժͷ���
	//�����в�����ֱ�ӷ��ʸ����˽�����Ժͷ���
	//���๹�첻���Լ̳�
	/**սʿ�������ԣ��������� */
	private int physicalAttack;
	@Override
	public String toString() {
		return getNickName() + "\t" + getLevel() + "\t" + getPhysicalAttak();
	}
	/**
	 * ��дObject���equals�������Ա�Ƚ����������Ƿ����
	 * */
	@Override
	public boolean equals(Object obj) {
		//��������obj��Warriord��ʵ��
		if(!(obj instanceof Warrior)) {
			return false;
		}
		//ǿ��ת��
		Warrior newWarrior = (Warrior)obj;
		if(getNickName().equals(newWarrior.getNickName()) && getPhysicalAttak() == newWarrior.getPhysicalAttak()) {
			return true;
		}
		return false;
	}
	//������д����д�˸����Hero����,�����෽�����и���
	@Override//ע�⣬��д����������д���ӹ淶
	public void Move() {
		System.out.println("սʿ���ƶ���ȫ����");
	}
//	public void Move() {
//		System.out.println(getNickName() + "�ƶ�����");
//	}
	public Warrior() {
		//super���๹�췽��
		super();//���๹����Ĭ�ϵ��ø��๹��
		//�����ȵ��ø��๹���ٵ����Լ��Ĺ���
		//Java��ֻ����̳�һ������
		System.out.println("����Ĭ�Ϲ���");
	}
	public Warrior(String nickName, int physicalAttack) {
		setNickName(nickName);
		setPhysicalAttack(physicalAttack);
	}
	public int getPhysicalAttak() {
		return physicalAttack;
	}

	public void setPhysicalAttack(int physicalAttack) {
		this.physicalAttack = physicalAttack;
	}
}
