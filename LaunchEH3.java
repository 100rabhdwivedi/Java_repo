import java.util.Scanner;

class Alpha{
    void calc()throws ArithmeticException{
        System.out.println("Connection alpha");
        
            try {
                System.out.println("Enter the value of numerator");
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            System.out.println("Enter the value of denominator");
            int d = scan.nextInt();

            int res = n/d;
            System.out.println(res);

            } catch (ArithmeticException e) {
                System.out.println("Exception in alpha");
                throw e;

            }finally{

                System.out.println("close alpha");
            }
            
        
    }
}

public class LaunchEH3 {
    public static  void main(String args[]){
        System.out.println("Inside main");
        try {
            Alpha a = new Alpha();
            a.calc();
        } catch (ArithmeticException e) {
            System.out.println("Exception handled in main");
        }
        System.out.println("close main");
    }
}
