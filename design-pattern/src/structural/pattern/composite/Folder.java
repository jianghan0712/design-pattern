package structural.pattern.composite;

import java.util.ArrayList;
import java.util.List;

//文件夹，Composite枝节点
public class Folder extends File{
	private List<File> files;	//文件夹下的文件
	
	public Folder(String fileName) {
		super(fileName);
		// TODO Auto-generated constructor stub
		files = new ArrayList<File>();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub		
		System.out.println(" ---this is a Fold : " + super.getName());
		for(File e: files) {
			if (Folder.class.isInstance(e)) {
				
			}
			e.display();
		}
	}
	
	public void add(File file) {
		files.add(file);
	}
	
	public void remove(File file) {
		files.remove(file);
	}

}
