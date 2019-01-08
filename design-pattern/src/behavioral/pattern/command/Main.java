package behavioral.pattern.command;

/*
命令模式（Command Pattern）是一种数据驱动的设计模式，它属于行为型模式。
请求以命令的形式包裹在对象中，并传给调用对象。调用对象寻找可以处理该命令的合适的对象，并把该命令传给相应的对象，该对象执行命令。

 命令模式的本质就在于将命令进行封装，将发出命令的责任和执行命令的责任分开，是的发送者只需要知道如何发送命令即可，不需要命令是如何实现的，甚至命令执行是否成功都不
 需要理会。同时命令模式使得请求也变成了一个对象，它像其他对象一样可以被存储和传递。
 
意图：将一个请求封装成一个对象，从而使您可以用不同的请求对客户进行参数化。
主要解决：在软件系统中，行为请求者与行为实现者通常是一种紧耦合的关系，但某些场合，比如需要对行为进行记录、撤销或重做、事务等处理时，这种无法抵御变化的紧耦合的设计就不太合适。
何时使用：在某些场合，比如要对行为进行"记录、撤销/重做、事务"等处理，这种无法抵御变化的紧耦合是不合适的。在这种情况下，如何将"行为请求者"与"行为实现者"解耦？将一组行为抽象为对象，可以实现二者之间的松耦合。
如何解决：通过调用者调用接受者执行命令，顺序：调用者→接受者→命令。
关键代码：定义三个角色：1、received 真正的命令执行对象 2、Command 3、invoker 使用命令对象的入口
应用实例：struts 1 中的 action 核心控制器 ActionServlet 只有一个，相当于 Invoker，而模型层的类会随着不同的应用有不同的模型类，相当于具体的 Command。
优点： 1、降低了系统耦合度。 2、新的命令可以很容易添加到系统中去。
缺点：使用命令模式可能会导致某些系统有过多的具体命令类。
使用场景：1.系统需要将请求调用者和请求接收者解耦，使得调用者和接收者不直接交互。
       2.系统需要在不同的时间指定请求、将请求排队和执行请求。
       3.系统需要支持命令的撤销(Undo)操作和恢复(Redo)操作。
       4.系统需要将一组操作组合在一起，即支持宏命令。认为是命令的地方都可以使用命令模式，比如： 1、GUI 中每一个按钮都是一条命令。 2、模拟 CMD。
注意事项：系统需要支持命令的撤销(Undo)操作和恢复(Redo)操作，也可以考虑使用命令模式，见命令模式的扩展。

Command: 抽象命令类	 Command
ConcreteCommand: 具体命令类   open,close,change
Invoker: 调用者 control
Receiver: 接收者 Television

总结：1. 命令模式的本质就是将命令对象进行封装打包，将发出命令的责任和执行命令的责任进行割开。
    2. 命令模式中发送者只需要知道如何发送请求命令，无须关心命令执行具体过程。
    3. 在发送者和接收者两者间是通过命令对象进行沟通的。请求命令本身就当做一个对象在两者间进行传递，它封装了接收者和一组动作。
    4. 命令模式支持撤销。
    5. 命令模式队列请求和日志请求。

 */
public class Main {
	public static void main(String[] args) {
		Command open,close,change;
		
		open = new OpenTVCommand();
		close = new CloseTVCommand();
		change = new ChangeTVCommand();
		
		Controller control = new Controller(open, close, change);
		
		control.open();
		control.change();
		control.change(5);
		control.change();
		control.undoChange();
		control.change(2);
		control.undoChange();
		control.close();
		
	}
}
