/*
	This program creates 3 MyPoint objects,
		then displays the distance between the first two
		and the contents of the third one.
		
	Author: Darryl Karney
	Course: CPSC24500
 */

package hw3;

public class testMyPoint {

	public static void main(String[] args) {
		MyPoint p1 = new MyPoint();
		MyPoint p2 = new MyPoint(10, 30.5);
		System.out.println(p1.distance(p2));
		MyPoint p3 = new MyPoint(5, 7.2);
		System.out.println(p3);
	}

}
