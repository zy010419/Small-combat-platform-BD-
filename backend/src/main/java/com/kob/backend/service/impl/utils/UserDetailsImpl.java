package com.kob.backend.service.impl.utils;

import com.kob.backend.pojo.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDetailsImpl implements UserDetails {

    private User user;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() { // 返回用户密码
        return user.getPassword();
    }

    @Override
    public String getUsername() { // 返回用户姓名
        return user.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() { // 用户是否被锁定
        return true;
    }

    @Override
    public boolean isAccountNonLocked() { // 用户是否没有被锁定
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() { // 用户授权是否过期
        return true;
    }

    @Override
    public boolean isEnabled() { // 用户是否启用
        return true;
    }
}
