
import java.util.*;

public class EmpWageBuilder implements EmpWageComputation {

    private final List<CompanyEmpWage> companyList = new ArrayList<>();
    private final Random random = new Random();

    @Override
    public void addCompanyEmpWage(String company, int wagePerHour, int maxWorkingDays, int maxWorkingHours) {
        companyList.add(new CompanyEmpWage(company, wagePerHour, maxWorkingDays, maxWorkingHours));
    }

    @Override
    public void computeEmpWage() {

        companyList.forEach(company -> {

            int totalWorkingDays = 0;
            int totalWorkingHours = 0;

            while (totalWorkingDays < company.getMaxWorkingDays()
                    && totalWorkingHours < company.getMaxWorkingHours()) {

                totalWorkingDays++;

                int empCheck = random.nextInt(3);
                int empHours = switch (empCheck) {
                    case 1 ->
                        8;
                    case 2 ->
                        4;
                    default ->
                        0;
                };
                totalWorkingHours += empHours;

                int dailyWage = empHours * company.getWagePerHour();
                company.addDailyWage(dailyWage);
            }

            int totalWage = company.getDailyWages()
                    .stream()
                    .mapToInt(Integer::intValue)
                    .sum();
            company.setTotalEmpWage(totalWage);

            System.out.println("Company: " + company.getCompany());
            System.out.println("Total Wage: " + totalWage);
            System.out.println("Daily Wages: " + company.getDailyWages());
            System.out.println("----------------------------------");
        });
    }

    @Override
    public int getTotalWage(String companyName) {
        return companyList.stream()
                .filter(c -> c.getCompany().equals(companyName))
                .map(CompanyEmpWage::getTotalEmpWage)
                .findFirst()
                .orElse(0);
    }
}
