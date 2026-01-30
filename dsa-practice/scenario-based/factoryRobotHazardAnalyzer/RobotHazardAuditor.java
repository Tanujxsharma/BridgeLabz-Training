package factoryRobotHazardAnalyzer;

public class RobotHazardAuditor {
	public double CalculateHazardRisk(double armPrecision, int workerDensity, String machineryState) throws RobotSafetyException{
		Double machineRiskFactor ;
		if(!armPrecision(armPrecision) ) {
			throw new RobotSafetyException("Error: Arm precision must be 0.0-1.0");
		}
		else if(!workerDensity(workerDensity)) {
			throw new RobotSafetyException("Error: Worker density must be 1-20");
		}
		else if (!machineryState(machineryState)) {
			throw new RobotSafetyException("Error: Unsupported machinery state");
		}
		else {
			if(machineryState.equalsIgnoreCase("Worn")) {
				machineRiskFactor = 1.3;
			}
			else if(machineryState.equalsIgnoreCase("Faulty")){
				machineRiskFactor = 2.0;
			}
			else {
				machineRiskFactor = 3.0;
			}
			return ((1.0 - armPrecision) * 15.0) + (workerDensity * machineRiskFactor);
		}
		
	}
	private  boolean armPrecision(double armPrecision) {
		if(0.0>armPrecision||armPrecision>1.0) {
			return false;
		}
		else {return true;}
	}
	private  boolean workerDensity( int workerDensity ){
		if(workerDensity <1|| workerDensity > 20) {
			return false ;
		}
		else {return true ;}
	}
	private boolean machineryState(String machineryState){
		if(machineryState.equalsIgnoreCase("Worn")|| machineryState.equalsIgnoreCase("Faulty")||machineryState.equalsIgnoreCase("Critical")) {
			return true;
		}
		else {
			return false ;
		}
	}
}
