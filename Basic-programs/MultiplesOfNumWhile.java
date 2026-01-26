import java.util.Scanner;
public class MultiplesOfNumWhile{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.println("Enter the number");
		number = sc.nextInt();
		if(number<=0 || number>=100){
			System.out.println("enter a positive integer less than 100");
		}else{
			int counter = 100;
			System.out.println("Multiples of " +number+ " below 100");
		    while(counter>=1){
		    if(counter%number==0){
			System.out.println(counter);
		}
		counter--;
}}}}
		