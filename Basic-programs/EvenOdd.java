import java.util.Scanner;
	public class EvenOdd{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			int n;
			System.out.println("enter the number");
			n = sc.nextInt();
			if(n<=0){
				System.out.println("enter the natural number");
			}else{
				for(int i=1;i<=n;i++){
					if(i%2==0){
						System.out.println(i + " is Even");
					}else{
						System.out.println(i + " is odd");
	                }
	}}}}