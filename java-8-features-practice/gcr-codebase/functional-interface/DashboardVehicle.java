public interface DashboardVehicle {

    void displaySpeed();

    default void displayBattery() {
        System.out.println("Battery info not available");
    }
}
