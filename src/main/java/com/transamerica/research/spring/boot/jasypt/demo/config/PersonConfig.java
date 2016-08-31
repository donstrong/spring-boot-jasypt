package com.transamerica.research.spring.boot.jasypt.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.transamerica.research.spring.boot.jasypt.demo.model.Person;

//import com.ulisesbocchio.jasyptspringboot.annotation.EncryptablePropertySource;

// Notes: 
// - If reading encrypted properties from application.yml, remove locations from @ConfigurationProperties in order for 
//   decryption to work!  Otherwise, the encrypted value is returned.  
// - If reading encrypted properties from jasypt-demo.yml, need to include locations in @ConfigurationProperties in 
//	 order to get the "encrypted" value (but decrypted value still not returned).
@ConfigurationProperties(prefix = "com.transamerica.research.spring.boot.jasypt.demo.person", locations = {"classpath:jasypt-demo.yml"}) 

// Adding the following doesn't matter (and therefore commented out)
//@Configuration
//@EncryptablePropertySource(value = "classpath:jasypt-demo.yml") 

@Component
public class PersonConfig {
	
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Bean
	public Person getPerson() {
		Person person = new Person();
		person.setUsername(username);
		person.setPassword(password);
		return person;
	}
	
}
