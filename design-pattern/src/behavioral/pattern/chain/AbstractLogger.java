package behavioral.pattern.chain;

//Handler: �������ߡ�������һ����������ķ��������еĴ����߶�����ʵ�ָó����ࡣ
public abstract class AbstractLogger {
	public static int INFO = 1;
	public static int DEBUG = 2;
	public static int ERROR = 3;
	
	protected int level;
	
	protected AbstractLogger nextLogger;//ָ���������У���һ�ȼ���logger
	
	public void logMessage(int level, String message) {
		if (this.level == level) {//��ǰlevel��ָ����level��ʱ����ӡ��Ϣ
			write(message);
		}
		
		if (nextLogger!=null) {
			nextLogger.logMessage(level, message);
		}
	}
	
	public void setNextLogger(AbstractLogger nextLogger){
	      this.nextLogger = nextLogger;
	}
	
	abstract protected void write(String message);
}
