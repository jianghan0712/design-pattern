package behavioral.pattern.memento;

//模拟实际工作类
public class Originator {
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public Memento saveStateToMemento() {
		return new Memento(this.state);
	}
	
	public void getStateFromMemento(Memento Memento){
	      state = Memento.getState();
	}
}
