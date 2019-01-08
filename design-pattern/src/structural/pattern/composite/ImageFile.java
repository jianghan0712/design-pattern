package structural.pattern.composite;

//Ò¶½ÚµãLeaf
public class ImageFile extends File{

	public ImageFile(String fileName) {
		super(fileName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(" ---this is Image File : " + super.getName());
//		return " ---this is Image File : " + super.getName();
	}

}
