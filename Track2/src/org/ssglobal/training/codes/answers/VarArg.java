package org.ssglobal.training.codes.answers;

public class VarArg {

	public void printNums(int... nums) {
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		
		for(int lookup: nums) {
			System.out.println(lookup);
		}
	}
}
