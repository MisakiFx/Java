package Extend;
/**
 * �̳�
 * */
public class Hero {
	private String nickName;
	private int level;
	private int maxLife;
	private  int currLife;
	/**
	 * �Ƚϵ�ǰӢ�ۺʹ����Ӣ�۵Ĵ�С
	 */
	public int CompareTo(Hero hero) {
		//ֻ�Ƚϼ���
		if(this.level > hero.level) {
			return 1;
		}
		else if(this.level == hero.level) {
			return 0;
		}
		else {
			return -1;
		}
	}
	public void Move() {
		System.out.println("Hero���move����");
	}
	public Hero() {
		System.out.println("����Ĭ�Ϲ���");
		
	}
	public Hero(String nickName, int level, int maxLife, int currLife) {
		super();
		this.nickName = nickName;
		this.level = level;
		this.maxLife = maxLife;
		this.currLife = currLife;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getMaxLife() {
		return maxLife;
	}
	public void setMaxLife(int maxLife) {
		this.maxLife = maxLife;
	}
	public int getCurrLife() {
		return currLife;
	}
	public void setCurrLife(int currLife) {
		this.currLife = currLife;
	}
	
	
}
