package creational.pattern.builder;

/*
 * 表示食物条目接口
 * name和price是所有食物共有的，pack根据食物不同有不同的包装
 */

public interface Item {
	public String name();//食物名称
	public Packing packing();//点餐
	public float price();//
}
