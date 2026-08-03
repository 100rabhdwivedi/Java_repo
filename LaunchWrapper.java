public class LaunchWrapper {
    public static void main(String[] args) {

        int n1 = 402;
        Integer n2 = Integer.valueOf(n1); // Boxing
        Integer n3 = n1; // Autoboxing

        Integer n4 = Integer.valueOf(10);
        int n5 = n4; // Auto-unboxing
        int n6 = n4.intValue(); // Unboxing

        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
        System.out.println("n3 = " + n3);
        System.out.println("n4 = " + n4);
        System.out.println("n5 = " + n5);
        System.out.println("n6 = " + n6);
    }
}
