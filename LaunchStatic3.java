import java.util.Scanner;

class Loan {
    float pa;
    float td;
    float si;
    static float roi;

    static {
        roi = 2.5f;
    }

    void getInput() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter loan amount that you want = ");
        pa = sc.nextFloat();
	System.out.println();
        System.out.print("Enter the time duration in months = ");
        td = sc.nextFloat();
	System.out.println();
    }

    void calculate() {
        si = (pa * (td / 12) * roi) / 100;
    }

    void display() {
        System.out.println("Your simple interest = " + si);
    }
}

public class LaunchStatic3 {
    public static void main(String args[]) {

        Loan l1 = new Loan();

        l1.getInput();
        l1.calculate();
        l1.display();
    }
}