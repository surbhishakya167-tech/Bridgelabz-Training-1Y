import java.util.Scanner;
public class YoungestFriend{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int Amarage,Akbarage,Anthonyage;
		int Amarheight,Akbarheight,Anthonyheight;
		
		System.out.println("Enter Amar's age");
		Amarage = sc.nextInt();
		System.out.println("Enter Akbar's age");
		Akbarage = sc.nextInt();
		System.out.println("Enter Anthony's age");
		Anthonyage = sc.nextInt();
		if(Amarage<=Akbarage && Amarage<=Anthonyage){
			System.out.println("Amar is youngest");
		}else if(Akbarage<=Amarage && Akbarage<=Anthonyage){
			System.out.println("Akbar is youngest");
		}else{
			System.out.println("Anthony is youngest");
		}
		
		
		System.out.println("Enter Amar's height");
		Amarheight = sc.nextInt();
		System.out.println("Enter Akbar's height");
		Akbarheight = sc.nextInt();
		System.out.println("Enter Anthony's height");
		Anthonyheight = sc.nextInt();
		if(Amarheight>=Akbarheight && Amarheight>=Anthonyheight){
			System.out.println("Amar is tallest");
		}else if(Akbarheight>=Amarheight && Akbarheight>=Anthonyheight){
			System.out.println("Akbar is tallest");
		}else{
			System.out.println("Anthony is tallest");
		}
}}