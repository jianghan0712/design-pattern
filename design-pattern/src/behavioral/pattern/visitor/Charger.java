package behavioral.pattern.visitor;

//����ķ����ߣ�����Ա
public class Charger extends Visitor{

	@Override
	public void visitor(MedicineA a) {
		// TODO Auto-generated method stub
		System.out.println("����Ա��" + name +"��ҩ" + a.getName() +"����:" + a.getPrice());
	}

	@Override
	public void visitor(MedicineB b) {
		// TODO Auto-generated method stub
		System.out.println("����Ա��" + name +"��ҩ" + b.getName() +"����:" + b.getPrice());
	}
	

}
