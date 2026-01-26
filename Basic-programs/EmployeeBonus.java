import java.util.Scanner;
public class EmployeeBonus{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double salary;
		int years;
		System.out.println("Enter salary");
		salary = sc.nextDouble();
		System.out.println("Enter years of service");
		years = sc.nextInt();
		if(years>5){
			double bonus = salary*0.05;
			System.out.println("Bonus amount =  "+bonus);
	}else{
		System.out.println("No bonus");
	}
}}