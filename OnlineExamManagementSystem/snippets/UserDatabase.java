package oasis;
import java.util.HashMap;
public class UserDatabase {
	private HashMap<String, User> users;
	public UserDatabase() {
		users = new HashMap<>();
		users.put("admin", new User("admin", "admin", "admin@example.com","1234567890"));
	}
	public User authenticate(String username, String password) {
		User user = users.get(username);
		if (user != null && user.verifyPassword(password)) {
			return user;
		}
		return null;
	}
}

