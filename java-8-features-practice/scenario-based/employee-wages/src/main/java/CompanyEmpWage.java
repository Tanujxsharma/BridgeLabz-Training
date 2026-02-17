
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class CompanyEmpWage {

    private String company;
    private int wagePerHour;
    private int maxWorkingDays;
    private int maxWorkingHours;
    private int totalEmpWage;
    private List<Integer> dailyWages;

    private static final String COMPANY_NAME_PATTERN = "^[A-Za-z\\s]+$";
    private static final Pattern COMPANY_PATTERN = Pattern.compile(COMPANY_NAME_PATTERN);

    public CompanyEmpWage(String company, int wagePerHour, int maxWorkingDays, int maxWorkingHours) {
        if (!isValidCompanyName(company)) {
            throw new IllegalArgumentException("Invalid company name. Company name should contain only alphabets and spaces.");
        }

        this.company = company;
        this.wagePerHour = wagePerHour;
        this.maxWorkingDays = maxWorkingDays;
        this.maxWorkingHours = maxWorkingHours;
        this.dailyWages = new ArrayList<>();
    }

    private boolean isValidCompanyName(String companyName) {
        return companyName != null && !companyName.isEmpty()
                && COMPANY_PATTERN.matcher(companyName).matches();
    }

    public void setTotalEmpWage(int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
    }

    public String getCompany() {
        return company;
    }

    public int getWagePerHour() {
        return wagePerHour;
    }

    public int getMaxWorkingDays() {
        return maxWorkingDays;
    }

    public int getMaxWorkingHours() {
        return maxWorkingHours;
    }

    public int getTotalEmpWage() {
        return totalEmpWage;
    }

    public void addDailyWage(int wage) {
        dailyWages.add(wage);
    }

    public List<Integer> getDailyWages() {
        return dailyWages;
    }
}
