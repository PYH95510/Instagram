package com.cos.photogramstart.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity // activate security file.
@Configuration // register to IoC container, now it will be managed by the IoC container.
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {

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
