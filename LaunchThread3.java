class MyCar1 implements Runnable{
    synchronized public void run(){
        try {
            System.out.println(Thread.currentThread().getName()+"has entered in parking lot");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName()+"has entered into car");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName()+"has started to drive the car");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName()+"has come back and parked the car");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
public class LaunchThread3{
    public static void main(String[] args) throws Exception {
        System.out.println("Inside the main method");
        MyCar1 m = new MyCar1();

        Thread t1 = new Thread(m);
        Thread t2 = new Thread(m);
        Thread t3 = new Thread(m);

        t1.setName("Saurabh");
        t2.setName("Gaurav");
        t3.setName("PPP");

        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();

        System.out.println("Termination of main method");
        

    }
}