import java.util.Scanner;

public class GrowthInvesto {
	int gInvestId;
	String name;
	int age;
	double income;
	double premium;
	int tenure;
	double investment;
	Scanner sc1 = new Scanner(System.in);
	
	public String getPremium() {
		if (income >= 300000 && age >= 18) { 
			System.out.println("Please enter the tenure (number) starting minimum 5 years");
			tenure = sc1.nextInt();
			System.out.println("Please enter the total investment minimum 100000");
			investment = sc1.nextDouble();
			System.out.println("Calculating Premium..");
			premium = investment/(tenure*12);
			return "GrowthInvesto \n[gInvestId=" +gInvestId +"]\n[age=" + age +"]\n[income=" +income +"]\n[premium=" + premium + " per month]";
		}
		else if (income >= 300000 && age < 18) {
			return "GrowthInvesto \n[gInvestId=" +gInvestId +"]\n[age=" + age +"]\n[income=" +income +"]\n[premium= failed to generated premium due to age restriction]";
		}
		else if (income < 300000 && age >= 18) {
			return "GrowthInvesto \n[gInvestId=" +gInvestId +"]\n[age=" + age +"]\n[income=" +income +"]\n[premium=failed to generated premium due to income restriction]";
		}
		else {
			return "GrowthInvesto \n[gInvestId=" +gInvestId +"]\n[age=" + age +"]\n[income=" +income +"]\n[premium=failed to generated premium due to age & income restrictions]";
		}
}



	public GrowthInvesto(int gInvestId, String name, int age, double income) {
		super();
		this.gInvestId = gInvestId;
		this.name = name;
		this.age = age;
		this.income = income;
	}
	
	
	
	
	
	
	
	
}
