package csc252;
public class wrapperEX {

	public static void main (String[] args) {
		
		double val = 9;
		double val2 = 10;
		Double dval = new Double(val);
		Double dval2 = new Double(val2);
		int result = Double.compare(val,val2);
		System.out.println("result of comparing val and val2: " + result);
		System.out.println("Double values of dval " + dval.doubleValue());
		System.out.println("dval as a String: " + dval.toString());

		
	}
}
