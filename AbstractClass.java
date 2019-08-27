/**
 * 
 */
package oop_model;

/**
 * @author bryan
 *
 */
public abstract class AbstractClass {

	int iIsInt;
	float iIsFloat;
	double iIsDouble;
	
	static double iIsGoingToBeOverloaded(double i) {
		return i;
	}
	
	public void printMe() {
		this.toString();
	}
	
	@Override
	public String toString() {
		return "AbstractClass [iIsInt=" + iIsInt + ", iIsFloat=" + iIsFloat + ", iIsDouble=" + iIsDouble
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	/**
	 * 
	 */
	public AbstractClass() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
