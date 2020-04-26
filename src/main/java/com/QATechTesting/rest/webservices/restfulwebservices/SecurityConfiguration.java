//package com.QATechTesting.rest.webservices.restfulwebservices;
//
//import java.lang.annotation.Retention;
//import java.lang.annotation.RetentionPolicy;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@EnableWebSecurity
//public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
//
//    private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication()
//            .passwordEncoder(passwordEncoder())
//            .withUser("sonu")
//            .password(passwordEncoder().encode("admin"))
//            .roles("USER");
//    }
//
//    
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return passwordEncoder;
//    }
//}