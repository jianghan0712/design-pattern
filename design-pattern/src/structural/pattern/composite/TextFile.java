package structural.pattern.composite;

//Ò¶½ÚµãLeaf
public class TextFile extends File{

	public TextFile(String fileName) {
		super(fileName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(" ---this is Text File : " + super.getName());
//		return " ---this is Text File : " + super.getName();
	}

}
