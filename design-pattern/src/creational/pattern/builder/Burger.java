package creational.pattern.builder;

/*
 * 实现 Item 接口的抽象类，该类提供了默认的功能
 * 汉堡，分为素食汉堡Veg Burger和鸡肉汉堡Chicken Burger，都装在包装盒中
 */
public abstract class Burger implements Item{
	@Override
	public Packing packing() {//用盒子装
	   return new Wrapper();
	}
	 
	@Override
	public abstract float price();
}
