package behavioral.pattern.command;

/*
 * 命令接口，为所有命令声明同一个接口，实现Television类的打开，关闭，调台操作
 */
public interface Command {
	public void execute(int i);//i表示切换到第i台
}
