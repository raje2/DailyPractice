package com.masai.configuration;

import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SpringSecurity extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		 
		  http
		  .authorizeRequests()
		  //.antMatchers("/homepage/**").hasRole("ADMIN")
		  //.antMatchers("/user/**").hasRole("ADMIN")
		  //.antMatchers("/homepage/**").hasRole("NORMAL")
		  //.antMatchers(HttpMethod.POST,"/homepage/**").permitAll()
		  //.antMatchers(HttpMethod.GET, "/homepage/**").permitAll() {if you want to allow get api in home page}
		  .anyRequest()
		  .authenticated()
		  .and()
		  .httpBasic();
		  
		
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("rajesh").password(this.passwordEncoder().encode("123")).roles("ADMIN");
		auth.inMemoryAuthentication().withUser("badal").password(this.passwordEncoder().encode("1234")).roles("NORMAL");
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		
		return new BCryptPasswordEncoder(10);
	}
	     

}
