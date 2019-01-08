package behavioral.pattern.interpreter;

//����
public class ModNode extends SymbolNode{
	public ModNode(Node left, Node right) {
		super(left, right);
	}

	@Override
	public int interpret() {
		// TODO Auto-generated method stub
		return left.interpret() % right.interpret();
	}
}
