package com.hyland.webhook;

import com.hyland.webhook.filter.HeaderValidatorFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WebhookApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebhookApplication.class, args);
	}

	@Bean
	public FilterRegistrationBean<HeaderValidatorFilter> headerValidatorFilter() {
		FilterRegistrationBean<HeaderValidatorFilter> registrationBean = new FilterRegistrationBean<>();
		registrationBean.setFilter(new HeaderValidatorFilter());
		registrationBean.addUrlPatterns("*");
		return registrationBean;
	}

}
