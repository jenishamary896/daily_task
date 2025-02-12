import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;

        for (int i = 2; i <= num; i += 2) {
            sum += i;
        }

        System.out.println("The sum of all even numbers up to " + num + " is: " + sum);
        
        sc.close();
    }
}
