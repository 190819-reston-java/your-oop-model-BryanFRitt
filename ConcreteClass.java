/**
 * 
 */
package oop_model;

import java.util.ArrayList;
import java.util.Comparator;

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
			System.out.println("Sorry Set ID not possible");
			new Exception("Can not do");
			// System.out.println("Sorry you can't do this");
		} catch (Exception e){
			System.out.println("Try to do something else"); // TODO: Why didn't this print?
		}
	}

	public int compareTo(ConcreteClass obj) {
		return this.id - obj.id;
	}
	
	static boolean Comparator(ConcreteClass A, ConcreteClass B){
		return A.id < B.id;
	}
	
	@Override
	public String toString() {
		return Integer.toString(this.id);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreteClass myConcreteClassObject001 = new ConcreteClass();
		ConcreteClass myConcreteClassObject002 = new ConcreteClass();
		ConcreteClass myConcreteClassObject003 = new ConcreteClass();
		
		System.out.println(myConcreteClassObject001.iIsDouble);
		System.out.println(myConcreteClassObject001.iIsFloat);
		System.out.println(myConcreteClassObject001.iIsInt);

		System.out.println(myConcreteClassObject001.iIsDoubleToImplement());
		System.out.println(myConcreteClassObject001.iIsFloatToImplement());
		System.out.println(myConcreteClassObject001.iIsIntToImplement());		
		
		System.out.println(iIsGoingToBeOverloaded(5.1));
		System.out.println(iIsGoingToBeOverloaded(5.1,3));
		
		System.out.println(myConcreteClassObject001.compareTo(myConcreteClassObject002));
		
		// Show exception
		System.out.println("Trying to create an exception");
		ConcreteClass.setCount(999);
		
		ConcreteClass[] cc = { myConcreteClassObject001, myConcreteClassObject002, myConcreteClassObject003 };
		
		System.out.println("Trying to create another exception");
		myConcreteClassObject001.setId(999);
		
		ArrayList<ConcreteClass> alcc = new ArrayList<ConcreteClass>();
		alcc.add(myConcreteClassObject003);
		alcc.add(myConcreteClassObject001);
		alcc.add(myConcreteClassObject002);
		
		System.out.println(alcc);
		alcc.sort(null);
		System.out.println(alcc);
	}
}
