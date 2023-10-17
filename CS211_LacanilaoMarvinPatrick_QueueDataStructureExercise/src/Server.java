import java.util.Random;

/**
 * The `Server` class represents a server in a queue system that serves clients.
  @author Lacanilao, Marvin Patrick D.
  @activity Midterm Laboratory Exercise 4
  @classcode 9342 - CS 211 Data Structures
 */
public class Server {
    private int id;
    private Client client;
    private double meanServiceTime;
    private int serviceTime;
    private int startServiceTime;
    private int stopServiceTime;
    private Random randomNumberGenerator;

    /**
     * Constructs an idle server with a default ID of 1.
     */
    public Server() {
        id = 1;
        client = null;
    }

    /**
     * Constructs a server with a specified ID, serving a client, mean service time, and starting service time.
     *
     * @param id           The unique ID of the server.
     * @param client       The client being served.
     * @param mean         The mean service time for the server.
     * @param time         The starting service time.
     */
    public Server(int id, Client client, double mean, int time) {
        randomNumberGenerator = new Random();
        this.startServiceTime = time;
        this.id = id;
        this.client = client;
        this.meanServiceTime = mean;
        this.serviceTime = randomNumberGenerator.nextInt((int) Math.ceil(mean));
        this.stopServiceTime = startServiceTime + serviceTime;
    }

    // Setter methods

    /**
     * Sets the ID of the server.
     *
     * @param id The new ID to set for the server.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Sets the client that the server is serving.
     *
     * @param client The client to be served by the server.
     */
    public void setClient(Client client) {
        this.client = client;
    }

    /**
     * Sets the mean service time for the server.
     *
     * @param mean The mean service time to set for the server.
     */
    public void setMeanServiceTime(double mean) {
        this.meanServiceTime = mean;
    }

    /**
     * Sets the service time for the server.
     *
     * @param t The service time to set for the server.
     */
    public void setServiceTime(int t) {
        this.serviceTime = t;
    }

    /**
     * Sets the starting service time for the server.
     *
     * @param t The starting service time to set for the server.
     */
    public void setStartServiceTime(int t) {
        this.startServiceTime = t;
    }

    /**
     * Sets the stop service time for the server.
     *
     * @param t The stop service time to set for the server.
     */
    public void setStopServiceTime(int t) {
        this.stopServiceTime = t;
    }

    // Getter methods

    /**
     * Gets the ID of the server.
     *
     * @return The unique ID of the server.
     */
    public int getId() {
        return id;
    }

    /**
     * Gets the client that the server is serving.
     *
     * @return The client currently being served by the server.
     */
    public Client getClient() {
        return client;
    }

    /**
     * Gets the mean service time for the server.
     *
     * @return The mean service time for the server.
     */
    public double getMeanServiceTime() {
        return meanServiceTime;
    }

    /**
     * Gets the current service time for the server.
     *
     * @return The current service time for the server.
     */
    public int getServiceTime() {
        return serviceTime;
    }

    /**
     * Gets the starting service time for the server.
     *
     * @return The starting service time for the server.
     */
    public int getStartServiceTime() {
        return startServiceTime;
    }

    /**
     * Gets the stop service time for the server.
     *
     * @return The stop service time for the server.
     */
    public int getStopServiceTime() {
        return stopServiceTime;
    }

    /**
     * Checks if the server is idle (not serving any client).
     *
     * @return `true` if the server is idle, `false` if it is serving a client.
     */
    public boolean isIdle() {
        return (client == null);
    }

    /**
     * Compares this server to another server based on their `toString` representations.
     *
     * @param another The server to compare to.
     * @return A negative value if this server is "smaller" than the other, zero if they are equal, and a positive
     * value if this server is "larger" than the other.
     */
    public int compareTo(Server another) {
        return this.toString().compareTo(another.toString());
    }

    /**
     * Returns a string representation of the server in the format "S{id}".
     *
     * @return A string representation of the server.
     */
    public String toString() {
        return "S" + id;
    }
}
