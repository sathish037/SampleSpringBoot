/*
 * Copyright (C) 2000-2016 MVI Technologies (S) Pte Ltd. All Rights Reserved.
 *
 * This software is the proprietary information of MVI Technologies (S) Pte Ltd. Use is subject to
 * license terms.
 *
 */
package mvi.upop.config;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;



/**
 * 
 * @author Vignesh
 * @version "1.0"
 * @created on 10-May-2017, 14:36:30 pm IST
 * @desc Initalize the spring boot and starts the application
 */
@SpringBootApplication
@ComponentScan("mvi")
public class Application extends SpringBootServletInitializer {

    private static Logger logger = Logger.getLogger(Application.class);

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {
        logger.info("Starting executing springBoot.....");
        PropertyConfigurator.configure("./conf/log4j.properties");
        SpringApplication.run(Application.class, args);
    }

}
