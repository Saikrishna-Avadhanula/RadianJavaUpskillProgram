import java.util.Scanner;

public class GrowthInvesto1 extends InvestoCategories implements InvestoUtils{
	CadidateDetail cad = new CadidateDetail();
	int tenure;
	double premium;
	double salary=cad.getCad_Income();
	float interestPercent;
	
	public GrowthInvesto1() { 
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public void LongTermPlan() {
		try {
		double premium;
		System.out.println("Long Term Plan selected.. Note Tenure Period \nMaximum tunure period <=30years \nMinimum trnure period =15years \n Please enter the Tenure");
		Scanner sc = new Scanner(System.in);
		this.tenure = sc.nextInt();
		premium= getQuote(tenure);
		System.out.printf("Total Premium : %f", premium);
		}catch(Exception e){
			System.out.println(e.getStackTrace());
			System.out.println(e.getMessage());
		}
	}



	@Override
public void ShortTermPlan() {
	interestPercent = (float) 5.45;
		try{
			boolean i=true;
			int count=0;
			double premium;
			System.out.println("Short Term Plan selected.. Note Tenure Period \nMaximum tunure period <15years \nMinimum trnure period =5years \n Please enter the Tenure");
			Scanner sc = new Scanner(System.in);
			while(i){
					if(sc.nextInt() < 15 && sc.nextInt() >= 5) {
						this.tenure = sc.nextInt();	
						getQuote(this.tenure, salary, interestPercent);
						i=false;}
					else{
						System.out.println("Tenure period should be between 5Yrs - 14Yrs");
						count++;}
						if(count==3){break;}
					}
		}catch(Exception e){
			System.out.println(e.getStackTrace());
			System.out.println(e.getMessage());
		}
	}
}
