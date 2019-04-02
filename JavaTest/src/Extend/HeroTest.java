package Extend;

public class HeroTest {
	public static void main(String[] args) {
		Warrior Misaki = new  Warrior("Misaki", 124);
		System.out.println(Misaki.getNickName() + "攻击力为：" + Misaki.getPhysicalAttak());
//		Warrior Misaki = new Warrior();
		//子类对象可以实现父类
//		//战士is a英雄
//		Hero Misaki = new Warrior();
//		Warrior Misaki = new Hero();//错误的
		//执行子类的重写方法
//		Warrior Misaki = new Warrior();
//		Misaki.Move();
//		Hero Misaki =  new Warrior();//子类实现了父类
//		Misaki.Move();
		//对象Misaki的类型？Hero,左侧类型，右侧实现
//		Warrior Misaki = new Warrior("Misaki", 123);
//		Misaki.setLevel(99);
//		Warrior Misaki2 = new Warrior("Misaki", 123);
//		Misaki2.setLevel(80);
//		System.out.println(Misaki.CompareTo(Misaki2));
		//Java中所有类都是Object类的子类，自带equals方法
		//在这里已经重写过了equals方法
//		System.out.println(Misaki.equals(Misaki2));
//		//重写toString方法，使其可以成功打印内容
//		System.out.println(Misaki);
//		Archmage Misaki = new Archmage("Misaki");
//		Misaki.Biubiubiu();
//		System.out.println("级别：" + Misaki.getLevel());
//		System.out.println(Misaki);
	}
}
