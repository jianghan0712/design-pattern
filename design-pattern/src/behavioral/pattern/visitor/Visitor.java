package behavioral.pattern.visitor;

//���������
public abstract class Visitor {
	protected String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void visitor(MedicineA a);  //��ͬvisitor������ҩ�Ĵ�����ͬ
	
	public abstract void visitor(MedicineB b);  //��ͬvisitor������ҩ�Ĵ�����ͬ
}