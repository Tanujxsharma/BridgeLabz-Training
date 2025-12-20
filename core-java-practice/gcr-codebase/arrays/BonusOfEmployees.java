import java.util.Scanner;

public class BonusOfEmployees {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Arrays to store data of 10 employees
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Input loop with validation
        for (int i = 0; i < 10; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));

            System.out.print("Enter Salary: ");
            double sal = sc.nextDouble();

            System.out.print("Enter Years of Service: ");
            double years = sc.nextDouble();

            // Validation
            if (sal <= 0 || years < 0) {
                System.out.println("Invalid input! Salary must be > 0 and years >= 0");
                i--; // decrement counter to re-enter data
                continue;
            }

            salary[i] = sal;
            yearsOfService[i] = years;
        }

        // Calculation loop
        for (int i = 0; i < 10; i++) {

            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("Total Old Salary  :"+totalOldSalary);
        System.out.println("Total Bonus Paid  :" + totalBonus);
        System.out.println("Total New Salary  :" + totalNewSalary);

    }
}
