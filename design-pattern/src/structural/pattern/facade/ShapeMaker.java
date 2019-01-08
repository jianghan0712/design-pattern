package structural.pattern.facade;

//外观类，外部应用通过调用这个类的方法，来调用内部类的方法。统一对外暴露接口
public class ShapeMaker {
	private Shape square;
	private Shape rectangle;
	
	public ShapeMaker() {
		square = new Square();
		rectangle = new Rectangle();
	}
	
	public void drawSquare() {
		square.draw();
	}
	
	public void drawRectangle() {
		rectangle.draw();
	}
}
