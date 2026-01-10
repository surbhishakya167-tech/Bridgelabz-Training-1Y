import java.util.Scanner;
public class KilometerMiles{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int k;
		double m;
		System.out.println("input Kilometers");
		k = sc.nextInt();
		m = k*0.621371;
		System.out.println("miles="+m);
}}
