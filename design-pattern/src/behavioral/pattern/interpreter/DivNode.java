package behavioral.pattern.interpreter;

//����
public class DivNode extends SymbolNode{
	public DivNode(Node left, Node right) {
		super(left, right);
	}

	@Override
	public int interpret() {
		// TODO Auto-generated method stub
		return left.interpret() * right.interpret();
	}
}
