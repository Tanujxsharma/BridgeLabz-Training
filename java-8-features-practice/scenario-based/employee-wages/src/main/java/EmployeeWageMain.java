
public class EmployeeWageMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
        System.out.println("START");
        System.out.println();

        EmpWageComputation empWageBuilder = new EmpWageBuilder();

        empWageBuilder.addCompanyEmpWage("TCS", 20, 20, 100);
        empWageBuilder.addCompanyEmpWage("Infosys", 25, 22, 120);
        empWageBuilder.addCompanyEmpWage("Wipro", 30, 18, 90);

        empWageBuilder.computeEmpWage();

        System.out.println("Queried Total Wage for TCS: "
                + empWageBuilder.getTotalWage("TCS"));
    }
}
