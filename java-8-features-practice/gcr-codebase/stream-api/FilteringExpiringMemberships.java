package streamApi;
import java.util.*;
public class FilteringExpiringMemberships {
	public static void main(String [] args) {
		List <GymMembership> list = new ArrayList<>();
		list.stream().filter(x->x.dayLeft<=30);
	}
}
