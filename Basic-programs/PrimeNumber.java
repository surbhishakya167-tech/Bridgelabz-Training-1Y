import java.util.Scanner;
public class PrimeNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number;
		boolean isprime=true;
		System.out.println("Enter the number");
		number = sc.nextInt();
		if(number<1){
			System.out.println("Enter a prime number");
		}else{
		for(int i=2;i<number;i++){
			if(number%i==0){
			isprime = false;
			break;
			}
		}
	}
		if(isprime){
			System.out.println("this is a prime number");
		}else{
			System.out.println("this is not a prime number");
		}
	}
}	
			
			