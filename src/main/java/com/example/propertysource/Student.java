package com.example.propertysource;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@PropertySource(value = "classpath:config.yml", factory = YmlConfiguration.class)
public class Student {

    private static final Logger logger = LoggerFactory.getLogger(Student.class);

    @Value("${student.name}")
    private String studName;
    @Value("${student.id}")
    private String studId;
    @Value("${student.department}")
    private String studDepart;


    public void studentDetails() {
        log.info("============Student details=========");
        log.info("Student name: {}", studName);
        log.info("Student name: {}", studId);
        log.info("Student name: {}", studDepart);
    }
}
