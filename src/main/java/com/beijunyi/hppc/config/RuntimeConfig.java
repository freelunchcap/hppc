package com.beijunyi.hppc.config;

import com.beijunyi.hppc.Constants;
import org.jasypt.util.password.BasicPasswordEncryptor;
import org.jasypt.util.password.PasswordEncryptor;
import org.springframework.context.annotation.*;

@Configuration
@Import({DatabaseConfig.class, SecurityConfig.class})
@ComponentScan(basePackageClasses = Constants.class)
public class RuntimeConfig {

  @Bean(name = "passwordEncryptor")
  public PasswordEncryptor passwordEncryptor() {
    return new BasicPasswordEncryptor();
  }
}
