public class ElectricCar implements DashboardVehicle {

    public void displaySpeed() {
        System.out.println("Speed: 80 km/h");
    }

    @Override
    public void displayBattery() {
        System.out.println("Battery: 75%");
    }
}
