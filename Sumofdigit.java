import java.util.Scanner;

public class Sumofdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int sum = 0;
    
            while (n != 0) {
                sum += n % 10;
                n /= 10;
            }
            System.out.println("sum of the digits is: " + sum);
        } else {
            System.out.println("Invalid input. Please enter  valid integer.");
        }
        sc.close();
    }
}