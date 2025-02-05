import java.util.* ;

public class greatestof3 {
    public static void main(String[] args) {
        System.out.print("Enter 3 Numbers : ");
        Scanner sc = new Scanner(System.in) ;
        double num1 =sc.nextDouble() ;
        double num2 =sc.nextDouble() ;
        double num3 =sc.nextDouble() ;
        if(num1>num2 && num1>num3){
            System.out.println("1st Number is the Largest");
        }
        else if(num2>num1 && num2>num3){
            System.out.println("2nd Number is the Largest");
        }
        else{
            System.out.println("3rd Number is the Largest");
        }
    }

    
}
