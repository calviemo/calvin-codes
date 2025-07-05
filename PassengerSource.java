java
public class PassengerSource {

    private Company company;

    public PassengerSource(Company company) {
        this.company = company;
    }

    // You would add methods here to simulate receiving
    // passenger requests and passing them to the Company.
    // For example:

    public void receiveRequest(String pickupLocation, String destination, int numberOfPassengers) {
        // Create a PassengerRequest object
        PassengerRequest request = new PassengerRequest(pickupLocation, destination, numberOfPassengers);

        // Pass the request to the Company for handling
        company.handleRequest(request);
    }

