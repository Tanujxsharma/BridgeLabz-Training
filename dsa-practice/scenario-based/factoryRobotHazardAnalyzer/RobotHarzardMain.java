package factoryRobotHazardAnalyzer;
import java.util.*;
public class RobotHarzardMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Arm Precision (0.0 - 1.0):");
		double armPrecision = sc.nextDouble();
		System.out.println("Enter Worker Density (1 - 20):");
		int workerDensity = sc.nextInt();
		System.out.println("Enter Machinery State (Worn/Faulty/Critical):");
		String machineryState = sc.next();
		
		RobotHazardAuditor rh = new RobotHazardAuditor();
		try {
		double result = rh.CalculateHazardRisk(armPrecision, workerDensity, machineryState);
		System.out.println("Robot Hazard Risk Score:"+ result );
		}
		catch(Exception e ) {
			System.out.println(e.getMessage());
		}
	}

}
