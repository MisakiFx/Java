package Extend;
/**
 * 继承
 * */
public class Hero {
	private String nickName;
	private int level;
	private int maxLife;
	private  int currLife;
	/**
	 * 比较当前英雄和传入的英雄的大小
	 */
	public int CompareTo(Hero hero) {
		//只比较级别
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
		System.out.println("Hero类的move方法");
	}
	public Hero() {
		System.out.println("父类默认构造");
		
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
