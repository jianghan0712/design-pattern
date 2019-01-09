package creational.pattern.simplefactory;

public class SharpFactory {
	//�÷������ʵ�֣��������ڸ����һϵ�ж����ڱ����в���Ч��������ʵ���зǳ�����
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
