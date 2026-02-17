
public interface EmpWageComputation {

    void addCompanyEmpWage(String company, int wagePerHour, int maxWorkingDays, int maxWorkingHours);

    void computeEmpWage();

    int getTotalWage(String company);
}
