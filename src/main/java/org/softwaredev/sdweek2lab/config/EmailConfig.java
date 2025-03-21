package org.softwaredev.sdweek2lab.config;

import org.softwaredev.sdweek2lab.services.EmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmailConfig {

  @Bean
  public EmailService emailService() {
    return new EmailService();
  }
}
