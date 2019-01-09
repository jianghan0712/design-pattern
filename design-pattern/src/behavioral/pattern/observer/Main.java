package behavioral.pattern.observer;

/*
观察者模式（Observer Pattern）。比如，当一个对象被修改时，则会自动通知它的依赖对象。观察者模式属于行为型模式.

意图：定义对象间的一种一对多的依赖关系，当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并被自动更新。
主要解决：一个对象状态改变给其他对象通知的问题，而且要考虑到易用和低耦合，保证高度的协作。
何时使用：一个对象（目标对象）的状态发生改变，所有的依赖对象（观察者对象）都将得到通知，进行广播通知。
如何解决：使用面向对象技术，可以将这种依赖关系弱化。
关键代码：在抽象类里有一个 ArrayList 存放观察者们。
应用实例： 1、拍卖的时候，拍卖师观察最高标价，然后通知给其他竞价者竞价。 
       2、下订单，订单状态更新后，通知其他模块
优点：1、当两个对象之间送耦合，他们依然可以交互，但是不太清楚彼此的细节。观察者模式提供了一种对象设计，让主题和观察者之间送耦合。主题所知道只是一个具体的观察者列表，每一个具体观察者都符合一个抽象观察者的接口。主题并不认识任何一个具体的观察者，它只知道他们都有一个共同的接口。
    2、观察者模式支持“广播通信”。主题会向所有的观察者发出通知。
    3、观察者模式符合“开闭原则”的要求。
缺点： 1、如果一个被观察者对象有很多的直接和间接的观察者的话，将所有的观察者都通知到会花费很多时间。 
    2、如果在观察者和观察目标之间有循环依赖的话，观察目标会触发它们之间进行循环调用，可能导致系统崩溃。
    3、观察者模式没有相应的机制让观察者知道所观察的目标对象是怎么发生变化的，而仅仅只是知道观察目标发生了变化。
使用场景： 1、一个抽象模型有两个方面，其中一个方面依赖于另一个方面。将这些方面封装在独立的对象中使它们可以各自独立地改变和复用。
       2、一个对象的改变将导致其他一个或多个对象也发生改变，而不知道具体有多少对象将发生改变，可以降低对象之间的耦合度。
 	   3、一个对象必须通知其他对象，而并不知道这些对象是谁。
需要在系统中创建一个触发链，A对象的行为将影响B对象，B对象的行为将影响C对象……，可以使用观察者模式创建一种链式触发机制。
注意事项： 1、JAVA 中已经有了对观察者模式的支持类。 2、避免循环引用。 3、如果顺序执行，某一观察者错误会导致系统卡壳，一般采用异步方式。

总结：1、观察者模式定义了对象之间的一对多关系。多个观察者监听同一个被观察者，当该被观察者的状态发生改变时，会通知所有的观察者。
    2、观察者模式中包含四个角色。主题，它指被观察的对象。具体主题是主题子类，通常它包含有经常发生改变的数据，当它的状态发生改变时，向它的各个观察者发出通知；观察者，将对观察主题的改变做出反应；具体观察者中维护一个指向具体目标对象的引用，它存储具体观察者的有关状态，这些状态需要和具体目标的状态保持一致。
    3、主题用一个共同的接口来更新观察者。
    4、观察者与被观察者之间用松耦合方式结合。
    5、有多个观察者时，不可以依赖特定的通知次序。
    6、使用观察者模式，可以从被观察者处推或者拉数据。
 */
public class Main {
	public static void main(String[] args) {
		Subject subject = new Subject();//事件源
		
		new HexObserver(subject);//观察者1
	    new BinaryObserver(subject);//观察者2
	    
	    System.out.println("First state change: 15");   
	    subject.setState(15);//事件更新
	    System.out.println("------------------------");  
	    System.out.println("Second state change: 10");  
	    subject.setState(10);//事件更新
	}
}
