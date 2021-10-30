package org.log4j.hometask;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class App {
    private static Logger logger = LogManager.getLogger("App");

    public static void main(String[] args) {
        logger.info("Some message");
        logger.warn("There's some bug");
        Logger fileLog = LogManager.getLogger("org.apache.log4j.xml");
        fileLog.debug("Write in file!");
    }
}

