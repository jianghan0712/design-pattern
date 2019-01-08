package structural.pattern.decorator;

//ConcreteDecorator:具体装饰类，起到给Component添加职责的功能
public class RedShapeDecorator extends ShapeDecorator{

	public RedShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
		// TODO Auto-generated constructor stub
	}
	
	public void draw() {
		decoratedShape.draw();
		setRedBorder(decoratedShape);//新的功能
	}

	private void setRedBorder(Shape decoratedShape) {
		// TODO Auto-generated method stub
		System.out.println("Border Color: Red");
	}

}
