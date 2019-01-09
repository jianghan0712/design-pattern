package behavioral.pattern.observer;

public class HexObserver extends Observer{
	public HexObserver(Subject subject) {
		// TODO Auto-generated constructor stub
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println( "Hex String: " + Integer.toHexString(subject.getState()));
	}

}
