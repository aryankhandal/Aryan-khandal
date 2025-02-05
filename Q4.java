import java.util.* ;
public class Q4 {
    public static void main(String[] args) {
        System.out.print("Enter a Number : ");
        // Scanner class to take user input
        Scanner sc = new Scanner(System.in) ;
        // Taking input from user
        double num1 =sc.nextDouble() ;
        if(num1>0){
            // If the number is greater than 0
            System.out.println("The Number is Positive");
            // Printing the number is positive
        }
        else if(num1==0){
            // If the number is equal to 0
            System.out.println("The Number is Zero");
            // Printing the number is zero
        }
        // If the number is less than 0
        else{
            // Printing the number is negative
            System.out.println("The Number is Negative");
        }
    }
}