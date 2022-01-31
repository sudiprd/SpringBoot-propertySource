package com.example.propertysource;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Slf4j
@Component
public class Starter implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(Starter.class);

    @Autowired
    private Student student;

    @Autowired
    private Application app;

    @Autowired
    private Customer custom;


    @Override
    public void run(String... args) throws Exception {
        logger.info("Run method has called from Started Class");
        app.loadApplicationProperties();
        student.studentDetails();
        this.loadCustomerProperties();
    }

    private void loadCustomerProperties(){
        log.info("================Customer Details===========");
        logger.debug("Method has called from Started Class");
        log.info("Customer name :{}", custom.getName());
        log.info("Customer address :{}", custom.getAddress());
        log.info("Customer idNo :{}", custom.getIdNo());


    }


}
