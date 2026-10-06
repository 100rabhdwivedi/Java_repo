import java.util.Scanner;

class MultiValue {
    int id;
    String name;
    String cls;
}

public class LaunchArray2 {
    public static void main(String[] args) {

        MultiValue[] data = new MultiValue[3];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < data.length; i++) {
            
            data[i] = new MultiValue();
            System.out.print("Enter the id of student: ");
            data[i].id = scan.nextInt();
            scan.nextLine();

            System.out.print("Enter the name of student: ");
            data[i].name = scan.nextLine();

            System.out.print("Enter the value of class: ");
            data[i].cls = scan.nextLine();

            System.out.println();
        }

        // Display data
        for (int i = 0; i < data.length; i++) {
            System.out.println("ID = " + data[i].id);
            System.out.println("Name = " + data[i].name);
            System.out.println("Class = " + data[i].cls);
            System.out.println("-------------------");
        }

        scan.close();
    }
}