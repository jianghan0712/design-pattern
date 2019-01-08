package behavioral.pattern.interpreter;

//抽象表达式。声明一个抽象的解释操作，该接口为抽象语法树中所有的节点共享。
public interface Node {
	public int interpret();
}
