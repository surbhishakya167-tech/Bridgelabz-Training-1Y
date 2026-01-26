import java.util.Scanner;
public class PowerOfNum{
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
             for (int i = 1; i <= power; i++) {
                result = result*number;
            }
            System.out.println(result);
        }
}}

