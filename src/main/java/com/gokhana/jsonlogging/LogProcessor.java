package com.gokhana.jsonlogging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class LogProcessor {

    private final static Logger logger = LogManager.getLogger("LOGGER_WITH_JSON_LAYOUT");

    @PostConstruct
    private void jokeLogger() {
        logger.info("Cold jokes about programming!");
        logger.info("Programmer: A machine that turns coffee into code.");
        logger.debug("If debugging is the process of removing bugs, then programming must be the process of putting them in.");
        try {
            throw new RuntimeException("There are two ways to write error-free programs; only the third works.");
        } catch (Exception ex) {
            logger.error(ex.getMessage());
        }
    }
}