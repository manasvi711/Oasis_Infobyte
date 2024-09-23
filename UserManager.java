package oasis;

public class UserManager {
	// In a real system, user data would be fetched from a database
	 private static final String LOGIN_ID = "Oasis";
	 private static final String PASSWORD = "12345";
	 public boolean validateUser(String loginId, String password) {
		 return LOGIN_ID.equals(loginId) && PASSWORD.equals(password);
		 }
	}

