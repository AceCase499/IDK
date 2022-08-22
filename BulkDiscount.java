package csc252;

public class BulkDiscount extends DiscountPolicy implements DiscountInter{
	private int minimum;
	private double itemDiscount;
	private double Dcost;
	private double percent;
	
	public BulkDiscount(int minimum, double percent) {
		this.minimum = minimum;
		this.percent =percent;
		
	}
	
	public void setPercent(double percent) {
		this.percent = percent;
}
	public double getPercent() {
		return percent;
}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
}
	public double getMinimum() {
		return minimum;
}
		
		
	public double computeDiscount(int count, double itemCost){
		
		itemDiscount = (itemCost*count)*percent;
		itemCost = itemCost*count;
		Dcost = itemCost-itemDiscount;
		
		System.out.println("<Bulk>");
		if(count > minimum){
			System.out.println("The minimum has been exceeded. The new price is: $" + Dcost);
			return Dcost;
		} else {
			System.out.println("The minimum has NOT been exceeded. The full price is: $" + itemCost);
			Dcost = itemCost;
			return Dcost;
		}
		//the if statement tests if the number of items bought is bigger than the
		//minimum number of items needed to apply the discount.  If so, the discount is applied,
		//if not the discount is not applied
	}
	

	public static void main(String[] args) {
		
		//if the method is NON-static, create an object and make the object use it
		//new objects must contain values in their parameters with respect to the constuctor's type(s)
		BulkDiscount Tester = new BulkDiscount(4, 0.30);
		
		//method calls must contain values in their parameters with respect to the method's type(s)
		Tester.computeDiscount(17, 3.00);

		System.out.println("Part 2 compiles.");
	}
}
