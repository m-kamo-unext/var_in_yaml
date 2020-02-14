package com.example.var_in_yaml;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Slf4j
public class VarInYamlApplication {

  public static void main(String[] args) {
    var app = SpringApplication.run(VarInYamlApplication.class, args);

    var fooProps = app.getBean(FooProperties.class);
    log.info("example.foo.bar={}", fooProps.getBar());
  }

  @Component
  @ConfigurationProperties(prefix = "example.foo")
  @Data
  public static class FooProperties {
    private String bar;
  }
}
