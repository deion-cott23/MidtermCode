package pkgShape;

import pkgShape.Shape;

public class Rectangle extends Shape implements Comparable<Rectangle> {
	
	private int iWidth;
	private int iLength;
	
	public Rectangle(int iLength, int iWidth) {
		this.iWidth = iWidth;
		this.iLength = iLength;
	}
	
	public void setiWidth(int iWidth) {
		this.iWidth = iWidth;
	}
	
	public int getiWidth() {
		return iWidth;
	}
	
	public void setiLength(int iLength) {
		this.iLength = iLength;
		
	}
	
	public int getiLength() {
		return iLength;
	}
	
	@Override
	public double area() {
		return (iWidth * iLength);
		
	}
	
	@Override
	public double perimeter() {
		return ((2*iWidth) + (2*iLength));
	}
	
	
	@Override
	public int compareTo(Rectangle r) {
		
		if (this.area() > r.area()) {
			return 1;
		}
		
		else if (this.area() < r.area()) {
			return -1;
		}
		
		else {
			return 0;
		}
	}

}
