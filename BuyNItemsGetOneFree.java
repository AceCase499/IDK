package csc252;

public class BuyNItemsGetOneFree extends DiscountPolicy{
	
	int n;

	public BuyNItemsGetOneFree(int n) {
		this.n = n;
	}
	
	
	public double computeDiscount(int n, double Dcost2){
		System.out.println("<Buy n, get one free>");
		for(int a = -1; a < 17; a++){
			int Tcar = 3;
			
			if(a % n == 0){
				Tcar = 0;
			}
			Dcost2 += Tcar;
		}
		//the for loop makes 17 iterations where Tcar = 3. With every nth iteration, Tcar's value is
		//updated to 0. Dcost is the sum of every iteration

		System.out.println("Your price is: $" + Math.round(Dcost2));

		return Dcost2;
	}
	
	public static void main(String[] args) {
		
		BuyNItemsGetOneFree Tester2 = new BuyNItemsGetOneFree(4);
		
		Tester2.computeDiscount(4, 0.30);	 
		
		System.out.print("Part 3 compiles.");
	}
}
