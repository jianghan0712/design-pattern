package creational.pattern.simplefactory;

public class SharpFactory {
	public static Object getShape(Class<?> c1) {
		Object en = null;
		try {
			en = c1.newInstance();			
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return en;		
	}
	

}
