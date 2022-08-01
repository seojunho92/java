package ch06.home.ex04.case03;

public class Circle {
	private int r;
	private Point point;
	
	public Circle(Point point, int r) {
		//point = new Point(x, y);
		//point.setX(x);
		//point.setY(y);
		this.point = point;
		this.r = r;
	}
	
	@Override
	public String toString() {
		return String.format("%s, %d", this.point, this.r);
	}
}
