package aeroVigil;

public class FlightUtil    {
	public boolean validateFlightNumber(String flightNumber)throws InvalidFlightException  {
			if(flightNumber.matches("^FL-[1-9][0-9]{3}$")) {
				return true;
			}
			else {
				throw new InvalidFlightException("The flight number "+flightNumber+" is invalid");
			}
	}
	public boolean validateFlightName(String flightName) throws InvalidFlightException{
		if(flightName.equalsIgnoreCase("SpiceJet")|| flightName.equalsIgnoreCase("Vistara")||flightName.equalsIgnoreCase("IndiGO")||	flightName.equalsIgnoreCase("Air Arabia")) {
			return true;
		}
		else {
			throw new InvalidFlightException("The flight name "+flightName+" is invalid ");
		}
	}
	public boolean validatePassengerCount(int passengerCount, String flightName) throws InvalidFlightException{
		if(flightName.equalsIgnoreCase("SpiceJet")) {
			if(passengerCount<396&& passengerCount>=0) {
				return true;
			}
			else {
				throw new InvalidFlightException("The passenger count "+passengerCount+"is invalid for "+flightName);
			}
		}
		else if(flightName.equalsIgnoreCase("Vistara")){
			if(passengerCount<615 && passengerCount>=0) {
				return true;
			}
			else {
				throw new InvalidFlightException("The passenger count "+passengerCount+"is invalid for "+flightName);
			}		}
		else if(flightName.equalsIgnoreCase("IndiGO")) {
			if(passengerCount<230 && passengerCount>=0) {
				return true;
			}
			else {
				throw new InvalidFlightException("The passenger count "+passengerCount+"is invalid for "+flightName);
			}
		}
		else if(flightName.equalsIgnoreCase("Air Arabia")) {
			if(passengerCount<130 && passengerCount>=0) {
				return true;
			}
			else {
				throw new InvalidFlightException("The passenger count "+passengerCount+"is invalid for "+flightName);
			}
		}
		else {
			throw new InvalidFlightException("The passenger count "+passengerCount+"is invalid for "+flightName);
		}
	}
	public double calculateFuelToFillTank(String flightName, double currentFuelLevel) throws InvalidFlightException {
		
		if(flightName.equalsIgnoreCase("SpiceJet")) {
			if(currentFuelLevel<200000&& currentFuelLevel>=0) {
				return 200000-currentFuelLevel;
			}
			else {
				throw new InvalidFlightException("Invalid fuel level for "+flightName);
			}
		}
		else if(flightName.equalsIgnoreCase("Vistara")){
			if(currentFuelLevel<300000&& currentFuelLevel>=0) {
				return 300000-currentFuelLevel;
			}

			else {
				throw new InvalidFlightException("Invalid fuel level for "+flightName);
			}		}
		else if(flightName.equalsIgnoreCase("IndiGO")) {
			if(currentFuelLevel<250000&& currentFuelLevel>=0) {
				return 250000-currentFuelLevel;
			}
			else {
				throw new InvalidFlightException("Invalid fuel level for "+flightName);
			}
		}
		else if(flightName.equalsIgnoreCase("Air Arabia")) {
			if(currentFuelLevel<150000&& currentFuelLevel>=0) {
				return 150000-currentFuelLevel;
			}
			else {
				throw new InvalidFlightException("Invalid fuel level for "+flightName);
			}
		}
		else {
			throw new InvalidFlightException("Invalid fuel level for "+flightName);
		}
	}
}
