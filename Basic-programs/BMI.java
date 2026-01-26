import java.util.Scanner;
public class BMI{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		double weight,heightCm,heightMeter;
        System.out.print("Enter weight in kg: ");
        weight = sc.nextDouble();
        System.out.print("Enter height in cm: ");
        heightCm = sc.nextDouble();
		
        heightMeter = heightCm / 100;
		
		double BMI;
        BMI = weight / (heightCm * heightCm);
		System.out.println("BMI = " + BMI);

        if (BMI<18.5){
            System.out.println("Weight Status: Underweight");
        }
        else if (BMI>=18.5 && BMI<25){
            System.out.println("Weight Status: Normal");
        }
        else if (BMI>=25 && BMI<40){
            System.out.println("Weight Status: Overweight");
        }else{
            System.out.println("Weight Status: Obese");
        }
    }
}
