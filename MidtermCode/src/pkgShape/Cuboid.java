package pkgShape;


import java.util.Comparator;





public class Cuboid extends Rectangle implements Comparable<Rectangle> {
	
	private int iDepth;
	
	public Cuboid(int iLength, int iWidth, int iDepth) {
		super(iLength, iWidth);
		this.iDepth = iDepth;
	}
	
	//Set the depth variable
	
	public void setiDepth(int iDepth) {
		this.iDepth = iDepth;
	}
	
	//Gets the value of the perimeter depth
	
	public int getiDepth() {
		return iDepth;
	}
	
	
	public double volume() {
		return (getiLength() * getiWidth() * getiDepth());
	}
	
	@Override
	public double area() {
		return ((2*getiLength()*getiWidth()) + (2*getiLength()*getiDepth()) + (2*getiWidth()*getiDepth()));
	}
	
	public double perimeter() throws UnsupportedOperationException {
		throw new UnsupportedOperationException("Perimeter is not available for cuboid class");
	}
	
	public class SortByArea implements Comparator<Cuboid> {
		SortByArea() {
		} 
		
		@Override
		public int compare(Cuboid c1, Cuboid c2) {
			if (c1.area() > c2.area()) {
				return 1;
			}
			
			else if (c1.area() < c2.area()) {
				return -1;
			}
			
			else {
				return 0;
			}
		}
	}
	
	public class SortByVolume implements Comparator<Cuboid> {
		SortByVolume() {
			
		}
		
		@Override
		public int compare(Cuboid c1, Cuboid c2) {
			
			if (c1.volume() < c2.volume()) {
				return -1;
			}
			
			else if (c1.volume() > c2.volume()) {
				return 1;
			}
			
			else {
				return 0;
			}
		}
	}		
}
