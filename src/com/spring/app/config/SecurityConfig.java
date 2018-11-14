package com.spring.app.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	DataSource myDataSource;
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication().dataSource(myDataSource).passwordEncoder(new BCryptPasswordEncoder());
	}
	
	public void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/403").access("permitAll")
		.antMatchers("/addProductForm").access("hasRole('ADMIN')")
		.antMatchers("/updateProduct").access("hasRole('ADMIN')")
		.antMatchers("/deleteProduct").access("hasRole('ADMIN')");
		http.exceptionHandling().accessDeniedPage("/403");
		http.formLogin().loginPage("/login").failureUrl("/login?error");
		http.logout().logoutSuccessUrl("/").logoutUrl("/").invalidateHttpSession(true);
	}
	
}
