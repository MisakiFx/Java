package Extend;
/**
 * 战士类-继承了Hero 类
 * */
public class Warrior extends Hero {
	//继承后拥有父类公有的属性和方法
	//子类中不可以直接访问父类的私有属性和方法
	//父类构造不可以继承
	/**战士特有属性：物理攻击力 */
	private int physicalAttack;
	@Override
	public String toString() {
		return getNickName() + "\t" + getLevel() + "\t" + getPhysicalAttak();
	}
	/**
	 * 重写Object类的equals方法，以便比较两个对象是否相等
	 * */
	@Override
	public boolean equals(Object obj) {
		//如果传入的obj是Warriord的实例
		if(!(obj instanceof Warrior)) {
			return false;
		}
		//强制转换
		Warrior newWarrior = (Warrior)obj;
		if(getNickName().equals(newWarrior.getNickName()) && getPhysicalAttak() == newWarrior.getPhysicalAttak()) {
			return true;
		}
		return false;
	}
	//方法重写，重写了父类的Hero方法,用子类方法进行覆盖
	@Override//注解，重写，这样的重写更加规范
	public void Move() {
		System.out.println("战士的移动，全靠走");
	}
//	public void Move() {
//		System.out.println(getNickName() + "移动靠腿");
//	}
	public Warrior() {
		//super父类构造方法
		super();//子类构造中默认调用父类构造
		//子类先调用父类构造再调用自己的构造
		//Java中只允许继承一个父类
		System.out.println("子类默认构造");
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
