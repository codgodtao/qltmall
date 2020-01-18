package com.qltmall.mvc.dto;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.qltmall.mvc.mbg.model.User;

import java.util.Collection;

/**
 * SpringSecurity需要的用户详情
 * 用于封装用户信息的类
 * 可以包括权限
 */
public class SecurityUserDetails implements UserDetails {
    private User user;

    public SecurityUserDetails(User user) {
    	this.user = user;
    }
  
    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getUserName();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return null;
	}

	@Override
	public boolean isEnabled() {
		return false;
	}
	public User getuser() {
		return user;
	}

}
