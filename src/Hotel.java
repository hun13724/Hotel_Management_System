import java.util.HashMap;

public class Hotel {
    private HashMap<String, Room> rooms;
    private Hotel(){
        rooms = new HashMap<>();
    }
    public void addRoom(Room room){
        rooms.put(room.getRoomNumber(), room);
    }
    public Room getRoom(String roomNumber){
        return rooms.get(roomNumber);
    }

    public void bookRoom(String roomNumber, Service services){
        Room room = rooms.get(roomNumber);
        if (room != null){
            room.addService(services);
            System.out.println("Added " + service.getName() + " service to " + room.getDescription() + " - Room " + roomNumber);
        }else {
            System.out.println("Room " + roomNumber + " not found");
        }
    }

    public void displayBookingDetails(String roomNumber){
        Room room = rooms.get(roomNumber);
        if (room != null){
            System.out.println("Booking for " + room.getDescription() + " - Room " + roomNumber);
            System.out.println("Total Cost: $" + room.getTotalCost());
        } else{

        }
    }



}
