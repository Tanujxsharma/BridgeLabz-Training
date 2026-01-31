package streamApi;
import java.util.*;
public class HospitalDoctor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Doctor> list = new ArrayList<>();
		list.add(new Doctor("Dr. Sharma", "Cardiology", true));
        list.add(new Doctor("Dr. Mehta", "Neurology", false));
        list.add(new Doctor("Dr. Rao", "Orthopedics", true));
        list.add(new Doctor("Dr. Khan", "Dermatology", true));
		
		list.stream().filter(x-> x.availableOnWeekend).sorted(Comparator.comparing(Doctor::getSpecialty));
	}

}
