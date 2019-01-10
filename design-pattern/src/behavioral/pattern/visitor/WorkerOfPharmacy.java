package behavioral.pattern.visitor;

//具体的访问者，药店
public class WorkerOfPharmacy extends Visitor{

	@Override
	public void visitor(MedicineA a) {
		// TODO Auto-generated method stub
		System.out.println("药房工作者：" + name + "拿药 ：" + a.getName());
	}

	@Override
	public void visitor(MedicineB b) {
		// TODO Auto-generated method stub
		System.out.println("药房工作者：" + name + "拿药 ：" + b.getName());
	}
}
