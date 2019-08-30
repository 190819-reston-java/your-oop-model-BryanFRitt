/**
 * 
 */
package oop_model;

/**
 * @author bryan
 *
 */
public class ConcreteClass extends AbstractClass implements InterfaceClass,Comparable<ConcreteClass> {

	private static int count = 0;
	private int id;
	
	public ConcreteClass() {
		// TODO Auto-generated constructor stub
		count++;
		this.id = count;
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

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		try {
			new Exception("count can not manually set count");
		}
		catch (Exception e) {
			System.out.println("Try to do something else, because " + e);
		}
		
		System.out.println("Sorry you can't do this");
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		try {
			new Exception("Can not do");
			// System.out.println("Sorry you can't do this");
		} catch (Exception e){
			System.out.println("Try to do something else");
		}
	}

	public int compareTo(ConcreteClass obj) {
		return this.id - obj.id;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreteClass myConcreteClassObject001 = new ConcreteClass();
		ConcreteClass myConcreteClassObject002 = new ConcreteClass();
		//ConcreteClass myConcreteClassObject003 = new ConcreteClass();
		
		System.out.println(myConcreteClassObject001.iIsDouble);
		System.out.println(myConcreteClassObject001.iIsFloat);
		System.out.println(myConcreteClassObject001.iIsInt);

		System.out.println(myConcreteClassObject001.iIsDoubleToImplement());
		System.out.println(myConcreteClassObject001.iIsFloatToImplement());
		System.out.println(myConcreteClassObject001.iIsIntToImplement());		
		
		System.out.println(iIsGoingToBeOverloaded(5.1));
		System.out.println(iIsGoingToBeOverloaded(5.1,3));
		
		System.out.println(myConcreteClassObject001.compareTo(myConcreteClassObject002));
	}
}
