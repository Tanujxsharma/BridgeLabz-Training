package streamApi;

import java.util.*;
public class Sensor {

	    public static void main(String[] args) {

	        List<Double> readings = Arrays.asList(45.2, 72.8, 68.5, 85.1);
	        double threshold = 70.0;

	        readings.stream().filter(r -> r > threshold).forEach(r ->System.out.println("High sensor reading: " + r));
	    }
	}