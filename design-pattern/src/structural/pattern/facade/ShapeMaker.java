package structural.pattern.facade;

//����࣬�ⲿӦ��ͨ�����������ķ������������ڲ���ķ�����ͳһ���Ⱪ¶�ӿ�
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
