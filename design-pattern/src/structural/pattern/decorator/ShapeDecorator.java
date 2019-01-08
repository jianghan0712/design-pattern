package structural.pattern.decorator;

/*
 * ����������Ϊ�˲�Ӱ��ԭ�ӿڣ���װ����ʵ���¹���
 * Component: ���󹹼����Ƕ���һ������ӿڣ����Ը���Щ����̬�����ְ��
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
