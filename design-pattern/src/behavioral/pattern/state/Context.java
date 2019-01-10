package behavioral.pattern.state;

//�����࣬�����ڲ�״̬
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
