import java.util.Scanner;
/*System.out.println("InvestoCategories default constructor called");
System.out.println("Please select the plan number \n 1. Growth Investment. \n 2. Child Future. \n 3. Retirement Plan");
Scanner sc = new Scanner(System.in);
planNo = sc.nextInt();
switch (planNo) {
case 1:
	System.out.println("Selected Plan: Growth Investment");
	GrowthInvesto1 g1 = new GrowthInvesto1();
	
	break;
case 2:
	System.out.println("Selected Plan: Child Future");
	break;
case 3:
	System.out.println("Selected Plan: Retirement Plan");
	break;

default:
	break;
}
*/
public class InvestoCategories {

	private int planNo;
	
	public InvestoCategories() {

	}

	public InvestoCategories(int planNo) {
		super();
		this.planNo = planNo;
		switch (planNo) {
		case 1:
			System.out.println("Selected Plan: Growth Investment");
			GrowthInvesto1 g1 = new GrowthInvesto1();
			//System.out.println(g1.getPremium());
			break;
		case 2:
			System.out.println("Selected Plan: Child Future");
			break;
		case 3:
			System.out.println("Selected Plan: Retirement Plan");
			break;

		default:
			break;
		
	}

	
	
	}
}
