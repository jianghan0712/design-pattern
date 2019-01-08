package behavioral.pattern.interpreter;

//���ս�����ʽ��Ϊ�ķ��еķ��ս����صĽ��Ͳ�����
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
