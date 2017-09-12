import java.util.Date;
import java.util.Scanner;

public class CadidateDetail {
	
	private String cad_Name;
	private String cad_Dob;
	private int cad_Age;
	private String cad_SNN;
	private Double cad_Income;
	
	public String getCad_Name() {
		return cad_Name;
	}
	public void setCad_Name(String cad_Name) {
		this.cad_Name = cad_Name;
	}
	public String getCad_Dob() {
		return cad_Dob;
	}
	public void setCad_Dob(String cad_Dob) {
		this.cad_Dob = cad_Dob;
	}
	public int getCad_Age() {
		
		return cad_Age;
	}
	public void setCad_Age(int cad_Age) {
		this.cad_Age = cad_Age;
	}
	public String getCad_SNN() {
		return cad_SNN;
	}
	public void setCad_SNN(String cad_SNN) {
		this.cad_SNN = cad_SNN;
	}
	public Double getCad_Income() {
		return cad_Income;
	}
	public void setCad_Income(Double cad_Income) {
		this.cad_Income = cad_Income;
	}
	public CadidateDetail(String cad_Name, String cad_Dob, int cad_Age, String cad_SNN, Double cad_Income) {
		super();
		this.cad_Name = cad_Name;
		this.cad_Dob = cad_Dob;
		this.cad_Age = cad_Age;
		this.cad_SNN = cad_SNN;
		this.cad_Income = cad_Income;
	}
	public CadidateDetail() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Candidate Name");
			this.cad_Name = sc.nextLine();
			System.out.println("Enter Date of Birth MM-DD-YYYY");
			this.cad_Dob = sc.nextLine();
			System.out.println("Enter Age");
			this.cad_Age=sc.nextInt();
			System.out.println("Enter SSN");
			this.cad_SNN=sc.next();
			System.out.println("Enter income per year in lakhs");
			this.cad_Income = sc.nextDouble();
			System.out.println("Info successfully added");
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println(e.getMessage());
		}
		
		
	}
}
