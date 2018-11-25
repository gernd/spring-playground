package de.gernotpointner.springsecurity;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DummyAuthenticationManager authenticationManager = new DummyAuthenticationManager();

        final String userName = "admin";
        final String password = "pass";
        Authentication authRequest = new UsernamePasswordAuthenticationToken(userName, password);

        try{
            Authentication authResult = authenticationManager.authenticate(authRequest);
            System.out.println(authResult);
            SecurityContextHolder.getContext().setAuthentication(authResult);
        } catch (BadCredentialsException e){
            System.out.println("Error during authentication: " + e.getMessage());
        }
    }


    private static class DummyAuthenticationManager implements AuthenticationManager{

        private static final List<GrantedAuthority> authorities = new ArrayList();
        static {
           authorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
        }

        public Authentication authenticate(Authentication authentication) throws AuthenticationException {
            System.out.println("Authentication requested for ");
            System.out.println(authentication.getName());
            System.out.println(authentication.getCredentials());
            System.out.println(authentication.getPrincipal());

            if(authentication.getName().equals("admin")){
                return new UsernamePasswordAuthenticationToken(authentication.getName(),
                                                               authentication.getCredentials(),
                                                               authorities);
            }
            throw new BadCredentialsException("Nope");
        }
    }
}
