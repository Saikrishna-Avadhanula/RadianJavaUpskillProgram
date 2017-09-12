
public interface InvestoUtils {
void LongTermPlan();
void ShortTermPlan();

default void getQuote(int tenure, double salary, float interestPercent){
	int temp_tenure = tenure;
	double temp_salary = salary;
	double premium,total_return;
	
	premium = (temp_salary/12)*(20/100)*temp_tenure; 
	total_return = premium * (interestPercent/100);
	
	System.out.println("The monthly premium will be: "+premium+"\nTotal return will be: "+total_return);
	
}
}
