package com.ggl.testing;

public class ArraySum {

	public static void main(String[] args) {
		int[][] array = {
	            { 50, 45, 47, 52, 54 },
	            { 49, 52, 50, 50, 51 },
	            { 51, 52, 51, 45, 48 },
	            { 50, 47, 54, 47, 52 }
	    };
		int[][] result = sumArray(array);
		printArray(array);
		System.out.println();
		printArray(result);
	}
	
	public static int[][] sumArray(int[][] array) {
		int[][] output = new int[array.length - 1][array[0].length - 1];
		
		for (int i = 0; i < (array.length - 1); i++) {
			for (int j = 0; j < (array[i].length - 1); j++) {
				output[i][j] = sumSubarray(array, i, j);
			}
		}
		
		return output;
	}

	private static int sumSubarray(int[][] array, int i, int j) {
		int sum = 0;
		int width = 2;
		int height = 2;
		
		for (int i2 = i; i2 < (i + height); i2++) {
			for (int j2 = j; j2 < (j + width); j2++) {
				sum += array[i2][j2];
			}
		}
		
		return sum;
	}
	
	public static void printArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(String.format("%4d", array[i][j]));
			}
			System.out.println();
		}
	}

}
