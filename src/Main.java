import java.util.Scanner;
public class Main {
    public static void HotelManagementSystem(String[] args) {

        Hotel hotel= new Hotel();
//
//        hotel.addRoom(new StandardRoom("101",200));
//        hotel.addRoom(new StandardRoom("102",300));
//        hotel.addRoom(new StandardRoom("103",500));
//
//        hotel.bookRoom("101", new SpaService());
//        hotel.bookRoom("102", new DiningService());
//        hotel.bookRoom("103", new GymService());
//
//        hotel.displayBookingDetails("101");
//        hotel.displayBookingDetails("102");
//        hotel.displayBookingDetails("103");

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("--- Hotel Management System ---");
            System.out.println("1. Add Room");
            System.out.println("2. Book Room");
            System.out.println("3. Display Booking Details");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter room type (1-Standard, 2-Deluxe, 3-Suite): ");
                    int roomType = scanner.nextInt();
                    System.out.print("Enter room number: ");
                    String roomNumber = scanner.next();
                    System.out.print("Enter base rate: ");
                    double baseRate = scanner.nextDouble();

                    if (roomType == 1) {
                        hotel.addRoom(new StandardRoom(roomNumber, baseRate));
                    } else if (roomType == 2) {
                        hotel.addRoom(new DeluxeRoom(roomNumber, baseRate));
                    } else if (roomType == 3) {
                        hotel.addRoom(new SuiteRoom(roomNumber, baseRate));
                    } else {
                        System.out.println("Invalid room type.");
                    }
                    break;

                case 2:
                    System.out.print("Enter room number: ");
                    String bookRoomNumber = scanner.next();
                    System.out.print("Enter service (1-Spa, 2-Dining, 3-Gym): ");
                    int serviceType = scanner.nextInt();

                    Service service = null;
                    if (serviceType == 1) {
                        service = new SpaService();
                    } else if (serviceType == 2) {
                        service = new DiningService();
                    } else if (serviceType == 3) {
                        service = new GymService();
                    } else {
                        System.out.println("Invalid service type.");
                    }

                    if (service != null) {
                        hotel.bookRoom(bookRoomNumber, service);
                    }
                    break;

                case 3:

                    System.out.print("Enter room number: ");
                    String displayRoomNumber = scanner.next();
                    hotel.displayBookingDetails(displayRoomNumber);
                    break;

                case 4:

                    System.out.println("Exiting the system.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 4);

        scanner.close();
    }

    
}