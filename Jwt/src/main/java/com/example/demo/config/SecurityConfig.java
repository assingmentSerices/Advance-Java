package com.example.demo.config;


	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.context.annotation.Bean;
	import org.springframework.context.annotation.Configuration;
	import org.springframework.security.authentication.AuthenticationManager;
	import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
	import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
	import org.springframework.security.config.annotation.web.builders.HttpSecurity;
	import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
	import org.springframework.security.config.http.SessionCreationPolicy;
	import org.springframework.security.core.userdetails.UserDetailsService;
	import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
	import org.springframework.security.web.AuthenticationEntryPoint;
	import org.springframework.security.web.SecurityFilterChain;
	import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.example.demo.Filter.SecurityFilter;

	

	@Configuration
	@EnableWebSecurity
	public class SecurityConfig {

		@Autowired
		private BCryptPasswordEncoder passwordEncoder;
		
		@Autowired
		private AuthenticationEntryPoint authenticationEntryPoint;
		
		@Autowired
		private SecurityFilter securityFilter;
		
		
		@Autowired
		private UserDetailsService userDetailsService;
		
		@Bean
		public AuthenticationManager authenticationManager(AuthenticationConfiguration authorityManager) throws Exception {
			return authorityManager.getAuthenticationManager();
		}
		
		public DaoAuthenticationProvider authenticationProviders() {
			DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
			provider.setPasswordEncoder(passwordEncoder);
			provider.setUserDetailsService(userDetailsService);
			return provider;
		}
		
		@Bean
		public SecurityFilterChain configurePath(HttpSecurity security) throws Exception{
		
			security.csrf().disable();
			
			security.authorizeRequests().antMatchers("/user/save","/user/login").permitAll()
			.anyRequest()
			.authenticated()
			.and()
			.exceptionHandling()
			.authenticationEntryPoint(authenticationEntryPoint)
			.and()
			.sessionManagement()
			.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
			.and()
			.addFilterBefore(securityFilter, UsernamePasswordAuthenticationFilter.class);
			
			return security.build();
		}
		
	}


