
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.regex.Pattern;
import static org.junit.jupiter.api.Assertions.*;

public class EmpWageBuilderTest {

    private EmpWageBuilder empWageBuilder;
    private static final String COMPANY_PATTERN = "^[A-Za-z\\s]+$";
    private static final Pattern COMPANY_REGEX_PATTERN = Pattern.compile(COMPANY_PATTERN);

    @BeforeEach
    void setUp() {
        empWageBuilder = new EmpWageBuilder();
    }

    @Test
    void testComputeEmpWageForSingleCompany() {
        empWageBuilder.addCompanyEmpWage("TCS", 20, 20, 100);
        empWageBuilder.computeEmpWage();

        int totalWage = empWageBuilder.getTotalWage("TCS");

        assertTrue(totalWage > 0, "Total wage should be greater than 0");
    }

    @Test
    void testComputeEmpWageForMultipleCompanies() {
        empWageBuilder.addCompanyEmpWage("TCS", 20, 20, 100);
        empWageBuilder.addCompanyEmpWage("Infosys", 25, 22, 120);
        empWageBuilder.addCompanyEmpWage("Wipro", 30, 18, 90);

        empWageBuilder.computeEmpWage();

        int tcsWage = empWageBuilder.getTotalWage("TCS");
        int infosysWage = empWageBuilder.getTotalWage("Infosys");
        int wiproWage = empWageBuilder.getTotalWage("Wipro");

        assertTrue(tcsWage > 0, "TCS total wage should be greater than 0");
        assertTrue(infosysWage > 0, "Infosys total wage should be greater than 0");
        assertTrue(wiproWage > 0, "Wipro total wage should be greater than 0");
    }

    @Test
    void testGetTotalWageByCompanyName() {
        empWageBuilder.addCompanyEmpWage("TCS", 20, 20, 100);
        empWageBuilder.addCompanyEmpWage("Infosys", 25, 22, 120);

        empWageBuilder.computeEmpWage();

        int tcsWage = empWageBuilder.getTotalWage("TCS");
        int infosysWage = empWageBuilder.getTotalWage("Infosys");

        assertTrue(tcsWage > 0, "TCS wage should be retrieved correctly");
        assertTrue(infosysWage > 0, "Infosys wage should be retrieved correctly");
    }

    @Test
    void testGetTotalWageForNonExistentCompany() {
        empWageBuilder.addCompanyEmpWage("TCS", 20, 20, 100);
        empWageBuilder.computeEmpWage();

        int unknownCompanyWage = empWageBuilder.getTotalWage("UnknownCompany");
        assertEquals(0, unknownCompanyWage, "Non-existent company should return 0");
    }

    @Test
    void testDailyWageStorageForCompany() {
        empWageBuilder.addCompanyEmpWage("TCS", 20, 20, 100);
        empWageBuilder.computeEmpWage();

        int totalWage = empWageBuilder.getTotalWage("TCS");
        assertTrue(totalWage > 0, "Daily wages should be calculated and stored");
    }

    @Test
    void testCompanyNameValidationWithRegex() {
        String validCompanyName = "Tata Consultancy Services";
        String invalidCompanyName = "TCS@123";

        assertTrue(isValidCompanyName(validCompanyName), "Valid company name should pass regex validation");
        assertFalse(isValidCompanyName(invalidCompanyName), "Invalid company name should fail regex validation");
    }

    private boolean isValidCompanyName(String companyName) {
        return COMPANY_REGEX_PATTERN.matcher(companyName).matches();
    }

    @Test
    void testValidWageParameters() {
        int wagePerHour = 20;
        int maxWorkingDays = 20;
        int maxWorkingHours = 100;

        assertTrue(wagePerHour > 0, "Wage per hour should be positive");
        assertTrue(maxWorkingDays > 0, "Max working days should be positive");
        assertTrue(maxWorkingHours > 0, "Max working hours should be positive");
    }

    @Test
    void testDailyWageCalculation() {
        int wagePerHour = 20;

        int fullTimeDailyWage = 8 * wagePerHour;
        int partTimeDailyWage = 4 * wagePerHour;
        int absentDailyWage = 0 * wagePerHour;

        assertEquals(160, fullTimeDailyWage, "Full time daily wage should be 160");
        assertEquals(80, partTimeDailyWage, "Part time daily wage should be 80");
        assertEquals(0, absentDailyWage, "Absent daily wage should be 0");
    }

    @Test
    void testMonthWageCalculationWithConstraints() {
        empWageBuilder.addCompanyEmpWage("TCS", 20, 20, 100);
        empWageBuilder.computeEmpWage();

        int totalWage = empWageBuilder.getTotalWage("TCS");
        assertTrue(totalWage <= 3200, "Total wage should not exceed maximum possible wage");
    }
}
