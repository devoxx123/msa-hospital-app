package org.api.gateway.app.service;

import java.util.ArrayList;
import java.util.List;

import org.api.gateway.app.domain.Role;
import org.api.gateway.app.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByUsername(username);

		if (user == null) {
			throw new UsernameNotFoundException(String.format("The username %s doesn't exist", username));
		}

		List<GrantedAuthority> authorities = new ArrayList<>();
		List<Role> roles = user.getRoles();
		for (Role role : roles) {
			authorities.add(new SimpleGrantedAuthority(role.getName()));
		}

		UserDetails userDetails = new org.springframework.security.core.userdetails.User(user.getUsername(),
				user.getPassword(), authorities);

		return userDetails;
	}
}
