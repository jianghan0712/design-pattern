package behavioral.pattern.memento;

//备忘录类，用于记录状态
public class Memento {
	private String state;
	
	public Memento(String state) {
		this.state = state;
	}
	
	public String getState() {
		return this.state;
	}
}
