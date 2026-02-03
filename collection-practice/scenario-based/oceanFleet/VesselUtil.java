package oceanFleet;
import java.util.*;
public class VesselUtil {
	private List<Vessel> vesselList = new ArrayList<>();

	public List<Vessel> getVesselList() {
		return vesselList;
	}

	public void setVesselList(List<Vessel> vesselList) {
		this.vesselList = vesselList;
	}
	public void addVesselPreformance(Vessel vessel) {
		vesselList.add(vessel);
	}
	public Vessel getVesselById(String vesselId) {
		for(Vessel v: vesselList) {
			if(v.vesselId.equals(vesselId)) {
				return v ;
			}
		}
		
		return null;
	}
	public List<Vessel> getHighPreformanceVessels(){
		List<Vessel> list = new ArrayList<>();
		double highestSpeed = vesselList.get(0).averageSpeed;
		for(Vessel v : vesselList) {
			if(v.averageSpeed>highestSpeed) {
				highestSpeed = v.averageSpeed;
			}
		}
		for(Vessel v : vesselList) {
			if(v.averageSpeed == highestSpeed) {
				list.add(v);
			}
		}
		return list;
	}
	
}
