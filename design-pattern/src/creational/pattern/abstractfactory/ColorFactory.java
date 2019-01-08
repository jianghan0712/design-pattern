package creational.pattern.abstractfactory;

public class ColorFactory extends AbstractFactory{

	@Override
	public Object getColor(Class<?> color) {
		// TODO Auto-generated method stub
		Object en = null;
		try {
			en = color.newInstance();			
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return en;
	}

	@Override
	public Object getShape(Class<?> shape) {
				
		return null;		
	}

}
