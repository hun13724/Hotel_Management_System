

import java.util.ArrayList;
import java.util.List;

abstract public class Room {

    protected String roomNumber;
    protected double baseRate;
    protected List<Service> services;

    public Room(String roomNumber, double baseRate) {
        this.roomNumber = roomNumber;
        this.baseRate = baseRate;
        this.services = new ArrayList<>();
    }
    public void addService(Service service) {
        services.add(service);
    }
    public double getTotalCost(){
        double totalCost = baseRate;
        for (Service service : services) {
            totalCost += service.getCost();
        }
        return totalCost;
    }
    public abstract String getDescription();
    public String getRoomNumber() {
        return roomNumber;
    }



}
