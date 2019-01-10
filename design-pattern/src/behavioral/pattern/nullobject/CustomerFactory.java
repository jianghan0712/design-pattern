package behavioral.pattern.nullobject;

public class CustomerFactory {
	public static final String[] names = {"Rob", "Joe", "Julie"};
	
	public static AbstractCustomer getCustomer(String name) {
		for(String e: names) {
			if(name.equalsIgnoreCase(e)) {
				return new RealCustomer(e);
			}
		}
		return new NullCustomer();
	}
}
