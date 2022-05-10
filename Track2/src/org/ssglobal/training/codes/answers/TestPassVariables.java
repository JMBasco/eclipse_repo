package org.ssglobal.training.codes.answers;

public class TestPassVariables {

	public static void main(String[] args) {
		PassVariables cv = new PassVariables();
		
		//Primitive Var
		int testX = 10;
		System.out.format("This is the original num is %d. \n", testX);
		cv.passPrimitive(testX);
		System.out.format("This new num is %d. \n", testX);
		
		//testsb[12356644ABCD] ==> 12356644ABCD("Manila")
		//Reference Var
		StringBuilder testsb = new StringBuilder("Manila");
		System.out.format("This is the original sb is %s. \n", testsb);
		cv.passRefVar(testsb);
		System.out.format("This is the new is %s. \n", testsb);

	}

}
