import java.util.Scanner;

public class LaunchEH {
    public static void main(String[] args) {
        System.out.println("Connect Established:");
        Scanner scan = new Scanner(System.in);

        try{
            System.out.println("Enter the value of numerator");
            int n = scan.nextInt();
            System.out.println("Enter the value of denominator");
            int d = scan.nextInt();

            int res = n/d;
            System.out.println(res);

            System.out.println("Enter the size of array:");
            int size = scan.nextInt();
            int [] arr = new int[size];

            System.out.println("Enter the index for adding the value");
            int index = scan.nextInt();

            System.out.println("Enter the value for the given index");
            int value = scan.nextInt();
            arr[index]=value;

            System.out.println("Value added:");

        }catch(ArithmeticException e){
            System.out.println("The divisible can't be zero");
            
        }catch(ArrayIndexOutOfBoundsException a){
            System.out.println("Index not found");
        }
        catch(NegativeArraySizeException n){
            System.out.println("Array size can't be negative");
        }catch(Exception e){
            System.out.print(e);
        }
        finally{
            System.out.println("Connection closed:");
        }
    }
}
