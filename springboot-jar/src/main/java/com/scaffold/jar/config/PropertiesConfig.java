package com.scaffold.jar.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.List;
import java.util.Map;

/**
 * @ClassName: PropertiesConfig
 * @Description:
 * @Author: booxj
 * @Date: 2019/11/28 10:33
 */
@Configuration
@PropertySource("prop.properties")
@ConfigurationProperties(prefix = "prop")
@Data
public class PropertiesConfig {

    int id;
    String name;

    List<String> list;

    Map<String,Object> map;

    SubPropertiesConfig sub;

    List<SubPropertiesConfig> subList;

    @Data
    public static class SubPropertiesConfig{
        int id;
        String name;
    }
}
