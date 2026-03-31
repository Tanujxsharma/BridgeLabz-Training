package streamApi;

public class Insurance {
	String insuranceType;
	double insuranceAmount;
	Insurance(String insuranceType,double insuranceAmount){
		this.insuranceAmount = insuranceAmount;
		this.insuranceType = insuranceType;
	}
	public double getInsuranceAmount() {
		return insuranceAmount;
	}
	public String getInsuranceType() {
		return insuranceType;
	}
	
}
