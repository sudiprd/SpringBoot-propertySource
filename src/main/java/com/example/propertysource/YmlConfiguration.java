package com.example.propertysource;

import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.core.io.support.PropertySourceFactory;
import org.springframework.lang.Nullable;

import java.io.IOException;
import java.util.Properties;

public class YmlConfiguration implements PropertySourceFactory {


    @Override
    public PropertySource<?> createPropertySource(@Nullable String name, EncodedResource resource) throws IOException {
        Properties loadProperties = this.loadYmlProperties(resource.getResource());
        return new PropertiesPropertySource(name != null ? name : resource.getResource().getFilename(), loadProperties);
    }

    public Properties loadYmlProperties(Resource resource) {
        YamlPropertiesFactoryBean factoryBean = new YamlPropertiesFactoryBean();
        factoryBean.setResources(resource);
        factoryBean.afterPropertiesSet();

        return factoryBean.getObject();
    }
}
