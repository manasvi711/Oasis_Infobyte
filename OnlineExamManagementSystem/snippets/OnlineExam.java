package oasis;
import java.util.Scanner;
public class OnlineExam {
	private static User currentUser = null;
	private static final UserDatabase userDb = new UserDatabase();
    private static final Exam exam = new Exam();
    
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        while (true) {
        	if (currentUser == null) {
        		System.out.println("1. Login");
        		System.out.println("2. Exit");
        		System.out.print("Enter the choice: ");
        		int choice = scanner.nextInt();
        		if (choice == 1) {
        			login(scanner);
        		} else if (choice == 2) {
        			System.out.println("Exiting…");
        			break;
        		}
        	} else {
        		System.out.println("\n1. Update Profile");
        		System.out.println("2. Update Password");
        		System.out.println("3. Take Exam");
        		System.out.println("4. Logout");
        		System.out.print("Enter the choice: ");
        		int choice = scanner.nextInt();
        		if (choice == 1) {
        			updateProfile(scanner);
        		} else if (choice == 2) {
        			updatePassword(scanner);
        		} else if (choice == 3) {
        			exam.startExam(scanner, currentUser);
        		} else if (choice == 4) {
        			logout();
        		}
        	}
        }
        scanner.close();
    }
    private static void login(Scanner scanner) {
    	System.out.print("Enter username: ");
    	String username = scanner.next();
    	System.out.print("Enter password: ");
    	String password = scanner.next();
    	currentUser = userDb.authenticate(username, password);
    	if (currentUser != null) {
    		System.out.println("Login successful!");
    	} else {
    		System.out.println("Invalid credentials!");
    	}
    }
    private static void updateProfile(Scanner scanner) {
    	System.out.print("Enter new email: ");
    	String newEmail = scanner.next();
    	System.out.print("Enter new phone: ");
    	String newPhone = scanner.next();
    	currentUser.updateProfile(newEmail, newPhone);
    	System.out.println("Profile updated successfully!");
    }
    private static void updatePassword(Scanner scanner) {
    	System.out.print("Enter old password: ");
    	String oldPassword = scanner.next();
    	if (currentUser.verifyPassword(oldPassword)) {
    		System.out.print("Enter new password: ");
    		String newPassword = scanner.next();
    		currentUser.updatePassword(newPassword);
    		System.out.println("Password updated successfully!");
    	} else {
    		System.out.println("Incorrect old password!");
    	}
    }
    private static void logout() {
    	currentUser = null;
    	System.out.println("Logged out successfully!");
    }
}
