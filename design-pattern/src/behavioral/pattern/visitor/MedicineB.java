package behavioral.pattern.visitor;

public class MedicineB extends Medicine{

	public MedicineB(String name, double price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void accept(Visitor vistor) {
		// TODO Auto-generated method stub
		vistor.visitor(this);
	}

}
