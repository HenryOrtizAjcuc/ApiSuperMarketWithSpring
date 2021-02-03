package com.example.market.domain.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserDetailService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Es una demo
        // La configuarción correcta seria validar en una base de datos las credenciales del usuario
        // O utilizar oathut zero
        return new User("henry","{noop}123456Z!a$",new ArrayList<>());
    }
}
