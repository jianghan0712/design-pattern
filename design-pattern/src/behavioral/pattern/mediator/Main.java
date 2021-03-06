package behavioral.pattern.mediator;

/*
中介者模式（Mediator Pattern）是用来降低多个对象和类之间的通信复杂性。
这种模式提供了一个中介类，该类通常处理不同类之间的通信，并支持松耦合，使代码易于维护。中介者模式属于行为型模式。
通过定义我们可以看出中介者主要是通过中介对象来封装对象之间的关系，使之各个对象在不需要知道其他对象的具体信息情况下通过中介者对象来与之通信。同时通过引用中介者对象来
减少系统对象之间关系，提高了对象的可复用和系统的可扩展性。但是就是因为中介者对象封装了对象之间的关联关系，导致中介者对象变得比较庞大，所承担的责任也比较多。
它需要知道每个对象和他们之间的交互细节，如果它出问题，将会导致整个系统都会出问题。所以它比较容易应用也很容易误用。故当系统中出现了“多对多”交互复杂的关系群时，
千万别急着使用中介者模式，你首先需要做的就是反思你的系统在设计上是不是合理
在中介者模式中中介者对象处于核心地位，因为它定义了整个系统中所有具体同事类之间的关系。在整个系统中它主要承担两个方面的责任：
	1、 结构上起到中转作用。通过中介者对象对关系的封装，使得具体的同事类不再需要显示的引用其他对象，它只需要通过中介者就可以完成与其他同事类之间的通信。
	2、 行为上起到协作作用。中介者对同事类之间的关系进行封装，同事类在不需要知道其他对象的情况下通过中介者与其他对象完成通信。在这个过程中同事类是不需要指明中介者该如何做，中介者可以根据自身的逻辑来进行协调，对同事的请求进一步处理，将同事成员之间的关系行为进行分离和封装。
     
意图：用一个中介对象来封装一系列的对象交互，中介者使各对象不需要显式地相互引用，从而使其耦合松散，而且可以独立地改变它们之间的交互。
主要解决：对象与对象之间存在大量的关联关系，这样势必会导致系统的结构变得很复杂，同时若一个对象发生改变，我们也需要跟踪与之相关联的对象，同时做出相应的处理。
何时使用：多个类相互耦合，形成了网状结构。
如何解决：将上述网状结构分离为星型结构。
关键代码：对象 Colleague 之间的通信封装到一个类中单独处理。
应用实例： 1、中国加入 WTO 之前是各个国家相互贸易，结构复杂，现在是各个国家通过 WTO 来互相贸易。 
       2、机场调度系统。 
       3、MVC 框架，其中C（控制器）就是 M（模型）和 V（视图）的中介者。
优点： 1、降低了类的复杂度，将一对多转化成了一对一。 2、各个类之间的解耦。 3、符合迪米特原则。
缺点：中介者会庞大，变得复杂难以维护。
使用场景： 1、系统中对象之间存在比较复杂的引用关系，导致它们之间的依赖关系结构混乱而且难以复用该对象。 
       2、想通过一个中间类来封装多个类中的行为，而又不想生成太多的子类。
注意事项：不应当在职责混乱的时候使用。

总结：1、 在中介者模式中通过引用中介者对象，将系统中有关的对象所引用的其他对象数目减少到最少。它简化了系统的结构，将系统由负责的网状结构转变成简单的星形结构，中介者对象在这里起到中转和协调作用。
    2、 中介者类是中介者模式的核心，它对整个系统进行控制和协调，简化了对象之间的交互，还可以对对象间的交互进行进一步的控制。
    3、 通过使用中介者模式，具体的同事类可以独立变化，通过引用中介者可以简化同事类的设计和实现。
    4、 就是由于中介者对象需要知道所有的具体同事类，封装具体同事类之间相互关系，导致中介者对象变得非常复杂，系统维护起来较为困难。


以房产中介为例。HouseOwner将自己的房子注册到中介HouseMediator，Tenant向中介HouseMediator询问是否有合适的房子
HouseMediator找到以后，通知双方找到了房子。

 */
public class Main {
	public static void main(String[] args) {
		HouseMediator mediator = new HouseMediator();
		HouseOwner owner = new HouseOwner("owner");
		Tenant tenant = new Tenant("tenant");
		
		mediator.registeHouse(new House(3, 100.0, owner));
		mediator.registeHouse(new House(2, 100.0, owner));
		
		mediator.registeRequest(new House(5, 100.0, tenant));
		House house = mediator.delRequest();
		
		if(house!=null) {
			String msg1 = "House info: " + house.room + " rooms";
			String msg2 = "Tenant's name : " + tenant.name ;
			String msg3 = "HouseOwner name : " + owner.name;
			mediator.constact(msg1,msg2,msg3);
		}else {
			System.out.println("no comfortable house");
		}
		
	}
}
