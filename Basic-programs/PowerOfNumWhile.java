import java.util.Scanner;
public class PowerOfNumWhile{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int number;
        System.out.println("Enter the number");
        number = sc.nextInt();
		int power;
        System.out.println("Enter the power");
        power = sc.nextInt();

        if (number <= 0 || power <= 0){
            System.out.println("enter positive integers");
        }else{
            int result = 1;
			int counter = 0;
            while(counter<power){
                result = result*number;
				counter++;
            }
            System.out.println(result);
        }
}}

