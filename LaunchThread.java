import java.util.Scanner;

class Alpha implements Runnable {

    @Override
    public void run() {
        verifyAcc();
    }

    public void verifyAcc() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your username:");
        String name = sc.nextLine();

        System.out.println("Enter your pin:");
        int pin = sc.nextInt();

        System.out.println("Now you can perform your work");

        // Don't close Scanner here because it closes System.in
    }
}

class Beta implements Runnable {

    @Override
    public void run() {
        try {
            printing();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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
}

class Gamma implements Runnable {

    @Override
    public void run() {
        try {
            generalFact();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void generalFact() throws InterruptedException {

        for (int i = 0; i < 3; i++) {
            System.out.println("General fact");

            Thread.sleep(2000);
        }
    }
}

public class LaunchThread {

    public static void main(String args[])throws InterruptedException {
        System.out.println("Excecution of main ");
        Alpha a = new Alpha();
        Beta b = new Beta();
        Gamma g = new Gamma();

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);
        Thread t3 = new Thread(g);

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        t3.start();
        t3.join();
        System.out.println("Termination of main ");

    }
}