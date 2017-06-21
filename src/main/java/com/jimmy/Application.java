package com.jimmy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.system.EmbeddedServerPortFileWriter;
import org.springframework.context.annotation.Bean;

/**
 * Created by Jimmy on 2017/6/20.
 */

@SpringBootApplication
public class Application {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

}
