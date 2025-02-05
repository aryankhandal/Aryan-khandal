public class Divideby6and9 {
    public static void main(String[] args) {
        int sum=0;
        for (int number=10; number<=950; number++)
        {
            if ( number%6==0 && number%9==0)
            {
                sum=sum+number;
            }
        }
        System.out.println("Sum of no from 10 to 950 is :"+sum);
    }
}