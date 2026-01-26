import java.util.Scanner;
public class FactorialFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
		System.out.println("Enter a number");
        n = sc.nextInt();
        if (n <= 0) {
            System.out.println("enter a positive integer");
        } else {
            int fact = 1;
            for(int i=1;i<=n;i++){
			fact=fact*i;
            }
            System.out.println("Factorial = " + fact);
        }
}}
