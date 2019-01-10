package behavioral.pattern.template;

public abstract class Game {
	abstract void init();
	abstract void start();
	abstract void end();
	
	//ģ�巽����final��ʹ�ò�������д
	public final void play() {
		init();
		start();
		end();
	}
}
