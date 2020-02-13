package com.example.var_in_yaml;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class VarInYamlApplication {

  public static void main(String[] args) {
    var app = SpringApplication.run(VarInYamlApplication.class, args);

    var fooProps = app.getBean(FooProperties.class);
    log.info("example.foo.bar={}", fooProps.getBar());
  }
}
