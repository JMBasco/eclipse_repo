package org.ssglobal.training.codes.declaration;

class MyDataType {
	
	public byte counter;
	public short numProducts;
	public int numCells;
	public long numTcells;
	public char letter;
	public String personName;
	
	public float weight;
	
	public double billGatesMoney = 0.05;
	
	public void createVars( ) {
			//local var
			int age = 25;
			float salary;
			final float MY_PIE = 90.6F;
			
			System.out.println(counter);
			System.out.println(age);
		}
	
	public void	createBlockVarsThruLoop(int[] ids) {
	
		for(int i = 0; i < ids.length; i++) {
			System.out.println(ids[i]);
		}
	}
		
	public void	createBlockVarsThruSwitch(int option) {
		
		switch(option) {
		case 1:
			float amount = 1000.50f;
			System.out.println(1);
			break;
		case 2:
		
			System.out.println(2);
			break;
		default:
			System.out.println(-1);
			break;
		}
	}
		
	
	public void assignLiteral() {
		letter = '\u20B1';
		System.out.println(letter);
	
	
	//String literals
	personName = "Juan Luna\n";
	
	}

	public void literalConversion() {
		numProducts = 10; //Identity conversion
		
		// widening conversions
		int amount = 32000; 
		double salary = 67800.5F;
	
	    //narrowing conversions
		byte param = (byte) 28;
		System.out.println(param);
		
	}
	
	
}	
	
// Instance variable
public class TestMyDataType{
	
	public static void main(String[] args) {
		MyDataType mdt = new MyDataType();
		System.out.println(mdt.billGatesMoney);
		
		mdt.assignLiteral();
		mdt.literalConversion();
	}
}

