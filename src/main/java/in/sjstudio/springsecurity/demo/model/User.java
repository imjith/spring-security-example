package in.sjstudio.springsecurity.demo.model;

import java.util.Set;

public class User {

	private String username;
	private String password;
	private Set<Role> roles;

	public User() {
	}

	public User(User user) {
		this.username = user.username;
		this.password = user.password;
		this.roles = user.roles;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

}
