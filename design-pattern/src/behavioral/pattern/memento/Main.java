package behavioral.pattern.memento;

/*
备忘录模式（Memento Pattern）保存一个对象的某个状态，以便在适当的时候恢复对象。备忘录模式属于行为型模式。

意图：在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。
主要解决：所谓备忘录模式就是在不破坏封装的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态，这样可以在以后将对象恢复到原先保存的状态。
何时使用：很多时候我们总是需要记录一个对象的内部状态，这样做的目的就是为了允许用户取消不确定或者错误的操作，能够恢复到他原先的状态，使得他有"后悔药"可吃。
如何解决：通过一个备忘录类专门存储对象状态。
关键代码：客户不与备忘录类耦合，与备忘录管理类耦合。
应用实例： 1、后悔药。 2、打游戏时的存档。 3、Windows 里的 ctri + z。 4、IE 中的后退。 4、数据库的事务管理。
优点： 1、给用户提供了一种可以恢复状态的机制，可以使用户能够比较方便地回到某个历史的状态。 2、实现了信息的封装，使得用户不需要关心状态的保存细节。
缺点：消耗资源。如果类的成员变量过多，势必会占用比较大的资源，而且每一次保存都会消耗一定的内存。
使用场景： 1、需要保存/恢复数据的相关状态场景。
       2、提供一个可回滚的操作。
       3、 如果用一个接口来让其他对象得到这些状态，将会暴露对象的实现细节并破坏对象的封装性，一个对象不希望外界直接访问其内部状态，通过负责人可以间接访问其内部状态。
注意事项： 1、为了符合迪米特原则，还要增加一个管理备忘录的类。 2、为了节约内存，可使用原型模式+备忘录模式。

Originator: 原发器。负责创建一个备忘录，用以记录当前对象的内部状态，通过也可以使用它来利用备忘录恢复内部状态。同时原发器还可以根据需要决定Memento存储Originator的那些内部状态。
Memento: 备忘录。用于存储Originator的内部状态，并且可以防止Originator以外的对象访问Memento。
                          在备忘录Memento中有两个接口，其中Caretaker只能看到备忘录中的窄接口，它只能将备忘录传递给其他对象。Originator可以看到宽接口，允许它访问返回到先前状态的所有数据。
Caretaker: 负责人。负责保存好备忘录，不能对备忘录的内容进行操作和访问，只能够将备忘录传递给其他对象。

总结：1、 备忘录模式可以实现在不破坏封装的前提下，捕获一个类的内部状态，并且在该对象之外保存该对象的状态，保证该对象能够恢复到历史的某个状态。
    2、 备忘录模式实现了内部状态的封装，除了创建它的原发器之外其他对象都不能够访问它。
    3、 备忘录模式会占用较多的内存，消耗资源。
 */
public class Main {
	public static void main(String[] args) {
		Originator originator = new Originator();
	    CareTaker careTaker = new CareTaker();
	    
	    //模拟工作类工作中
	    originator.setState("state #1");
	    originator.setState("state #2");
	    
	    //保存状态2
	    careTaker.add(originator.saveStateToMemento());
	    
	    originator.setState("state #3");
	    originator.setState("state #4");
	    
	    //保存状态4
	    careTaker.add(originator.saveStateToMemento());
	    
	    //状态5
	    originator.setState("state #5");	    
	    System.out.println("Current State: " + originator.getState());   
	    
	    //返回第一个保存节点2
	    originator.getStateFromMemento(careTaker.get(0));
	    System.out.println("First saved State: " + originator.getState());
	    
	    //返回第二个保存节点4
	    originator.getStateFromMemento(careTaker.get(1));
	    System.out.println("Second saved State: " + originator.getState());
	    
	}
}
