package behavioral.pattern.visitor;

//药品抽象类
public abstract class Medicine {
	protected String name;
	protected double price;
	
	public Medicine(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public abstract void accept(Visitor vistor); //不同角色的人对药品的处理不同，划价人对药计价，药店把药给别人
}
