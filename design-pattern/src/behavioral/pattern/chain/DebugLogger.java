package behavioral.pattern.chain;

//ConcreteHandler: 具体处理者。处理它所负责的请求，同时也可以访问它的后继者。如果它能够处理该请求则处理，否则将请求传递到它的后继者。 
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
