package com.tp.model;

import java.util.Collection;
import java.util.Collections;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import com.tp.model.User;
//pour le retour de UserPrinciple 
public class UserPrinciple implements UserDetails {
private User user;
public UserPrinciple(User user) {
super();
this.user = user;
}
@Override
//Garantir un accés User
public Collection<? extends GrantedAuthority> getAuthorities() {
// TODO Auto-generated method stub
return Collections.singleton(new SimpleGrantedAuthority("USER"));
}
//tout les return doivent être true
@Override
public String getPassword() {
	// TODO Auto-generated method stub
	return user.getMdp();
}
@Override
public String getUsername() {
	// TODO Auto-generated method stub
	return user.getNom();
}
@Override
public boolean isAccountNonExpired() {
	// TODO Auto-generated method stub
	return true;
}
@Override
public boolean isAccountNonLocked() {
	// TODO Auto-generated method stub
	return true;
}
@Override
public boolean isCredentialsNonExpired() {
	// TODO Auto-generated method stub
	return true;
}
@Override
public boolean isEnabled() {
	// TODO Auto-generated method stub
	return true;
}
}