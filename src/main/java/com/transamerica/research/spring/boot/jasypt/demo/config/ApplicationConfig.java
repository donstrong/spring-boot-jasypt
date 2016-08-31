package com.transamerica.research.spring.boot.jasypt.demo.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@EnableAutoConfiguration
@EnableConfigurationProperties
@EnableEncryptableProperties
//@PropertySource(name="EncryptedProperties", value = "classpath:jasypt-demo.yml") // doesn't matter if present or not

@ComponentScan("com.transamerica.research.spring.boot.jasypt.demo")
public class ApplicationConfig {

}