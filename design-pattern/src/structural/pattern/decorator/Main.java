package structural.pattern.decorator;

/*
装饰者模式（Decorator Pattern）
允许向一个现有的对象添加新的功能，同时又不改变其结构。这种类型的设计模式属于结构型模式，它是作为现有的类的一个包装。
这种模式创建了一个装饰类，用来包装原有的类，并在保持类方法签名完整性的前提下，提供了额外的功能。

意图：动态地给一个对象添加一些额外的职责。就增加功能来说，装饰器模式相比生成子类更为灵活。
主要解决：一般的，我们为了扩展一个类经常使用继承方式实现，由于继承为类引入静态特征，并且随着扩展功能的增多，子类会很膨胀。
何时使用：在不想增加很多子类的情况下扩展类。
如何解决：将具体功能职责划分，同时继承装饰者模式。
关键代码： 1、Component 类充当抽象角色，不应该具体实现。 2、修饰类引用和继承 Component 类，具体扩展类重写父类方法。
应用实例： 1、孙悟空有 72 变，当他变成"庙宇"后，他的根本还是一只猴子，但是他又有了庙宇的功能。 
       2、不论一幅画有没有画框都可以挂在墙上，但是通常都是有画框的，并且实际上是画框被挂在墙上。在挂在墙上之前，画可以被蒙上玻璃，装到框子里；这时画、玻璃和画框形成了一个物体。
优点：1、装饰者模式可以提供比继承更多的灵活性
    2、可以通过一种动态的方式来扩展一个对象的功能，在运行时选择不同的装饰器，从而实现不同的行为。
    3、通过使用不同的具体装饰类以及这些装饰类的排列组合，可以创造出很多不同行为的组合。可以使用多个具体装饰类来装饰同一对象，得到功能更为强大的对象。
    4、具体构件类与具体装饰类可以独立变化，用户可以根据需要增加新的具体构件类和具体装饰类，在使用时再对其进行组合，原有代码无须改变，符合“开闭原则”。
    5、装饰类和被装饰类可以独立发展，不会相互耦合，装饰模式是继承的一个替代模式，装饰模式可以动态扩展一个实现类的功能。

缺点：1、会产生很多的小对象，增加了系统的复杂性
    2、这种比继承更加灵活机动的特性，也同时意味着装饰模式比继承更加易于出错，排错也很困难，对于多次装饰的对象，调试时寻找错误可能需要逐级排查，较为烦琐。
使用场景： 1、在不影响其他对象的情况下，以动态、透明的方式给单个对象添加职责。
       2、需要动态地给一个对象增加功能，这些功能也可以动态地被撤销。  当不能采用继承的方式对系统进行扩充或者采用继承不利于系统扩展和维护时。
注意事项：可代替继承。

Component: 抽象构件。是定义一个对象接口，可以给这些对象动态地添加职责。 /ShapeDecorator/
ConcreteComponent:具体构件。是定义了一个具体的对象，也可以给这个对象添加一些职责。
Decorator: 抽象装饰类。是装饰抽象类，继承了Component,从外类来扩展Component类的功能，但对于Component来说，是无需知道Decorator存在的。
ConcreteDecorator:具体装饰类，起到给Component添加职责的功能。 /RedShapeDecorator/

总结：1、 组合和委托可以在运行时动态的添加新的行为，而继承是静态的，在系统编译时就已经决定了对象的行为。
    2、装饰者模式意味着一群装饰者类，这些类用来包装具体组件
	3、装饰者可以在被装饰者的行为前面或者后面加上自己的行为，甚至可以将被装饰者的行为整个取代掉，从而达到特定的目的。
	4、可以用多个装饰者包装一个组件。
	5、装饰者一般对于组件的客户是透明的，除非客户程序依赖于组件的具体类型。
	6、装饰者会导致设计中出现许多的小对象，如果过度的使用，会让系统变得更加复杂。
	7、装饰者和被装饰者对象有相同的超类型。

 */
public class Main {
	public static void main(String[] args) {
		//原始的类，draw只能打印出原始shape中的内容
		Shape circle = new Circle();
		System.out.println("Circle with normal border");
	    circle.draw();
	    
	    //经过装饰者修饰后的类，同样的draw可以调用不同 的方法
	    Shape redCircle = new RedShapeDecorator(new Circle());
	    System.out.println("\nCircle of red border");
	    redCircle.draw();
	    
	    Shape redRectangle = new RedShapeDecorator(new Rectangle());
	    System.out.println("\nRectangle of red border");
	    redRectangle.draw();
	}
}
