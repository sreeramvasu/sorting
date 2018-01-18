package com.example.sorting.impl;

import java.util.Arrays;

import com.example.sorting.ISorting;

public class ISortingImpl implements ISorting {

	public void selectionSort(int[] input) {
		System.out.println("Input: " + Arrays.toString(input) + "\n");
		int inputLen = input.length;
		for(int countI = 0; countI < inputLen-1; countI++) {
			for(int countJ = countI+1; countJ < inputLen; countJ++) {
				if(input[countI] > input[countJ]) {
					input[countI] = input[countI] + input[countJ];
					input[countJ] = input[countI] - input[countJ];
					input[countI] = input[countI] - input[countJ];
					continue;
				}
			}
			System.out.println("Iteration " + (countI+1) + ":" + Arrays.toString(input) );
		}
		System.out.println("Time Complexity: {Best: O(n^2), Average: O(n^2), Worst: O(n^2)");
		
	}

	@Override
	public void insertionSort(int[] input) {
		System.out.println("Input: " + Arrays.toString(input) + "\n");
		int inputLen = input.length;
		for(int countI = 1; countI<inputLen; countI++) {
			int countJ = countI;
			while(countJ > 0 && input[countJ-1]>input[countJ]) {
				input[countJ-1] = input[countJ-1] + input[countJ];
				input[countJ] = input[countJ-1] - input[countJ];
				input[countJ-1] = input[countJ-1] - input[countJ];
				countJ--;
			}
			System.out.println("Iteration " + (countI) + ":" + Arrays.toString(input) );
		}
		
		System.out.println("Time Complexity: {Best: O(n), Average: O(n^2), Worst: O(n^2)");
		
	}

	@Override
	public void bubbleSort(int[] input) {
		System.out.println("Input: " + Arrays.toString(input) + "\n");
		int inputLen = input.length;
		for(int countI = 0; countI<inputLen-1; countI++) {
			for(int countJ = 0; countJ<inputLen-1-countI; countJ++) {
				if(input[countJ] > input[countJ+1]) {
					input[countJ] = input[countJ] + input[countJ+1];
					input[countJ+1] = input[countJ] - input[countJ+1];
					input[countJ] = input[countJ] - input[countJ+1];
					continue;
				}
			}		
			System.out.println("Iteration " + (countI+1) + ":" + Arrays.toString(input) );
		}
		
		System.out.println("Time Complexity: {Best: O(n), Average: O(n^2), Worst: O(n^2)");
		
	}

	@Override
	public void mergeSort(int[] input) {
		System.out.println("Input: " + Arrays.toString(input) + "\n");
		int inputLen = input.length;	
		int low = 0, high = inputLen -1, mid = low + high
		
	}

}
