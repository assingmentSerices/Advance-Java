
package com.example.demo.Util;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ResourceServerProperties.Jwt;
import org.springframework.stereotype.Component;


@Component
public class JwtUtil {

	@Value("${app.secret}")
	private String secret;
	
	//private String genrateToken(Map<String,Object> clamis,String subjects) {
		
		
		
	}

