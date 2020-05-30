package hw3;

import java.text.DecimalFormat;

public class MyPoint {
	//Create private member variables
	private double x, y;
	
	//Default contstructor
	public MyPoint() {
		x = 0;
		y = 0;
	}
	
	//Constructor taking x and y
	public MyPoint(double x, double y) {	
		this.x = x;
		this.y = y;
	}
	
	//Create decimalFormat for displaying weekly pay
	static DecimalFormat mydf = new DecimalFormat("0.00");

	/**
	 * @return the x
	 */
	public double getX() {
		return x;
	}

	/**
	 * @return the y
	 */
	public double getY() {
		return y;
	}
	
	/**
	 * @param x the x to set
	 */
	public void setX(double x) {
		this.x = x;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(double y) {
		this.y = y;
	}

	/**
	 * 
	 * @param myPoint the MyPoint to calculate distance to
	 * @return the distance between myPoint and this MyPoint
	 */
	public String distance(MyPoint myPoint) {
		return mydf.format(Math.abs(Math.sqrt(Math.pow(myPoint.getX() - x, 2) + Math.pow(myPoint.getY() - y, 2))));
	}
	
	/**
	 * 
	 * @param x the x to calculate distance to
	 * @param y the y to calculate distance to
	 * @return the distance between the passed x and y values and this MyPoint
	 */
	public String distance(double x, double y) {
		return mydf.format(Math.abs(Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2))));
	}
	
	//Displays all information for this MyPoint
	@Override
	public String toString() {
		return "******************************" +
				"\nContents of: " + super.toString() +
				"\nx: " + mydf.format(x) +
				"\ny: " + mydf.format(y);
	}
}
