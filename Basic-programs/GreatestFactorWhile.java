import java.util.Scanner;
public class GreatestFactorWhile{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number;  
		System.out.println("Enter the number");
		number = sc.nextInt();
		
		int greatestfactor=1;
		int counter = number-1;

		while(counter >= 1)
		{
			 if(number%counter==0){
				 greatestfactor=counter;
				 break;
		}
		counter--;
		}
		System.out.println("Greatest factor (beside itself) =  " +greatestfactor);
}}