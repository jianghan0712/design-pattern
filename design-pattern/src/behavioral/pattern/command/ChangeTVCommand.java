package behavioral.pattern.command;

public class ChangeTVCommand implements Command{
	private Television tv;

	public ChangeTVCommand() {
		tv = new Television();
	}
	
	@Override
	public void execute(int i) {
		// TODO Auto-generated method stub
		tv.changeChannel(i);
	}

}
