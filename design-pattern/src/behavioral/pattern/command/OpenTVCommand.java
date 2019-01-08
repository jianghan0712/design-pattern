package behavioral.pattern.command;

public class OpenTVCommand implements Command{
	private Television tv;

	public OpenTVCommand() {
		tv = new Television();
	}
	
	@Override
	public void execute(int i) {
		// TODO Auto-generated method stub
		tv.open();
	}

}
