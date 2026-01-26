import java.util.Scanner;
public class SpringSeason{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int month,day;
		System.out.println("enter day");
		day=sc.nextInt();
		System.out.println("enter month");
		month=sc.nextInt();
		if((month==3 && day>=20) || (month==4) || (month==5) || (month==6 && day<=20)){
			System.out.println("Its a Spring Season");
		}else{
			System.out.println("Not a Spring Season");
}
}}
		  
	