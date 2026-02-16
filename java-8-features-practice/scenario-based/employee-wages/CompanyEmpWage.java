
import java.util.ArrayList;
import java.util.List;

public class CompanyEmpWage {

    private String company;
    private int wagePerHour;
    private int maxWorkingDays;
    private int maxWorkingHours;
    private int totalEmpWage;
    private List<Integer> dailyWages;

    public CompanyEmpWage(String company, int wagePerHour, int maxWorkingDays, int maxWorkingHours) {
        this.company = company;
        this.wagePerHour = wagePerHour;
        this.maxWorkingDays = maxWorkingDays;
        this.maxWorkingHours = maxWorkingHours;
        this.dailyWages = new ArrayList<>();
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

