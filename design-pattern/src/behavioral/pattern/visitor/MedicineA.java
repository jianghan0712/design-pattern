package behavioral.pattern.visitor;

public class MedicineA extends Medicine{

	public MedicineA(String name, double price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void accept(Visitor vistor) {
		// TODO Auto-generated method stub
		vistor.visitor(this);
	}

}
