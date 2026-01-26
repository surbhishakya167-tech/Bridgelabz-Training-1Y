import java.util.Scanner;
public class CountDigits{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number,count=0;
		System.out.println("Enter the number");
		number = sc.nextInt();
		while(number != 0){
			number = number/10;
			count++;
		}
		System.out.println("Number of digits =  "+count);
	}
}	