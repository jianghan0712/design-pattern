package behavioral.pattern.visitor;

//抽象访问者
public abstract class Visitor {
	protected String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void visitor(MedicineA a);  //不同visitor对两种药的处理不同
	
	public abstract void visitor(MedicineB b);  //不同visitor对两种药的处理不同
}
