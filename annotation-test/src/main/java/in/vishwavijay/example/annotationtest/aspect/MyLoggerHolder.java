package in.vishwavijay.example.annotationtest.aspect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public aspect MyLoggerHolder {
    public static interface Loggable {
        Logger logger = LoggerFactory.getLogger(Logger.class);
    }

    declare parents : (@MyLogger *) implements Loggable;


}
