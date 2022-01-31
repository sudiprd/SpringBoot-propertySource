package com.example.propertysource;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Application {

    @Value("${app.name}")
    private String appName;
    @Value("${app.version}")
    private String appVersion;
    @Value("${app.build}")
    private String appBuild;

    public void loadApplicationProperties() {
        log.info("==============Application=============");
        log.info("App name :{}", appName);
        log.info("App version :{}", appVersion);
        log.info("App build :{}", appBuild);
    }
}
