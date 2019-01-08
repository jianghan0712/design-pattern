package behavioral.pattern.command;

public class Television {
	public void open() {
		System.out.println("Open the TV");
	}
	
	public void close() {
		System.out.println("Close the TV");
	}
	
	public void changeChannel(int i) {
		System.out.println("Change Channel of TV, now Channel is : " + i);
	}
}
