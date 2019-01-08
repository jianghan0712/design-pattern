package behavioral.pattern.mediator;

public class Tenant extends Person{
    
    Tenant(String name) {
        super(name);
    }
    
	public void constract(String message) {
		System.out.println("To Tenant:" + name +", Message£º" + message);
	}
}
