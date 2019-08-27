/**
 * 
 */
package oop_model;

/**
 * @author bryan
 *
 */
public class ConcreteClass extends AbstractClass implements InterfaceClass {

	/**
	 * 
	 */
	public ConcreteClass() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int iIsIntToImplement() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float iIsFloatToImplement() {
		// TODO Auto-generated method stub
		return 0f;
	}

	@Override
	public double iIsDoubleToImplement() {
		// TODO Auto-generated method stub
		return 0.;
	}
	
	static double iIsGoingToBeOverloaded(double i, int b) {
		return i*b;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreteClass myConcreteClass = new ConcreteClass();
		System.out.println(myConcreteClass.iIsDouble);
		System.out.println(myConcreteClass.iIsFloat);
		System.out.println(myConcreteClass.iIsInt);

		System.out.println(myConcreteClass.iIsDoubleToImplement());
		System.out.println(myConcreteClass.iIsFloatToImplement());
		System.out.println(myConcreteClass.iIsIntToImplement());		
		
		System.out.println(iIsGoingToBeOverloaded(5.1));
		System.out.println(iIsGoingToBeOverloaded(5.1,3));
	}

}
