package creational.pattern.builder;

/*
 * 实现 Item 接口的抽象类，该类提供了默认的功能
 * 冷饮，分为coke或pepsi，都用瓶子装
 */
public abstract class ColdDrink implements Item {
	 
    @Override
    public Packing packing() {//用瓶子装
       return new Bottle();
    }
 
    @Override
    public abstract float price();
}
