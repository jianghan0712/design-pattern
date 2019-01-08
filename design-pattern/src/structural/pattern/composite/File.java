package structural.pattern.composite;

//底层抽象文件类Component
public abstract class File {
	public String name;
	
	public File(String fileName) {
		this.name = fileName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void display();
}
