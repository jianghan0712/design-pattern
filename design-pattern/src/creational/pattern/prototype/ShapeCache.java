package creational.pattern.prototype;

import java.util.HashMap;

/*
 * 模拟从数据库获取实体类，并把他们存在一个cache（hashMap）中 
 */
public class ShapeCache {
	private static HashMap<String, Shape> shapeMap = new HashMap<String, Shape>();
	
	public static Shape getShape(String shapeId) {
		return (Shape)shapeMap.get(shapeId).clone();
	}

	//模拟从数据库中load2种数据类型，把他们存到map中，当需要新创建一个对应实体时，调用getShape来直接复制一个对象，而不是new
	public static void loadCache() {
		 Square square = new Square();
	     square.setId("Square");
	     shapeMap.put(square.getId(),square);
	 
	     Rectangle rectangle = new Rectangle();
	     rectangle.setId("Rectangle");
	     shapeMap.put(rectangle.getId(),rectangle);
	}
}
