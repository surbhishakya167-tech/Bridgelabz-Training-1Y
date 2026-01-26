import java.util.Scanner;
public class Marks{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int physics,chemistry,maths;
		System.out.println("Enter physics marks");
		physics = sc.nextInt();
		System.out.println("Enter chemistry marks");
		chemistry = sc.nextInt();
		System.out.println("Enter maths marks");
		maths = sc.nextInt();
		int total;
		total = physics+chemistry+maths;
		double percentage = total%3.0;
		if(percentage>=80){
			System.out.println("Grade A");
			System.out.println("Remarks: level 4,above agency-normalized standards");
		}else if(percentage>=70){
			System.out.println("Grade B");
			System.out.println("Remarks: level 3,at agency-normalized standards");
		}else if(percentage>=60){
			System.out.println("Grade C");
			System.out.println("Remarks: level 2,below,but approaching agency-normalized standards");
		}else if(percentage>=50){
			System.out.println("Grade D");
			System.out.println("Remarks: level 1,well below agency-normalized standards");
		}else if(percentage>=40){
			System.out.println("Grade E");
			System.out.println("Remarks: level 1-,too below agency-normalized standards");
		}else{
			System.out.println("Grade R");
			System.out.println("Remarks: Remedial standards");
		}
}}
			
		