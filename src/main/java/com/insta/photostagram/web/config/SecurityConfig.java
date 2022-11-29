package com.insta.photostagram.web.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

//using websecurity
 //using singletone management bean, one object
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//    @Bean
//    public BCryptPasswordEncoder encoded(){ //encryption
//        return new BCryptPasswordEncoder();
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.csrf().disable();
//
//
//        http.authorizeRequests()
//                .antMatchers("/", "/user/**", "/image/**", "/subscribe/**", "/comment/**", "/api/**") // 해당 Url로 진행되는 모든 것들
//                .authenticated()
//                .anyRequest()
//                .permitAll()
//                .and()
//                .formLogin()
//                .loginPage("/auth/signin")
//                .loginProcessingUrl("/login")
//                .defaultSuccessUrl("/");
//    }
//
//}
@EnableWebSecurity
@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests((authz) -> {
                            try {
                                authz
                                        .antMatchers("/", "/user/**", "/image/**", "/subscribe/**", "/comment/**", "/api/**")
                                        .authenticated()
                                        .anyRequest()
                                        .permitAll()
                                        .and()
                                        .formLogin()
                                        .loginPage("/auth/signin")
                                        .loginProcessingUrl("/login")
                                        .defaultSuccessUrl("/");
                                ;
                            } catch (Exception e) {
                                throw new RuntimeException(e);
                            }
                        }


                )
                .httpBasic(withDefaults());
        return http.build();
    }

}


