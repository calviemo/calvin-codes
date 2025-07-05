java
import java.util.Random;

public class PassengerSource {

    private Company company;
    private Random random = new Random();

    public PassengerSource(Company company) {
        this.company = company;
    }

    public boolean requestPickup() {
        // First, we'll create a new passenger
        Passenger passenger = new Passenger();

        // Let's generate some random coordinates for the pickup location
        int pickupX = random.nextInt(101); // Coordinates from 0 to 100
        int pickupY = random.nextInt(101);
        Location pickupLocation = new Location(pickupX, pickupY);

        // And now, random coordinates for the destination
        int destinationX = random.nextInt(101);
        int destinationY = random.nextInt(101);
        Location destination = new Location(destinationX, destinationY);

        // Now, let's ask the company to schedule a vehicle for this passenger
        boolean pickupScheduled = company.scheduleVehicle(passenger, pickupLocation, destination);

        // Finally, we'll return whether the pickup was successfully scheduled
        return pickupScheduled;
    }
