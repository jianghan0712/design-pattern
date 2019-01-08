package behavioral.pattern.command;

public class CloseTVCommand implements Command{
	private Television tv;
	
	public CloseTVCommand() {
		tv = new Television();
	}

	@Override
	public void execute(int i) {
		// TODO Auto-generated method stub
		tv.close();
	}

}
