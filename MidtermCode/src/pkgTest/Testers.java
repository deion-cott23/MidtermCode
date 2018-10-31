package pkgTest;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.reflect.*;


import org.junit.Test;
import pkgShape.Cuboid;
import pkgShape.Cuboid.SortByArea;
import pkgShape.Cuboid.SortByVolume;
import pkgShape.Rectangle;

public class Testers {

	@Test
	public void RectangleTester1() {
		
		Rectangle r1 = new Rectangle(6, 10);
		assertTrue(r1 instanceof Rectangle);
	}
	
	@Test
	public void RectangleTester2() {
		Rectangle r2 = new Rectangle(5,5);
		assertTrue(r2 instanceof Rectangle);
	}
	
	@Test
	public void RectangleTester3() {
		Rectangle r3 = new Rectangle(7, 0);
		assertTrue(r3 instanceof Rectangle);
	}
	
	@Test
	public void RectanglegetiLength_Tester() {
		Rectangle r1 = new Rectangle(7, 10);
		assertTrue(r1.getiLength() == 7);
		
	}
	
	@Test
	public void RectanglesetiLength_Tester() {
		Rectangle r1 = new Rectangle(7, 10);
		r1.setiLength(5);
		assertTrue(r1.getiLength() == 5);
	}
	
	@Test
	public void RectanglesetiWidth_Tester() {
		Rectangle r2 = new Rectangle(4, 3);
		r2.setiWidth(6);
		assertTrue(r2.getiWidth() == 6);
	}
	
	@Test
	public void RectanglegetiWidth_Tester() {
		Rectangle r2 = new Rectangle(1, 4);
		assertTrue(r2.getiWidth() == 4);
	}
	
	@Test
	public void RectangleArea_Tester1() {
		Rectangle r1 = new Rectangle(4, 4);
		assertTrue(r1.area() == 16.0);
	}
	
	@Test
	public void RectangleArea_Tester2() {
		Rectangle r2 = new Rectangle(9, 3);
		assertTrue(r2.area() == 27.0);
	}
	
	@Test
	public void RectanglePerimeter_Tester1() {
		Rectangle r1 = new Rectangle(5, 4);
		assertTrue(r1.perimeter() == 18.0);
	
	}
	
	@Test
	public void RectanglePerimeter_Tester2() {
		Rectangle r2 = new Rectangle(2, 6);
		assertTrue(r2.perimeter() == 16.0);
	}
	
	@Test
	public void RectangleCompareTo_Tester() {
		Rectangle r1 = new Rectangle(5, 5);
		Rectangle r2 = new Rectangle(8, 4);
		Rectangle r3 = new Rectangle(9, 6);
		ArrayList<Rectangle> rList = new ArrayList<Rectangle>();
		rList.add(r1);
		rList.add(r2);
		rList.add(r3);
		Collections.sort(rList);
		assertTrue(rList.get(0).area() == 25.0);
		assertTrue(rList.get(1).area() == 32.0);
		assertTrue(rList.get(2).area() == 54.0);
		
		
	}
	
	@Test
	public void Cuboid_Tester() {
		Cuboid c1 = new Cuboid(4, 4, 7);
		assertTrue(c1 instanceof Cuboid);
		
	}
	
	@Test
	public void CuboidgetiLength_Tester() {
		Cuboid c1 = new Cuboid(4, 4, 7);
		assertTrue(c1.getiLength() == 4);
	}
	
	@Test
	public void CuboidsetiLength_Tester() {
		Cuboid c1 = new Cuboid(5, 6, 7);
		c1.setiLength(2);
		assertTrue(c1.getiLength() == 2);
	}
	
	@Test
	public void CuboidgetiWidth_Tester() {
		Cuboid c2 = new Cuboid(3, 3, 5);
		assertTrue(c2.getiWidth() == 3);
	}
	
	@Test
	public void CuboidsetiWidth_Tester() {
		Cuboid c2 = new Cuboid(3, 3, 5);
		c2.setiWidth(8);
		assertTrue(c2.getiWidth() == 8);
	}
	
	@Test
	public void CuboidgetiDepth_Tester() {
		Cuboid c3 = new Cuboid(6, 9, 1);
		assertTrue(c3.getiDepth() == 1);
		
	}
	
	@Test
	public void CuboidsetiDepth_Tester() {
		Cuboid c3 = new Cuboid(6, 9, 1);
		c3.setiDepth(5);
		assertTrue(c3.getiDepth() == 5);
		
	}
	
	@Test
	public void CuboidArea_Tester() {
		Cuboid c1 = new Cuboid(7, 8, 4);
		assertTrue(c1.area() == 232.0);
	}
	
	@Test
	public void CuboidPerimeter_Tester() {
		boolean thrownExcept = false;
		
		try {
			Cuboid c1 = new Cuboid(2, 5, 4);
			c1.perimeter();
		}
		
		catch (UnsupportedOperationException unsupportedOperationException){
			thrownExcept = true;
		}
		
		assertTrue(thrownExcept);
	}
	
	@Test
	public void CuboidVolume_Tester() {
		Cuboid c2 = new Cuboid(3, 2, 6);
		assertTrue(c2.volume() == 36.0);
	}
	
	@Test
	public void CuboidCompareTo_Tester() {
		Cuboid cCompare = new Cuboid(0,0,0);
		Cuboid c1 = new Cuboid(1, 1, 1);
		Cuboid c2 = new Cuboid(4, 6, 7);
		Cuboid c3 = new Cuboid(9, 2, 1);
		ArrayList<Cuboid> cList = new ArrayList<Cuboid> ();
		cList.add(c1);
		cList.add(c2);
		cList.add(c3);
		SortByArea sortByArea;
		try {
			Class<?> clsSortByarea = Class.forName("pkgShape.Cuboid$SortByArea");
			Constructor<?> constructSortByarea = clsSortByarea.getDeclaredConstructor(new Class[] {Cuboid.class});
			constructSortByarea.setAccessible(true);
			sortByArea = (SortByArea) constructSortByarea.newInstance(cCompare);
			Collections.sort(cList, sortByArea);
			assertTrue(cList.get(0).area() == 6.0);
			assertTrue(cList.get(1).area() == 188.0);
			assertTrue(cList.get(2).area() == 58.0);
			
			
		}
		
		catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
		
		catch (InstantiationException e) {
			e.printStackTrace();
			
		}
		
		catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		
		SortByVolume sortByvolume;
		
		try {
			Class<?> clssortByVolume = Class.forName("pkgShape.Cuboid$SortByVolume");
			Constructor<?> constructsortByVolume = clssortByVolume.getDeclaredConstructor(new Class[] {Cuboid.class});
			constructsortByVolume.setAccessible(true);
			sortByvolume = (SortByVolume) constructsortByVolume.newInstance(cCompare);
			Collections.sort(cList, sortByvolume);
			assertTrue(cList.get(0).volume() == 30.0);
			assertTrue(cList.get(1).volume() == 168.0);
			assertTrue(cList.get(2).volume() == 18.0);
			
		}
		
		catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
		
		catch (InstantiationException e) {
			e.printStackTrace();
		}
		
		catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		catch(InvocationTargetException e) {
			e.printStackTrace();
		}
		
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		
	}
	
}
	


