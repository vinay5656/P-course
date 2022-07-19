package parallelSort;

import java.util.Arrays;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] myArr = {32,4,45,32,424,1,6,323,52,53};
		System.out.println("Before parallel sort.......");
		for(int num : myArr) {
			System.out.print(num+" ");
		}
		System.out.println();
		Arrays.parallelSort(myArr);
		System.out.println("After parallel sort.......");
		for(int num : myArr) {
			System.out.print(num+" ");
		}
		System.out.println();
		
		System.out.println("Result = min+max : "+myArr[0]+myArr[myArr.length-1]);
		

	}

}
