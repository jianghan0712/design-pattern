package structural.pattern.flyweight;

public class Circle implements Shape{
	private String color;
	private int x;
	private int y;
	
	public Circle(String color) {
		// TODO Auto-generated constructor stub
		this.color = color;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Circle: Draw() [Color : " + color 
		         +", x : " + x +", y :" + y + "]");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	
}
