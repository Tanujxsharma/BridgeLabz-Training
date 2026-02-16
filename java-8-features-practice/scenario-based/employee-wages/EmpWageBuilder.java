

import java.util.*;
import java.util.stream.*;

public class EmpWageBuilder implements EmpWageComputation {

    private List<CompanyEmpWage> companyList = new ArrayList<>();
    private Random random = new Random();

    @Override
    public void addCompanyEmpWage(String company, int wagePerHour, int maxWorkingDays, int maxWorkingHours) {
        companyList.add(new CompanyEmpWage(company, wagePerHour, maxWorkingDays, maxWorkingHours));
    }

    @Override
    public void computeEmpWage() {

        companyList.forEach(company -> {

            int totalWorkingDays = 0;
            int totalWorkingHours = 0;

            while (totalWorkingDays < company.getMaxWorkingDays() &&
                   totalWorkingHours < company.getMaxWorkingHours()) {

                totalWorkingDays++;

                int empCheck = random.nextInt(3); 

                int empHours = 0;

                switch (empCheck) {   // UC4 Switch Case
                    case 1:
                        empHours = 8;   // Full Time
                        break;
                    case 2:
                        empHours = 4;   // Part Time
                        break;
                    default:
                        empHours = 0;   // Absent
                }

                totalWorkingHours += empHours;

                int dailyWage = empHours * company.getWagePerHour();
                company.addDailyWage(dailyWage);   // UC12 Store Daily Wage
            }

            int totalWage = company.getDailyWages()
                                   .stream()
                                   .mapToInt(Integer::intValue)
                                   .sum();   // Java 8 Stream

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
                .orElse(0);  // Java 8 Optional
    }
}

