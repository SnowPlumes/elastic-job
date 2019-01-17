package me.lv;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author lv
 */
@SpringBootApplication
public class JobApplication {

    private static Logger logger = LoggerFactory.getLogger(JobApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(JobApplication.class, args);
        logger.info(">>>>>> JobApplication running ......");
    }
}
