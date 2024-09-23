package oasis;
public class User {
	 private String username;
	 private String password;
	 private String email;
	 private String phone;
	 public User(String username, String password, String email, String phone) {
		 this.username = username;
		 this.password = password;
		 this.email = email;
		 this.phone = phone;
	 }
	 public String getUsername() {
	   return username;
	 }
	 public boolean verifyPassword(String password) {
		 return this.password.equals(password);
	 }
	 public void updateProfile(String email, String phone) {
		 this.email = email;
		 this.phone = phone;
	 }
	 public void updatePassword(String newPassword) {
	 this.password = newPassword;
	 }
}