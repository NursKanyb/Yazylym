package com.any.Any.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers(/* HttpMethod.POST,*/"/","/Резюме","/Тест","/ans","/login").permitAll()
                .antMatchers("/images/**").permitAll()
                .antMatchers("/adminPage.css").permitAll()
                .antMatchers("/ansPage.css").permitAll()
                .antMatchers("/index.css").permitAll()
                .antMatchers("/css.css").permitAll()
                .antMatchers("/Post-Template.css").permitAll()
                .antMatchers("/Тест.css").permitAll()
                .antMatchers("/Резюме.css").permitAll()
                .antMatchers("/login.css").permitAll()

                .antMatchers("/jquery.js").permitAll()
                .antMatchers("/js.js").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .permitAll()
                .and()
                .logout()
                .permitAll().and().
                cors().and().
                csrf().disable()
        ;
    }
    @Bean
    @Override
    public UserDetailsService userDetailsService() {
        UserDetails user =
                User.withDefaultPasswordEncoder()
                        .username("admin")
                        .password("admin")
                        .roles("USER")
                        .build();

        return new InMemoryUserDetailsManager(user);
    }
}
