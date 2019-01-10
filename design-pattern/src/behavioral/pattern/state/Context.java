package behavioral.pattern.state;

//环境类，包含内部状态
public class Context {
	private State state;
	
	public Context() {
		state = null;
	}
	
	public String doSth() {
		return state.toString();
	}
	
	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}	
}
