package com.data.basic.api;

/**
 * 
 * @ author Ashish Kourav
 *
 */

public class BasicArrayApi {

	public static void main(String[] args) {
		/**
		 * Find the array maximum element
		 */	
		System.out.println(getArrayData(new int[] {1,3,55}));

		/**
		 * Find the array minimum element
		 */	
		System.out.println(getArrayLowestData(new int[] {1,3,55}));

	}
	/**
	 * This method responsible for getting the maximum element from array list
	 * @param data
	 * @return array max element
	 */
	public static int getArrayData(int[] data) {
		int max=0;
		for (int i = 0; i < data.length; i++) {
		if (max<data[i]) {
			max=data[i];
		}	
		
		}
		
		return max;
	}
	/**
	 * This method responsible for getting the lowest element from array list
	 * Here we need to provide the number which is greater than maximum no of array
	 * @param data
	 * @return array min element
	 */
	public static int getArrayLowestData(int[] data) {
		int min=100;
		for (int i = 0; i < data.length; i++) {
		if (min>data[i]) {
			min=data[i];
		}	
		
		}
		
		return min;
	}
}
