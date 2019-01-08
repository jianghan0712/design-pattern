package structural.pattern.adapter.objectAdapter;

import structural.pattern.adapter.classAdapter.Ps2;
import structural.pattern.adapter.classAdapter.Usber;

/*
对象适配器
原理：通过组合来实现适配器功能。

与类适配器作用相同，实现稍有不同，是通过adapter里创建的私有对象usb来实现适配

源（Adaptee）：需要被适配的对象或类型，相当于插头。
适配器（Adapter）：连接目标和源的中间对象，相当于插头转换器。
目标（Target）：期待得到的目标，相当于插座。

与类适配器不同点：
1.类适配器使用的是继承的方式，直接继承了Adaptee，所以无法对Adaptee的子类进行适配。
2.对象适配器使用的是组合的方式，所以Adaptee及其子孙类都可以被适配。另外，对象适配器对于增加一些新行为非常方便，而且新增加的行为同时适用于所有的源。
3.基于组合/聚合优于继承的原则，使用对象适配器是更好的选择。但具体问题应该具体分析，某些情况可能使用类适配器会适合，最适合的才是最好的。


 */
public class Main {
	public static void main(String[] args) {
		Ps2 test = new Adapter(new Usber());
		test.isPs2();
	}
}
