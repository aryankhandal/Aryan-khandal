import java.util.Scanner;
public class areaoftriangle {
        
        //Main Function
        public static void main(String[] args) {
            //Input of height and base from user
            Scanner sc = new Scanner (System.in);
            System.out.println("Enter The Base Of The Triangle:");
            double base = sc.nextDouble();
            Scanner sn = new Scanner (System.in);
            System.out.println("Enter The Height Of Triangle:");
            double height = sn.nextDouble();
            //Formula of Area Of Triangle
            double area = 0.5*base*height;
            System.out.println("Area Of Triangle Is:" +area);
    
        }
    }