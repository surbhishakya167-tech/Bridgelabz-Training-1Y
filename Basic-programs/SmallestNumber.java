import java.util.Scanner;
public class SmallestNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	int num1,num2,num3;
	System.out.println("enter the num1");
	num1=sc.nextInt();
	System.out.println("enter the num2");
	num2=sc.nextInt();
	System.out.println("enter the num3");
	num3=sc.nextInt();
	if(num1<num2 && num1<num3){
	System.out.println("Is the first number the smallest?YES");
	}else{
	System.out.println("Is the first number the smallest? NO");
}}}