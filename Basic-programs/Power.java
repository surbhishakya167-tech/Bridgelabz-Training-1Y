import java.util.Scanner;
public class Power{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int b,e;
		double result;
		System.out.println("input base");
		b = sc.nextInt();
		System.out.println("input exponent");
		e = sc.nextInt();
		result = Math.pow(b,e);
		System.out.println("base raised to the exponent ="+result);
}}
