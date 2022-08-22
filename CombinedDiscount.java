package csc252;

public class CombinedDiscount extends DiscountPolicy implements DiscountInter{
	
	private DiscountPolicy Bulk;
	private DiscountPolicy BuyN;
	
	public CombinedDiscount(DiscountPolicy Bulk, DiscountPolicy BuyN) {
		
		this.Bulk = Bulk;
		this.BuyN = BuyN;
	}

	public double computeDiscount(int count, double itemCost){
		double Dcost;
		double Dcost2;
		
		Dcost = ((BulkDiscount) Bulk).computeDiscount(count, itemCost);
		//this line finds Dcost by running method computeDiscount in class BulkDiscount
		Dcost2 =  ((BuyNItemsGetOneFree) BuyN).computeDiscount(count, itemCost);
		//this line finds Dcost2 by running method computeDiscount in class BuyNItemsGetOneFree

		
		System.out.println("<Comparing both discounts>");
		if(Dcost < Dcost2){
			System.out.print("The bulk discounted price is lower than the 'BuyNItemsGetOneFree' price. It is: " + Dcost);
			return Dcost;
		} else{
			System.out.print("The 'BuyNItemsGetOneFree' price is lower than the bulk discounted price. It is: " + Dcost2);
			return Dcost2;
			//the if statement compares both discounted prices and prints the lowest one
		}
}
	
	
	public static void main(String[] args) {
		BulkDiscount Tester3 = new BulkDiscount(4, 0.30);
		BuyNItemsGetOneFree Tester4 = new BuyNItemsGetOneFree(4);

		CombinedDiscount finalTest = new CombinedDiscount(Tester3, Tester4);
		
		finalTest.computeDiscount(17, 3.0);
		//object finalTest calls method computeDiscount
	}
}
