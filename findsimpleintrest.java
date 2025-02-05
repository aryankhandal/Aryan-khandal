import java.util.Scanner;

public class findsimpleintrest {
public static void main(String[] args) {
    //Creating object of Scanner class
    Scanner sc=new Scanner(System.in);
    //Input of Principle Amount, Rate Of Interest and Tenure from user
    System.out.println("Enter The Principle Amount:");
    double Pri=sc.nextDouble();
    Scanner sn= new Scanner(System.in);
    System.out.println("Enter The Rate Of Intrerst:");
    double Rat =sn.nextDouble();
    Scanner sp= new Scanner (System.in);
    System.out.println("Enter the Tenure:");
    //Formula of Simple Interest
    double Ten= sp.nextDouble();
    double SimpleIntrest = (Pri*Rat*Ten/100);
    System.out.println("Smiple Interst Is:"+SimpleIntrest);

}
}