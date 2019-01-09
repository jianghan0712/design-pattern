package creational.pattern.simplefactory;

public class SharpFactory {
	//用反射机制实现，创建基于该类的一系列对象。在本例中并无效果，但在实际中非常常见
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
	
	public static Shape getShape(String type) {
		Shape ret = null;
		if(type.equalsIgnoreCase("square")) {
			ret = new Square();
		}else if(type.equalsIgnoreCase("rectangle")){
			ret = new Rectangle();
		}
		return ret;
	}
}
