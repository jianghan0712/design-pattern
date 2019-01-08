package behavioral.pattern.command;

public class Controller {
	private Command openTV;
	private Command closeTV;
	private Command changeChannelTV;
	
	public int nowChannel = 0;       //当前频道
	public int priorChannel;     //前一个频道，用于执行返回操作
	
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
	
	//拨到指定台
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
