package behavioral.pattern.observer;

public class BinaryObserver extends Observer{

	public BinaryObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);//把自己注册上去
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		//输出变化后的二进制数
		System.out.println( "Binary String: " + Integer.toBinaryString( subject.getState() ));
	}

}
