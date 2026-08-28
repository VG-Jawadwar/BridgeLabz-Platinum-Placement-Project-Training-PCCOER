package day_3;
import java.util.Scanner;

public class MovieTheater {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean[][][] seats = new boolean[3][5][8];

        int choice;

        do {
            System.out.println("\n=== Movie Theater ===");
            System.out.println("1. View Available Seats");
            System.out.println("2. Book Tickets");
            System.out.println("3. Cancel Booking");
            System.out.println("4. Hall Summary");
            System.out.println("5. Exit");
            System.out.print("Choice: ");

            choice = sc.nextInt();

            if (choice == 1) {

                System.out.print("Select hall (1-3): ");
                int hall = sc.nextInt();

                if (hall < 1 || hall > 3) {
                    System.out.println("Invalid hall!");
                    continue;
                }

                System.out.println("\nHall " + hall + " Seating Layout");
                System.out.println("   1 2 3 4 5 6 7 8");
                
                for (int row = 0; row < 5; row++) {

                    System.out.print((char) ('A' + row) + "  ");

                    for (int seat = 0; seat < 8; seat++) {

                        if (seats[hall - 1][row][seat]) {
                            System.out.print("B ");
                        } else {
                            System.out.print("A ");
                        }
                    }

                    System.out.println();
                }
            }

            
            else if (choice == 2) {

                System.out.print("Select hall (1-3): ");
                int hall = sc.nextInt();

                if (hall < 1 || hall > 3) {
                    System.out.println("Invalid hall!");
                    continue;
                }

                while (true) {

                    System.out.print("Enter row (A-E) or DONE: ");
                    String rowInput = sc.next();

                    if (rowInput.equalsIgnoreCase("DONE")) {
                        break;
                    }

                    char rowChar = rowInput.toUpperCase().charAt(0);

                    if (rowChar < 'A' || rowChar > 'E') {
                        System.out.println("Invalid row! Enter A-E.");
                        continue;
                    }

                    System.out.print("Enter seat (1-8): ");
                    int seat = sc.nextInt();

                    if (seat < 1 || seat > 8) {
                        System.out.println("Invalid seat! Enter 1-8.");
                        continue;
                    }

                    int row = rowChar - 'A';

                    if (seats[hall - 1][row][seat - 1]) {
                        System.out.println("Seat already booked. Try again.");
                        continue;
                    }

                    seats[hall - 1][row][seat - 1] = true;

                    System.out.println("Seat " + rowChar + seat+" booked successfully!");
                }
            }

            else if (choice == 3) {

                System.out.print("Select hall (1-3): ");
                int hall = sc.nextInt();

                if (hall < 1 || hall > 3) {
                    System.out.println("Invalid hall!");
                    continue;
                }

                System.out.print("Enter row (A-E): ");
                char rowChar = sc.next().toUpperCase().charAt(0);

                if (rowChar < 'A' || rowChar > 'E') {
                    System.out.println("Invalid row!");
                    continue;
                }

                System.out.print("Enter seat (1-8): ");
                int seat = sc.nextInt();

                if (seat < 1 || seat > 8) {
                    System.out.println("Invalid seat!");
                    continue;
                }

                int row = rowChar - 'A';

                if (seats[hall - 1][row][seat - 1]) {

                    seats[hall - 1][row][seat - 1] = false;

                    System.out.println("Seat " + rowChar + seat
                            + " cancelled successfully!");

                } else {

                    System.out.println("Seat was not booked.");
                }
            }

            else if (choice == 4) {

                System.out.print("Select hall (1-3): ");
                int hall = sc.nextInt();

                if (hall < 1 || hall > 3) {
                    System.out.println("Invalid hall!");
                    continue;
                }

                int booked = 0;
                
                for (int row = 0; row < 5; row++) {

                    for (int seat = 0; seat < 8; seat++) {

                        if (seats[hall - 1][row][seat]) {
                            booked++;
                        }
                    }
                }

                int totalSeats = 5 * 8;
                int available = totalSeats - booked;

                double percentage = (booked * 100.0) / totalSeats;

                System.out.println("\n--- Hall " + hall + " Summary ---");
                System.out.println("Total seats: " + totalSeats);
                System.out.println("Booked: " + booked);
                System.out.println("Available: " + available);
                System.out.printf("Booking %%: %.1f%%%n", percentage);
            }

            else if (choice == 5) {

                System.out.println("\n=== Final Summary ===");

                int totalBooked = 0;

                for (int hall = 0; hall < 3; hall++) {

                    int booked = 0;

                    for (int row = 0; row < 5; row++) {

                        for (int seat = 0; seat < 8; seat++) {

                            if (seats[hall][row][seat]) {
                                booked++;
                            }
                        }
                    }

                    int available = 40 - booked;

                    System.out.println("Hall " + (hall + 1)
                            + " - Booked: " + booked
                            + ", Available: " + available);

                    totalBooked = totalBooked + booked;
                }

                double revenue = totalBooked * 250;

                System.out.println("Total tickets booked: " + totalBooked);
                System.out.println("Total Revenue: Rs." + revenue);
                System.out.println("Thank you!");
            }

            else {
                System.out.println("Invalid choice! Please select 1-5.");
            }

        } while (choice != 5);

        sc.close();
    }
}