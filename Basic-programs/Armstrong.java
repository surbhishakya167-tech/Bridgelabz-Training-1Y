import java.util.Scanner;
public class Armstrong{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number,sum=0;
        System.out.print("Enter a number: ");
        number = sc.nextInt();
                
        int originalNumber = number;
        while(originalNumber != 0) {			
            int digit = originalNumber % 10;
            sum = sum + (digit * digit * digit);
            originalNumber = originalNumber / 10;
        }
        if(sum == number){
            System.out.println("The number is an Armstrong Number");
        }else{
            System.out.println("The number is not an Armstrong Number");
        }
    }
}
