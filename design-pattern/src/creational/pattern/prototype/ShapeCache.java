package creational.pattern.prototype;

import java.util.HashMap;

/*
 * ģ������ݿ��ȡʵ���࣬�������Ǵ���һ��cache��hashMap���� 
 */
public class ShapeCache {
	private static HashMap<String, Shape> shapeMap = new HashMap<String, Shape>();
	
	public static Shape getShape(String shapeId) {
		return (Shape)shapeMap.get(shapeId).clone();
	}

	//ģ������ݿ���load2���������ͣ������Ǵ浽map�У�����Ҫ�´���һ����Ӧʵ��ʱ������getShape��ֱ�Ӹ���һ�����󣬶�����new
	public static void loadCache() {
		 Square square = new Square();
	     square.setId("Square");
	     shapeMap.put(square.getId(),square);
	 
	     Rectangle rectangle = new Rectangle();
	     rectangle.setId("Rectangle");
	     shapeMap.put(rectangle.getId(),rectangle);
	}
}
