import java.util.Scanner;
public class Factors{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.println("Enter the number");
		number = sc.nextInt();
		if(number<=0){
			System.out.println("Enter a positive integer");
		}else{
			System.out.println("Factors of " +number+ " are");
		    for(int i=1;i<number;i++){
			if(number%i==0){
				System.out.println(i);
			}
}}}}
			