package behavioral.pattern.interpreter;

//非终结符表达式。为文法中的非终结符相关的解释操作。
public class ValueNode implements Node{
	private int value;
	
	public ValueNode(int value) {
		this.value = value;
	}

	@Override
	public int interpret() {
		// TODO Auto-generated method stub
		return this.value;
	}
	
	
}
