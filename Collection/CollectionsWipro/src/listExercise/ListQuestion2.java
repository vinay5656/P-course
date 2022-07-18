package listExercise;

import java.util.ArrayList;

class Array {
	private int integerNumber;
	private float floatNumber;
	private double doubleNumber;

	/**
	 * @param integerNumber
	 */
	public Array(int integerNumber) {
		this.integerNumber = integerNumber;
	}

	/**
	 * @param floatNumber
	 */
	public Array(float floatNumber) {
		this.floatNumber = floatNumber;
	}

	/**
	 * @param doubleNumber
	 */
	public Array(double doubleNumber) {
		this.doubleNumber = doubleNumber;
	}

//	/**
//	 * @param integerNumber
//	 * @param floatNumber
//	 */
//	public Array(int integerNumber, float floatNumber) {
//		super();
//		this.integerNumber = integerNumber;
//		this.floatNumber = floatNumber;
//	}
//
//	/**
//	 * @param integerNumber
//	 * @param doubleNumber
//	 */
//	public Array(int integerNumber, double doubleNumber) {
//		super();
//		this.integerNumber = integerNumber;
//		this.doubleNumber = doubleNumber;
//	}
//
//	/**
//	 * @param floatNumber
//	 * @param doubleNumber
//	 */
//	public Array(float floatNumber, double doubleNumber) {
//		this.floatNumber = floatNumber;
//		this.doubleNumber = doubleNumber;
//	}

	/**
	 * @param integerNumber
	 * @param floatNumber
	 * @param doubleNumber
	 */
	
	public Array(int integerNumber, float floatNumber, double doubleNumber) {
		this.integerNumber = integerNumber;
		this.floatNumber = floatNumber;
		this.doubleNumber = doubleNumber;
	}
    

//
//	/**
//	 * @return the integerNumber
//	 */
//	public int getIntegerNumber() {
//		return integerNumber;
//	}
//
//	
//	/**
//	 * @return the floatNumber
//	 */
//	public float getFloatNumber() {
//		return floatNumber;
//	}
//
//	/**
//	 * @return the doubleNumber
//	 */
//	public double getDoubleNumber() {
//		return doubleNumber;
//	}

	@Override
	public String toString() {
		if(integerNumber!= 0) {
			return "integerNumber=" + integerNumber;
		}else if(floatNumber!= 0.0f) {
			return "floatNumber=" + floatNumber;
		}else if(doubleNumber !=0.0) {
			return "doubleNumber=" + doubleNumber;
		}
		return "integerNumber=" + integerNumber + ", floatNumber=" + floatNumber + ", doubleNumber="
				+ doubleNumber;
	}
	
	

}

public class ListQuestion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Array> numberList = new ArrayList<Array>();
		numberList.add(new Array(23));
		numberList.add(new Array(45.6f));
		numberList.add(new Array(23.39273));
		
		for(Array arr : numberList) {
			
			System.out.println(arr);
		}
		
     }
}
