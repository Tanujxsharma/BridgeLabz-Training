package streamApi;
import java.util.*;
import java.util.stream.Collectors;
public class InsuranceClaim {

	public static void main(String[] args) {
		List<Insurance> list = new ArrayList<>();
		list.stream().collect(Collectors.groupingBy(Insurance::getInsuranceType , Collectors.averagingDouble(Insurance::getInsuranceAmount)));
		
		

	}

}
