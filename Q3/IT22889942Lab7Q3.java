import java.util.Scanner;

public class IT22889942Lab7Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int customer = 1;
        while (customer <= 5) {
            System.out.println("Customer " + customer);

            System.out.print("Enter total bill amount: ");
            double bill = input.nextDouble();

            System.out.print("Enter mode of payment (C for cash, O for other): ");
            char mode = input.next().charAt(0);

            // Validate payment mode FIRST
            if (mode != 'C' && mode != 'c' && mode != 'O' && mode != 'o') {
                System.out.println("Payment Mode is Not Valid");
                System.out.println();
                customer++;   // move to next customer
                continue;
            }

            if (mode == 'C' || mode == 'c') {
                double discount = bill * 0.05;
                double amountToPay = bill - discount;
                System.out.println("Discount is : " + discount);
                System.out.println("Amount to be paid: " + amountToPay);
            } else {
                System.out.println("No discount applicable");
                System.out.println("Amount to be paid: " + bill);
            }

            System.out.println();
            customer++;
        }

        input.close();
    }
}