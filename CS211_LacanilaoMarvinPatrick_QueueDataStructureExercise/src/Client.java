/**
 * The `Client` class represents a client in a service-oriented system. Each client has an ID, arrival time,
 * and start service time (optional). Clients can be compared based on their `toString` representations.

  @author Lacanilao, Marvin Patrick D.
  @activity Midterm Laboratory Exercise 4
  @classcode 9342 - CS 211 Data Structures
 */
public class Client implements Comparable<Client> {
    private int id;
    private int arrivalTime;
    private int startServiceTime;

    /**
     * Constructs a new client with the specified ID and arrival time.
     *
     * @param id      The unique ID of the client.
     * @param arrival The arrival time of the client.
     */
    public Client(int id, int arrival) {
        this.id = id;
        this.arrivalTime = arrival;
    }

    /**
     * Constructs a new client with the specified ID, arrival time, and start service time.
     *
     * @param id    The unique ID of the client.
     * @param arrival The arrival time of the client.
     * @param start The start service time of the client.
     */
    public Client(int id, int arrival, int start) {
        this.id = id;
        this.arrivalTime = arrival;
        this.startServiceTime = start;
    }

    /**
     * Gets the ID of the client.
     *
     * @return The unique ID of the client.
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the ID of the client.
     *
     * @param n The new ID to set for the client.
     */
    public void setId(int n) {
        this.id = n;
    }

    /**
     * Gets the arrival time of the client.
     *
     * @return The arrival time of the client.
     */
    public int getArrivalTime() {
        return arrivalTime;
    }

    /**
     * Sets the arrival time of the client.
     *
     * @param t The new arrival time to set for the client.
     */
    public void setArrivalTime(int t) {
        this.arrivalTime = t;
    }

    /**
     * Gets the start service time of the client.
     *
     * @return The start service time of the client (or 0 if not set).
     */
    public int getStartServiceTime() {
        return startServiceTime;
    }

    /**
     * Sets the start service time of the client.
     *
     * @param t The new start service time to set for the client.
     */
    public void setStartServiceTime(int t) {
        this.startServiceTime = t;
    }

    /**
     * Compares this client to another client based on their `toString` representations.
     *
     * @param another The client to compare to.
     * @return A negative value if this client is "smaller" than the other, zero if they are equal, and a positive
     * value if this client is "larger" than the other.
     */
    public int compareTo(Client another) {
        return this.toString().compareTo(another.toString());
    }

    /**
     * Returns a string representation of the client in the format "N{id}(arrivalTime)".
     *
     * @return A string representation of the client.
     */
    public String toString() {
        return "N" + id + "(" + arrivalTime + ")";
    }
}

