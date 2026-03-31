package annotations;
import java.lang.reflect.*;
public class BugReportUse {
	@BugReport(description = "NullPointerException on login")
    @BugReport(description = "UI alignment issue on dashboard")
    public void fixIssues() {
        System.out.println("Fixing issues...");
    }
	public static void main(String []args) throws Exception{
		Class<?> clazz = BugReportUse.class;
		Method method = clazz.getDeclaredMethod("fixIssues");
		BugReport[] reports = method.getAnnotationsByType(BugReport.class);
		for (BugReport report : reports) {
            System.out.println("Bug: " + report.description());
        }
	}
}
