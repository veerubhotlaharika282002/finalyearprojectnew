package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomCheckUserDetailsService implements UserDetailsService {

	@Autowired
	private CheckUserRepository check;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		checkoutusers user = check.findByEmail(email);
		if(user == null)
		{
			throw new UsernameNotFoundException("User Not Found");
		}
		return new CustomCheckUserDetails(user);
	}

}
