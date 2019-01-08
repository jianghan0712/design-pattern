package behavioral.pattern.interpreter;

// 终结符表达式。实现与文法中的终结符相关的解释操作。实现抽象表达式中所要求的方法。文法中每一个终结符都有一个具体的终结表达式与之相对应。
public abstract class SymbolNode implements Node{
	protected Node left;
	protected Node right;
	
    public SymbolNode(Node left,Node right)
    {
        this.left=left;
        this.right=right;
    }

}
