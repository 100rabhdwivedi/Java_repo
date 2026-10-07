import java.util.Scanner;

// Custom Exception
class InputException extends Exception {

    public InputException(String msg) {
        super(msg);
    }
}


// ATM Class
class Atm {

    private int accNo = 1415;
    private int password = 123;

    int acc;
    int pass;


    // Taking input
    void input() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter account number: ");
        acc = scan.nextInt();

        System.out.print("Enter password: ");
        pass = scan.nextInt();
    }


    // Verifying credentials
    void verify() throws InputException {

        if (acc == accNo && pass == password) {

            System.out.println("Login successful!");
            System.out.println("You can withdraw the money.");

        } else {

            throw new InputException("Invalid credentials!");
        }
    }
}


// Bank Class
class Bank {

    void initiate() {

        Atm atm = new Atm();

        // -------- Attempt 1 --------
        try {

            System.out.println("\n----- Attempt 1 -----");

            atm.input();
            atm.verify();

        } catch (InputException e) {


            System.out.println(e.getMessage());


            // -------- Attempt 2 --------
            try {

                System.out.println("\n----- Attempt 2 -----");

                atm.input();
                atm.verify();

            } catch (InputException e2) {

                System.out.println(e2.getMessage());


                // -------- Attempt 3 --------
                try {

                    System.out.println("\n----- Attempt 3 -----");

                    atm.input();
                    atm.verify();

                } catch (InputException e3) {

                    System.out.println(e3.getMessage());
                    System.out.println(
                        "Sorry! You have used all 3 attempts."
                    );
                    System.out.println(
                        "Your account is locked."
                    );
                }
            }
        }catch(Exception err){
            System.out.println(err);
        }
    }

}


// Main Class
public class LaunchEH6 {

    public static void main(String[] args) {

        Bank bank = new Bank();

        bank.initiate();
    }
}