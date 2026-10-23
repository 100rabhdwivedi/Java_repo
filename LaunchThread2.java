import java.util.Scanner;

class Alpha2 implements Runnable {

    @Override
    synchronized public void run() {

        try {
            // String threadName = Thread.currentThread().getName();
            // if (threadName.equals("Bank")) {
                verifyAcc();
            // } else if (threadName.equals("Print")) {
                printing();
            // } else {
                generalFact();
            // }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void verifyAcc() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your username:");
        String name = sc.nextLine();

        System.out.println("Enter your pin:");
        int pin = sc.nextInt();

        System.out.println("Now you can perform your work");
    }

    public void printing() throws InterruptedException {

        System.out.println("Star printing process has started:");

        String star = "";

        for (int i = 0; i < 3; i++) {
            star += "*";
            System.out.println(star);

            Thread.sleep(3000);
        }
    }

    public void generalFact() throws InterruptedException {

        for (int i = 0; i < 3; i++) {
            System.out.println("General fact");

            Thread.sleep(2000);
        }
    }
}

public class LaunchThread2 {

    public static void main(String args[]) throws InterruptedException {

        System.out.println("Execution of main");

        Alpha2 a = new Alpha2();

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(a);
        Thread t3 = new Thread(a);

        t1.setName("Bank");
        t2.setName("Print");
        t3.setName("Fact");

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("Termination of main");
    }
}