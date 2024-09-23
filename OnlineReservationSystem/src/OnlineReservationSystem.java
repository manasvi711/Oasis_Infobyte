package oasis;
import java.util.Scanner;
public class OnlineReservationSystem {
	private static ReservationManager reservationManager = new ReservationManager();
	private static UserManager userManager = new UserManager();
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Welcome to the Online Reservation System");
		 if(login(scanner)) {
			 while (true) {
			 System.out.println("\n1. Reserve Ticket");
			 System.out.println("2. Cancel Reservation");
			 System.out.println("3. Exit");
			 System.out.print("Select an option: ");
			 int choice = scanner.nextInt();
			 
			 switch (choice) {
				 case 1:
				 reservationManager.reserveTicket(scanner);
				 break;
				 case 2:
				 reservationManager.cancelReservation(scanner);
				 break;
				 case 3:
					 System.out.println("Thank you for using the Online Reservation System.");
				 return;
				 default:
					 System.out.println("Invalid option. Please try again.");
			 }
			 }
		 }else {
			 System.out.println("Invalid option. Please try again.");
		 }
	}
	private static boolean login(Scanner scanner) {
		 System.out.print("Enter Login ID: ");
		 String loginId = scanner.next();
		 System.out.print("Enter Password: ");
		 String password = scanner.next();
		 return userManager.validateUser(loginId, password);
		 }
}

