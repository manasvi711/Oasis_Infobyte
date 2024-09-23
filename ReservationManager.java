package oasis;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class ReservationManager {
	private Map<String, String> reservations = new HashMap<>();
	
	public void reserveTicket(Scanner scanner) {
		 System.out.print("Enter Name: ");
		 String name = scanner.next();
		 System.out.print("Enter Train Number: ");
		 String trainNumber = scanner.next();
		 System.out.print("Enter Class Type: ");
		 String classType = scanner.next();
		 System.out.print("Enter Date of Journey (dd-mm-yyyy): ");
		 String dateOfJourney = scanner.next();
		 System.out.print("Enter From (Place): ");
		 String fromPlace = scanner.next();
		 System.out.print("Enter To (Destination): ");
		 String destination = scanner.next();
		 String pnr = generatePNR(trainNumber, dateOfJourney, fromPlace, destination);
		 reservations.put(pnr, String.format("Name: %s, Train No: %s, Class: %s, Date: %s,From: %s, To: %s",name, trainNumber, classType, dateOfJourney, fromPlace, destination));
		 System.out.println("Ticket reserved successfully! Your PNR is " + pnr);

	}
	 public void cancelReservation(Scanner scanner) {
		 System.out.print("Enter PNR Number: ");
		 String pnr = scanner.next();
		 
		 if(reservations.containsKey(pnr)) {
			 System.out.println("Reservation found: " + reservations.get(pnr));
			 System.out.print("Are you sure you want to cancel this reservation? (yes/no): ");
			 String confirmation = scanner.next();
			 if("yes".equalsIgnoreCase(confirmation)) {
				 reservations.remove(pnr);
				 System.out.println("Reservation cancelled successfully.");
			 } else {
				 System.out.println("Cancellation aborted.");
			   }
		 }else{
			System.out.println("Invalid PNR. No reservation found.");
		  }
	 }
	 private String generatePNR(String trainNumber, String dateOfJourney, String fromPlace,String destination) {
		 return trainNumber + dateOfJourney + fromPlace + destination;
	 }
	}

