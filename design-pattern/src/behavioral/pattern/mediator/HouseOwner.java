package behavioral.pattern.mediator;

//������ҪȥѰ�����
public class HouseOwner extends Person{

	HouseOwner(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public void constract(String message) {
		System.out.println("To HouseOwner:" + name +", Message��" + message);
	}

}
