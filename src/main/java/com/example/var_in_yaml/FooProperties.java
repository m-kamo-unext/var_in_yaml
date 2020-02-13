package com.example.var_in_yaml;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "example.foo")
@Data
public class FooProperties {
  private String bar;
}
