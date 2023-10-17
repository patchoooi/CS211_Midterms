
/**
 * A simple queue simulation program that models client arrivals and server service in a queue system.
 *
  @author Lacanilao, Marvin Patrick D.
  @activity Midterm Laboratory Exercise 4
  @classcode 9342 - CS 211 Data Structures
-----------------------------------------------------------------------------------------------------------------
 ALGORITHM:
 1. Initialize a QueueSimulation object.
 2. Run the simulation by calling the run method.
 3. Create random number generators for arrival and service time.
 4. Define simulation parameters: averageInterarrival, simulationTimeDuration, and meanServiceTime.
 5. Initialize the nextArrivalTime and create an empty queue myListOfClients.
 6. Start the client ID from 1 and create a Server object.
 7. Iterate through simulation time from 0 to simulationTimeDuration.
 8. Check if a client arrives at the current time (time == nextArrivalTime).
 9. If a client arrives, add the client to the queue, update next arrival time,
    and display relevant information.
 10. Check if the server is idle and there are clients waiting in the queue.
 11. If the server is idle, assign a client to the server, calculate service time,
     and update server status.
 12. Check if the server has finished serving a client (time == server.getStopServiceTime),
     and update the server status.
 */

import java.util.*;


public class QueueSimulation {
    public static void main(String[] args) {
        QueueSimulation simulation;
        try {
            simulation = new QueueSimulation();
            simulation.run(); // Start the simulation.
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.exit(0);
    }

    /**
     * Runs the queue simulation.
     */
    public void run() {
        Random randomArrivalGenerator = new Random();
        Random randomServiceTimeGenerator = new Random();
        int averageInterarrival = 4;
        int simulationTimeDuration = 50;
        double meanServiceTime = 5;
        int nextArrivalTime = randomArrivalGenerator.nextInt(averageInterarrival);
        Queue<Client> myListOfClients = new LinkedList<Client>();
        int clientId = 1;
        Server server = new Server();

        for (int time = 0; time <= simulationTimeDuration; time += 1) {
            if (time == nextArrivalTime) {
                System.out.println("Client " + clientId + " has arrived at time = " + nextArrivalTime + ".");

                Client newClient = new Client(clientId, nextArrivalTime);
                myListOfClients.add(newClient);

                showList(myListOfClients);
                System.out.println("Number of clients in the list = " + myListOfClients.size());

                clientId += 1;
                nextArrivalTime += 1 + randomArrivalGenerator.nextInt(averageInterarrival);
                System.out.println("");
                System.out.println("Next client will arrive at time = " + nextArrivalTime);
            }
            if (server.isIdle() && !myListOfClients.isEmpty()) {
                Client clientToServe = myListOfClients.remove();
                server.setClient(clientToServe);
                server.setStartServiceTime(time);
                int serveTime = randomServiceTimeGenerator.nextInt((int) meanServiceTime);
                int timeForServerToBecomeFree = time + serveTime;
                server.setStopServiceTime(timeForServerToBecomeFree);
                System.out.println("");
                System.out.println("At time = " + time + " Server started serving client " + clientToServe + ".");
                System.out.println("Server will be free at time = " + timeForServerToBecomeFree);
                showList(myListOfClients);
            }
            if (time == server.getStopServiceTime() && time > 0) {
                System.out.println("At time = " + time + " Server finished serving client " + server.getClient() + ".");
                server.setClient(null);
            }
        }
    }

    /**
     * Display the list of waiting clients in the queue.
     *
     * @param a The queue of waiting clients.
     */
    public void showList(Queue<Client> a) {
        System.out.println("");
        System.out.println("Queue of Waiting Clients: ");
        for (Client c : a) {
            System.out.println(c.toString() + " ");
        }
        System.out.println();
        return;
    }
}
