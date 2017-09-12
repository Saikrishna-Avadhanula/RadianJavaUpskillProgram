import java.util.Scanner;

public class GrowthInvesto1 extends InvestoCategories implements InvestoUtils{
	CadidateDetail cad = new CadidateDetail();
	int tenure;
	double premium;
	double salary=cad.getCad_Income();
	
	public GrowthInvesto1() { 
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public void LongTermPlan() {
		double premium;
		System.out.println("Long Term Plan selected.. Note Tenure Period \nMaximum tunure period <=30years \nMinimum trnure period =15years");
		System.out.println("Please enter the Tenure period to calculate premium...");
		Scanner sc = new Scanner(System.in);
		this.tenure = sc.nextInt();
		premium= getQuote(tenure);
		System.out.printf("Total Premium : %f", premium);
	}



	@Override
	public void ShortTermPlan() {
		double premium;
		System.out.println("Short Term Plan selected.. Note Tenure Period \nMaximum tunure period <15years \nMinimum trnure period =5years");
		System.out.println("Please enter the Tenure period to calculate premium...");
		Scanner sc = new Scanner(System.in);
		this.tenure = sc.nextInt();	
		premium= getQuote(tenure);
		System.out.printf("Total Premium : %f", premium);
	}

	@Override
	public double getQuote(int tenure) {
		this.tenure = tenure;
		this.premium = (this.salary/12)*(20/100)*tenure; 
		return premium;
	}

}
