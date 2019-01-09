package creational.pattern.abstractfactory;

public class ShapeFactory extends AbstractFactory{

	@Override
	public Object getColor(Class<?> color) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getShape(Class<?> shape) {
		// TODO Auto-generated method stub
		Object en = null;
		try {
			en = shape.newInstance();			
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
