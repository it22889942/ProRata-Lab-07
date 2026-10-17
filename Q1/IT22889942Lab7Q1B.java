import java.util.Scanner;

public class IT22889942Lab7Q1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int student = 1;
        while (student <= 3) {
            System.out.println("Student " + student);
            System.out.print("Enter marks: ");

            double m1 = input.nextDouble();
            double m2 = input.nextDouble();
            double m3 = input.nextDouble();
            double m4 = input.nextDouble();

            double average = (m1 + m2 + m3 + m4) / 4.0;

            String grade;
            if (average >= 75) {
                grade = "Distinction";
            } else if (average >= 50) {
                grade = "Credit";
            } else {
                grade = "Fail";
            }

            System.out.println("Average is : " + average);
            System.out.println("Overall Grade is : " + grade);
            System.out.println();

            student++;
        }

        input.close();
    }
}