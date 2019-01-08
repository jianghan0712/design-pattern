package behavioral.pattern.interpreter;

//ว๓ำเ
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
