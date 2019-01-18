package in.sjstudio.springsecurity.demo.service;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import in.sjstudio.springsecurity.demo.model.Role;
import in.sjstudio.springsecurity.demo.model.User;
import in.sjstudio.springsecurity.demo.model.UserDetailsImp;

@Service
public class UserDetailServiceImp implements UserDetailsService {

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		if ("admin".equals(username) || "user".equals(username)) {
			User user = new User();
			user.setUsername(username);
			user.setPassword(passwordEncoder.encode(username));
			user.setRoles(Collections.singleton(new Role(username.toUpperCase())));
			return new UserDetailsImp(user);
		} else {
			User user = new User();
			user.setUsername("nouser");
			return new UserDetailsImp(user);
		}
	}

}
