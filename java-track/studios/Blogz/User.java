package Blogz;

import java.util.regex.Matcher;//for regular expressions
import java.util.regex.Pattern;//for regular expressions
import java.util.ArrayList;
import java.util.List;

public class User extends Entity {

	private String username;
	private String password;
	private String hashedPassword;
	static List<User> users = new ArrayList<User>();
	
		
	private static String hashPassword(String pwd) {
		return pwd;
	}
	
	private boolean isValidPassword(String pwd) {
		return User.hashPassword(pwd) == this.hashedPassword;
	}
	
	private boolean isValidUsername(String username) {
		
		Pattern p = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]{4,11}");
		Matcher m = p.matcher(username);
		return m.matches();
	}
	
	public User(int UID, String username, String hashedPassword) {
		super(UID);
		
	}
	
			
	public String getUsername() {
		return this.username;
	}
	
	public String getPassword() {
		return this.password;
	}
}
