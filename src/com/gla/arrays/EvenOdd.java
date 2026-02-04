import java.util.Scanner;
public class EvenOdd{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter number");
            arr[i] = sc.nextInt();
            if (arr[i] > 0) {
                if (arr[i] % 2 == 0)
                    System.out.println("Positive Even");
                else
                    System.out.println("Positive Odd");
            }
            else if (arr[i] < 0)
                System.out.println("Negative");
            else
                System.out.println("Zero");
        }

        if (arr[0] == arr[4])
            System.out.println("First and Last are Equal");
        else if (arr[0] > arr[4])
            System.out.println("First is Greater");
        else
            System.out.println("First is Smaller");
    }
}
