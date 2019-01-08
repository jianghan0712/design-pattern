package behavioral.pattern.mediator;

//房东，要去寻找租客
public class HouseOwner extends Person{

	HouseOwner(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public void constract(String message) {
		System.out.println("To HouseOwner:" + name +", Message：" + message);
	}

}
