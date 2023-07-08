package com.masterhr.user.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MasterHRUserConfig {
	@Value("${spring.datasource.url}")
	private String url;
	@Value("${spring.datasource.username}")
	private String username;
	@Value("${spring.datasource.password}")
	private String password;

	@Bean
	 public DataSource mySqlDataSource() 
	    {
		System.out.println("url---"+url+"username"+username);
	        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
	        dataSourceBuilder.url(url);
	        dataSourceBuilder.username(username);
	        dataSourceBuilder.password(password);
	        return dataSourceBuilder.build();
	    }
}
