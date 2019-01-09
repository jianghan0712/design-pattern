package behavioral.pattern.observer;

public class BinaryObserver extends Observer{

	public BinaryObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);//���Լ�ע����ȥ
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		//����仯��Ķ�������
		System.out.println( "Binary String: " + Integer.toBinaryString( subject.getState() ));
	}

}
