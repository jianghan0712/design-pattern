package structural.pattern.composite;

//�ײ�����ļ���Component
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
