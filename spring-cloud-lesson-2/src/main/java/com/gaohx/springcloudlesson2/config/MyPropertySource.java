package com.gaohx.springcloudlesson2.config;

import org.springframework.cloud.bootstrap.config.PropertySourceLocator;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.*;

import java.util.HashMap;
import java.util.Map;

@Configuration
@Order(1)
public class MyPropertySource implements PropertySourceLocator {
    @Override
    public PropertySource<?> locate(Environment environment) {
        if (environment instanceof ConfigurableEnvironment) {
            ConfigurableEnvironment configurableEnvironment = ConfigurableEnvironment.class.cast(environment);
            MutablePropertySources propertySources = configurableEnvironment.getPropertySources();

            Map<String, Object> map = new HashMap<>();
            map.put("spring.application.name","test boostrap configuration");
            PropertySource propertySource = new MapPropertySource("cover-my-configuration",map);

            propertySources.addFirst(propertySource);
        }
        return null;
    }
}
