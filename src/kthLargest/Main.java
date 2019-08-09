package kthLargest;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] nums = {3,2,1,5,6,4};
		
		int k = 2;
		
		System.out.println("Nums: " + Arrays.toString(nums) + " k: " + k);
		
		FindKthLargestElementInArrayFunction solution = new FindKthLargestElementInArrayFunction();
		
		System.out.println("Solution: " + solution.findKthLargest(nums, k));
	}
}
