package behavioral.pattern.chain;

//ConcreteHandler: ���崦���ߡ������������������ͬʱҲ���Է������ĺ���ߡ�������ܹ���������������������󴫵ݵ����ĺ���ߡ� 
public class DebugLogger extends AbstractLogger{

	public DebugLogger(int level) {
		this.level = level;
	}
	
	@Override
	protected void write(String message) {
		// TODO Auto-generated method stub
		System.out.println("[Debug] " + message);
	}
	
}
