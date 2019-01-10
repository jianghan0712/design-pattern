package behavioral.pattern.template;

public abstract class Game {
	abstract void init();
	abstract void start();
	abstract void end();
	
	//模板方法，final，使得不允许重写
	public final void play() {
		init();
		start();
		end();
	}
}
