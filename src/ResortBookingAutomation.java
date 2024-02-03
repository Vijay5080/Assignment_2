import java.util.Scanner;

public class ResortBookingAutomation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the customer details");
        String input = scanner.nextLine();
        Booking booking = new Booking(input);
        booking.calculateBookingPrice();
        scanner.close();
    }
}
