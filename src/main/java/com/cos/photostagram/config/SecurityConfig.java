package com.cos.photostagram.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableWebSecurity // activate security file.
@Configuration // register to IoC container, now it will be managed by the IoC container.
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    // if we use Bean annotation, when security config is registered into IoC
    // container, it will recognize Bean annotation, and will return
    // BcryptPasswordEncoder
    @Bean
    public BCryptPasswordEncoder encoder() {
        return new BCryptPasswordEncoder(); // literally encrypt password
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.csrf().disable();

        http.authorizeRequests()
                .antMatchers("/", "/user/**", "/image/**", "/subscribe/**", "/comment/**")
                .authenticated() // need authentication
                .anyRequest()// request that doesn't need authentication, here it means there is no.
                .permitAll()// permit all
                .and() // and
                .formLogin() // if sign in request happens
                .loginPage("/auth/signin") // move to signin page
                .defaultSuccessUrl("/"); // if it signin is succedded, default success url is /
    }
}
// anyMatchers means setting the path for requestion the authentication.
// Components inside the parenthesis means that all the requests throught the
// path needs the authentication
