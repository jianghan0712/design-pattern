package structural.pattern.composite;

//Ҷ�ڵ�Leaf
public class VideoFile extends File{

	public VideoFile(String fileName) {
		super(fileName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(" ---this is Video File : " + super.getName());
//		return " ---this is Video File : " + super.getName();
	}

}
