/**Programmer: Manny Fomundam
	 * Homework 4: Problem 1
	 * Date: 3/29/2022
	 * A version of MergeSort which divides the array into 3 (approximately) even
size sections, sorts each section, then merges them together.
	 **/

import java.util.*;

public class HW4P1 {
	
	public static void threeWayMergeSort(int [] a) {
		if(a == null) {
			return;
		}
		
		int [] workspace = new int[a.length];
		for(int i = 0; i < a.length; i++) {
			workspace[i] = a[i];
		}
		
		threeWayMergeSort(a, 0, a.length-1, workspace);
		for(int i = 0; i < a.length; i++) {
			a[i] = workspace[i];
		}
	}

	public static void threeWayMergeSort(int [] a, int low, int high, int [] workspace) {
		if(high - low < 2) {
			return;
		}
		
		int left_mid = low + ((high - low) / 3);
		int right_mid = low + 2 * ((high - low) / 3) + 1;
		
		threeWayMergeSort(workspace, low, left_mid - 1, a);
		threeWayMergeSort(workspace, left_mid, right_mid - 1, a);
		threeWayMergeSort(workspace, right_mid, high - 1, a);
		
		merge(workspace, low, left_mid, right_mid, high, a);
	}

	public static void merge(int [] a, int low, int left_mid, int right_mid, int high, int [] workspace) {
		int i = low, j = left_mid, k = right_mid, l = low;
		
		while((i < left_mid) && (j < right_mid) && (k <= high)) {
			if(a[i] < a[j]) {
				if(a[i] < a[k]) {
					workspace[l++] = a[i++];
				}
				else {
					workspace[l++] = a[k++];
				}
			}
			
			else {
				if(a[j] < a[k]) {
					workspace[l++] = a[j++];
				}
				else {
					workspace[l++] = a[k++];
				}
			}
			}
		
		while ((i < left_mid) && (j < right_mid)) {
			if(a[i] < a[j]) {
				workspace[l++] = a[i++];
			}
			else {
				workspace[l++] = a[j++];
			}
		}
		
		while ((j < right_mid) && (k <= high)) {
			if(a[j] < a[k]) {
				workspace[l++] = a[j++];
			}
			else {
				workspace[l++] = a[k++];
			}
		}
		
		while (i < left_mid) {
			workspace[l++] = a[i++];
		}
		
		while (j < right_mid) {
			workspace[l++] = a[j++];
		}
		
		while (k <= high) {
			workspace[l++] = a[k++];
		}
		
		for(l = low; l <= high; l++)
			a[l] = workspace[l];
		}
		
		
	public static void main(String [] args)	{
		int [] array = new int[]{30, 42, 7, 71, 19, 61, 86, 64, 44, 38, 24, 22, 82, 5, 51};
		System.out.println("Before Three Way Merge Sort");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println("After Three Way Merge Sort");
		threeWayMergeSort(array);
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	}
