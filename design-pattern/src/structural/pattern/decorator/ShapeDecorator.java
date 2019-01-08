package structural.pattern.decorator;

/*
 * 由于新需求，为了不影响原接口，用装饰类实现新功能
 * Component: 抽象构件。是定义一个对象接口，可以给这些对象动态地添加职责
 */
public abstract class ShapeDecorator implements Shape{
	protected Shape decoratedShape;
	
	public ShapeDecorator(Shape decoratedShape) {
		this.decoratedShape = decoratedShape;
	}
	
	public void draw() {
		decoratedShape.draw();
	}
}
