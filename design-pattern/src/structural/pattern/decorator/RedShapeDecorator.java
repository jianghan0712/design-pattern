package structural.pattern.decorator;

//ConcreteDecorator:����װ���࣬�𵽸�Component���ְ��Ĺ���
public class RedShapeDecorator extends ShapeDecorator{

	public RedShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
		// TODO Auto-generated constructor stub
	}
	
	public void draw() {
		decoratedShape.draw();
		setRedBorder(decoratedShape);//�µĹ���
	}

	private void setRedBorder(Shape decoratedShape) {
		// TODO Auto-generated method stub
		System.out.println("Border Color: Red");
	}

}
