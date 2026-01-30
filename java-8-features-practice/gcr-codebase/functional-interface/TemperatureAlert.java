import java.util.function.Predicate;

public class TemperatureAlert {

    public static void main(String[] args) {

        Predicate<Double> highTemp = temp -> temp > 40;

        System.out.println(highTemp.test(35.5));
        System.out.println(highTemp.test(45.0));
    }
}
