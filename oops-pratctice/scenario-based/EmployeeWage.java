import java.util.Random;

public class EmployeeWageComputation {

    // Constants
    static final int IS_PART_TIME = 1;
    static final int IS_FULL_TIME = 2;
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    static final int PART_TIME_HOUR = 4;
    static final int MAX_WORKING_DAYS = 20;
    static final int MAX_WORKING_HOURS = 100;

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
        System.out.println("------------------------------------------------------------");

        Random random = new Random();

        int totalWorkingDays = 0;
        int totalWorkingHours = 0;
        int totalWage = 0;

        // UC 1 to UC 6
        while (totalWorkingDays < MAX_WORKING_DAYS && totalWorkingHours < MAX_WORKING_HOURS) {

            totalWorkingDays++;
            int empCheck = random.nextInt(3);
            int empHours = 0;

            // UC 4: Switch Case
            switch (empCheck) {
                case IS_FULL_TIME:
                    empHours = FULL_DAY_HOUR;
                    System.out.println("Day " + totalWorkingDays + ": Employee is Full Time");
                    break;

                case IS_PART_TIME:
                    empHours = PART_TIME_HOUR;
                    System.out.println("Day " + totalWorkingDays + ": Employee is Part Time");
                    break;

                default:
                    empHours = 0;
                    System.out.println("Day " + totalWorkingDays + ": Employee is Absent");
            }

            totalWorkingHours += empHours;
            int dailyWage = empHours * WAGE_PER_HOUR;
            totalWage += dailyWage;

            System.out.println("Daily Wage: ₹" + dailyWage);
            System.out.println("--------------------------------");
        }

        // UC 5 & UC 6 Result
        System.out.println("Total Working Days: " + totalWorkingDays);
        System.out.println("Total Working Hours: " + totalWorkingHours);
        System.out.println("Total Monthly Wage: ₹" + totalWage);
    }
}