package behavioral.pattern.visitor;

//����ķ����ߣ�ҩ��
public class WorkerOfPharmacy extends Visitor{

	@Override
	public void visitor(MedicineA a) {
		// TODO Auto-generated method stub
		System.out.println("ҩ�������ߣ�" + name + "��ҩ ��" + a.getName());
	}

	@Override
	public void visitor(MedicineB b) {
		// TODO Auto-generated method stub
		System.out.println("ҩ�������ߣ�" + name + "��ҩ ��" + b.getName());
	}
}
