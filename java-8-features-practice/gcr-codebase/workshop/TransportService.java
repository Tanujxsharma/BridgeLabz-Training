package workshop;
public interface TransportService {

    double getBaseFare();   // numeric → for sorting

    default void printServiceDetails() {
        System.out.println(
            getClass().getSimpleName() + " | Base Fare: " + getBaseFare()
        );
    }
}
