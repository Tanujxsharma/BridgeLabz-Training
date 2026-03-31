public class VolumeOfEarth {
    public static void main(String[] args) {
        int  radius = 6378; // Radius of the Earth in kilometers
        double volumeInKilometer = (4 / 3) * Math.PI * Math.pow(radius, 3); // Calculate volume using the formula 
        double volumeInMiles = volumeInKilometer * 0.239; // Convert volume to cubic miles
        System.out.println("The volume of the Earth in cubic kilometer is: " + volumeInKilometer + " and cubic miles is: " + volumeInMiles); // Print the volume
    }
}