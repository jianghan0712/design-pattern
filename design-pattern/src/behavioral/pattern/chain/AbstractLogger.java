package behavioral.pattern.chain;

//Handler: 抽象处理者。定义了一个处理请求的方法。所有的处理者都必须实现该抽象类。
public abstract class AbstractLogger {
	public static int INFO = 1;
	public static int DEBUG = 2;
	public static int ERROR = 3;
	
	protected int level;
	
	protected AbstractLogger nextLogger;//指向责任链中，下一等级的logger
	
	public void logMessage(int level, String message) {
		if (this.level == level) {//当前level比指定的level低时，打印信息
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
