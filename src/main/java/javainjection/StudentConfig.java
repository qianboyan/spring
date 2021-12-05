package javainjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

  @Bean(initMethod = "init", destroyMethod = "cleanup")
  public Student student(){
    return new Student();
  }
}
