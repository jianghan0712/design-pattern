package behavioral.pattern.command;

public class Controller {
	private Command openTV;
	private Command closeTV;
	private Command changeChannelTV;
	
	public int nowChannel = 0;       //��ǰƵ��
	public int priorChannel;     //ǰһ��Ƶ��������ִ�з��ز���
	
	public Controller(Command openTV, Command closeTV, Command changeChannelTV) {
		this.openTV = openTV;
		this.closeTV = closeTV;
		this.changeChannelTV = changeChannelTV;
	}
	
	public void open() {
		openTV.execute(0);
	}
	
	public void close() {
		closeTV.execute(0);
	}
	
	public void change() {
		priorChannel = nowChannel;
		nowChannel++;
		changeChannelTV.execute(nowChannel);
	}
	
	//����ָ��̨
	public void change (int i) {
		priorChannel = nowChannel;
		nowChannel = i;
		changeChannelTV.execute(i);
	}
	
	public void undoChange() {
		changeChannelTV.execute(priorChannel);
		int tempChannel;
		tempChannel = priorChannel;
		priorChannel = nowChannel;
		nowChannel = tempChannel;
	}
}
