package behavioral.pattern.interpreter;

//³Ë·¨
public class MulNode extends SymbolNode{
	public MulNode(Node left, Node right) {
		super(left, right);
	}

	@Override
	public int interpret() {
		// TODO Auto-generated method stub
		return left.interpret() * right.interpret();
	}
}
