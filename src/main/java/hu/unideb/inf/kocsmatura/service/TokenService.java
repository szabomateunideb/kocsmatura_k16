package hu.unideb.inf.kocsmatura.service;

import org.springframework.security.core.userdetails.UserDetails;

public interface TokenService {

    String extractUsername(String token);
    String generateToken(UserDetails userDetails);
    Boolean validateToken(String token, UserDetails userDetails);
}
