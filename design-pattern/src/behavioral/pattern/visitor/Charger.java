package behavioral.pattern.visitor;

//具体的访问者，划价员
public class Charger extends Visitor{

	@Override
	public void visitor(MedicineA a) {
		// TODO Auto-generated method stub
		System.out.println("划价员：" + name +"给药" + a.getName() +"划价:" + a.getPrice());
	}

	@Override
	public void visitor(MedicineB b) {
		// TODO Auto-generated method stub
		System.out.println("划价员：" + name +"给药" + b.getName() +"划价:" + b.getPrice());
	}
	

}
